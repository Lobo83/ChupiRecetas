package org.lobo.chupirecetas.persistence.dto;

import java.math.BigDecimal;

import org.lobo.chupirecetas.persistence.entity.IngredienteRecetaMedida;
import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

public class IngredienteRecetaMedidaDTO extends AuditableDTO {

	private IngredienteRecetaMedidaPKDTO id;
	@MappingId(id="cantidadIngrediente")
	private BigDecimal cantidad;
	public IngredienteRecetaMedidaPKDTO getId() {
		return id;
	}
	public void setId(IngredienteRecetaMedidaPKDTO id) {
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
		return "IngredienteRecetaMedidaDTO [id=" + id + ", cantidad=" + cantidad + "]";
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
		IngredienteRecetaMedidaDTO other = (IngredienteRecetaMedidaDTO) obj;
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
