package org.lobo.chupirecetas.persistence.service.imp;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;

import org.lobo.chupirecetas.persistence.dto.IngredienteDTO;
import org.lobo.chupirecetas.persistence.entity.Ingrediente;
import org.lobo.chupirecetas.persistence.mapper.Mapper;
import org.lobo.chupirecetas.persistence.repository.JPAIngredienteRepository;
import org.lobo.chupirecetas.persistence.service.IngredienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class IngredienteServiceImp implements IngredienteService {

	private static final Logger LOGGER = LoggerFactory.getLogger(IngredienteServiceImp.class);
	@Autowired
	private JPAIngredienteRepository ingredienteRepository;

	/*
	 * (non-Javadoc)
	 * @see org.lobo.chupirecetas.persistence.service.IngredienteService#saveIngrediente(org.lobo.chupirecetas.persistence.dto.IngredienteDTO)
	 */
	@Override
	public IngredienteDTO saveIngrediente(IngredienteDTO ingrediente) {
		Mapper<IngredienteDTO,Ingrediente> mapper = new Mapper<>(IngredienteDTO.class,Ingrediente.class);
		IngredienteDTO result=null;
		try {
			Ingrediente entidad = ingredienteRepository.saveAndFlush(mapper.mapDTO2Entidad(ingrediente));
			result = mapper.mapEntidad2DTO(entidad);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IntrospectionException e) {
			LOGGER.error("Error parseando entidad y dto", e);
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see org.lobo.chupirecetas.persistence.service.IngredienteService#deleteIngrediente(org.lobo.chupirecetas.persistence.dto.IngredienteDTO)
	 */
	@Override
	public void deleteIngrediente(IngredienteDTO ingrediente) {
		Mapper<IngredienteDTO,Ingrediente> mapper = new Mapper<>(IngredienteDTO.class,Ingrediente.class);
		try {
			ingredienteRepository.delete(mapper.mapDTO2Entidad(ingrediente));
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IntrospectionException e) {
			LOGGER.error("Error parseando entidad y dto", e);
		}		
	}
	
	
}
