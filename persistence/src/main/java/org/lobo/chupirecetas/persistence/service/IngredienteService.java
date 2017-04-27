package org.lobo.chupirecetas.persistence.service;

import org.lobo.chupirecetas.persistence.dto.IngredienteDTO;

public interface IngredienteService {

	/**
	 * Guarda (salva o actualiza) en BBDD el ingrediente pasado por parámetro
	 * @param ingrediente
	 * @return
	 */
	IngredienteDTO saveIngrediente(IngredienteDTO ingrediente);
	
		
	/**
	 * Borra de BBDD el ingrediente pasado por parámetro
	 * @param ingrediente
	 */
	void deleteIngrediente(IngredienteDTO ingrediente);
}
