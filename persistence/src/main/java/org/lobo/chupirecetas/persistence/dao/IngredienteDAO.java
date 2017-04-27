package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteDAO extends JpaRepository<Ingrediente, Long> {

}
