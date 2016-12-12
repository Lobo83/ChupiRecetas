package org.lobo.chupirecetas.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="INGREDIENTE_RECETA_MEDIDA",schema="chupi_recetas")
public class IngredienteRecetaMedida extends AuditableEntity {

	@EmbeddedId
	private IngredienteRecetaMedidaPK id;
}
