package org.lobo.chupirecetas.persistence.repository;

import java.util.List;

import org.lobo.chupirecetas.persistence.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author Lobo
 *
 */
//Anotacion Transactional no es requerida ya que por defecto, JpaRepository la tiene pero asi se asegura que traducciones de excepciones jpa en Spring exception, que corre todo dentro de una sola transaccion...
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public interface JPAClienteRepository extends JpaRepository<Cliente,Long> {
//los metodos findByX generan una JPQL Sustituyendo la X por el nombre del parametro y campo dentro de la entidad. Por eso no hace falta definir la query
	@Transactional(readOnly=true)
	public List<Cliente> findByApellido1(String apellido1);
	

}
