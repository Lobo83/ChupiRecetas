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

	
	
	
	public IngredienteRecetaMedidaPK getId() {
		return id;
	}




	public void setId(IngredienteRecetaMedidaPK id) {
		this.id = id;
	}




	public BigDecimal getCantidad() {
		return cantidad;
	}




	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}




	@Override
	public String toString() {
		return "IngredienteRecetaMedida [id=" + id + ", cantidad=" + cantidad + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		IngredienteRecetaMedida other = (IngredienteRecetaMedida) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
