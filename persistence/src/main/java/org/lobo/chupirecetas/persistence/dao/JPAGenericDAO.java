package org.lobo.chupirecetas.persistence.dao;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.lobo.chupirecetas.persistence.parameter.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Lobo
 *
 * @param <T>
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly = true)
public class JPAGenericDAO{
	

	private static final Logger LOGGER = LoggerFactory.getLogger(JPAGenericDAO.class);
	
	 @PersistenceContext
	private EntityManager entityManager;
	

	
	
  /**
   * De la Entidad pasada por argumento extrae los valores de sus campos (exceptuando campos de relacion con otras entidades), compone la query y la ejecuta devolviendo el listado de entidades que casen los datos pasados como filtro
   * @param entity
   * @return
   * @throws Exception
   */
	public List<?> executeQueryByCriteria(final Object entity) throws Exception{
		StringBuffer query = new StringBuffer();
		//Se construye la query JPQL
		//Paso 1: Inicializar el primer statement
		query.append("SELECT entity FROM ").append(entity.getClass().getName()).append(" entity WHERE ");
		//Paso 2: Constuir la lista de parametros
		buildJPQL(entity,query,0);
		//Paso 3: Se elimina el último AND
		String jpql = query.substring(0, query.length()-5);
		LOGGER.info("La query que se va a ejecutar es {}",jpql);
		//Paso 4: Se extraen los parametros de consulta de la entidad
		List<Parameter> parametros = new ArrayList<>();
		extractParameter(entity,parametros,0);
		//Paso 5: Ejecucion de la query y devolucion del resultado
		
		return executeQueryByCriteria(jpql,entity, parametros.toArray(new Parameter[parametros.size()]));
	}
	
/**
 * Método para realizar consultas sobre una entidad via JPQL
 * @param query
 * @param parameters
 * @return
 */
	private List<?> executeQueryByCriteria(String query, Object entidad,Parameter... parameters){
		 
		 TypedQuery<?> typedQuery = this.entityManager.createQuery(query, entidad.getClass());
		for(Parameter parameter:parameters){
			typedQuery.setParameter(parameter.getNombre(), parameter.getValor());
		}
		
		return typedQuery.getResultList();
	}
	
	/**
	 * Extrae los valores de los campos de una entidad y crea un listado de parametros para ejecucion de Queries
	 * @param entity
	 * @param parameters
	 * @param recursionLevel
	 * @throws Exception 
	 * @throws KjofTechnicalException
	 */
	private void extractParameter(final Object entity, final List<Parameter> parameters, int recursionLevel) throws Exception {//NOPMD Necesario control de nivel de recursion
		if(recursionLevel==2){//Implementacion de seguridad para evitar recursion infinita
			return;
		}
		Field[] entityFields = entity.getClass().getDeclaredFields();
		for(Field field : entityFields){
			try {
				if(field.isAnnotationPresent(Column.class)){//Columna simple
					//No se quieren columnas de union ya que son joins encubiertos. Para eso hacer una query
					Method m = new PropertyDescriptor(field.getName(), entity.getClass()).getReadMethod();
					Object value = m.invoke(entity);
					Parameter p = new Parameter();
					p.setNombre(field.getName());
					p.setValor(value);
					parameters.add(p);
				
					
				}else if(field.isAnnotationPresent(EmbeddedId.class)){//Clave embebida. Se requiere un nivel de recursion
					Method method = new PropertyDescriptor(field.getName(), entity.getClass()).getReadMethod();
					Object value = method.invoke(entity);
					extractParameter(value,parameters,recursionLevel++);
				}
					
			}catch (InvocationTargetException|IntrospectionException|IllegalAccessException e) {
				LOGGER.error("Error obteniendo parametros para la ejecucion de la query por criterios de la entidad "+entity.getClass().getName(), e);
				throw e;
			} 
		}
		
	}
	/**
	 * Crea una query JPQL con todos los campos de la entidad
	 * @param entity
	 * @param query
	 * @param recursionLevel
	 * @throws Exception
	 */
	private void buildJPQL(final Object entity, StringBuffer query, int recursionLevel) throws Exception{
		
		if(recursionLevel==2){//Implementacion de seguridad para evitar recursion infinita
			return;
		}
		Field[] entityFields = entity.getClass().getDeclaredFields();
		for(Field field : entityFields){
			try {
				if(field.isAnnotationPresent(Column.class)){//Columna simple
					//Da como resultado: (campo is null OR entity.campo=:campo) AND
					query.append("(:").append(field.getName()).append(" is null OR entity.").
					append(field.getName()).append(" = :").append(field.getName()).append(") AND ");
				
					
				}else if(field.isAnnotationPresent(EmbeddedId.class)){//Clave embebida. Se requiere un nivel de recursion
					Method method = new PropertyDescriptor(field.getName(), entity.getClass()).getReadMethod();
					Object value = method.invoke(entity);
					buildJPQL(value,query,recursionLevel++);
				}
					
			}catch (InvocationTargetException|IntrospectionException|IllegalAccessException e) {
				LOGGER.error("Error obteniendo parametros para la ejecucion de la query por criterios de la entidad "+entity.getClass().getName(), e);
				throw e;
			} 
		}
	}
}
