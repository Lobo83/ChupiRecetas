package org.lobo.chupirecetas.persistence.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.lobo.chupirecetas.persistence.mapper.annotation.InspectInside;
import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

@Entity
@Table(name="INGREDIENTE_RECETA_MEDIDA",schema="chupi_recetas")
public class IngredienteRecetaMedida extends AuditableEntity {

	@EmbeddedId
	@InspectInside
	private IngredienteRecetaMedidaPK id;
	@Column(name="CANTIDAD", precision=3, scale=2)
	@MappingId(id="cantidadIngrediente")
	private BigDecimal cantidad;
}
