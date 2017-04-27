package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.IngredienteRecetaMedida;
import org.lobo.chupirecetas.persistence.entity.IngredienteRecetaMedidaPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRecetaMedidaDAO extends JpaRepository<IngredienteRecetaMedida, IngredienteRecetaMedidaPK> {

}
