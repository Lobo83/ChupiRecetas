package org.lobo.chupirecetas.persistence.dto;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

public class IngredienteDTO extends AuditableDTO {

	@MappingId(id="id")
	private Long id;
	
	@MappingId(id="nombre")
	private String nombre;
	
	@MappingId(id="tipoIngredienteId")
	private Long tipoIngredienteId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getTipoIngredienteId() {
		return tipoIngredienteId;
	}

	public void setTipoIngredienteId(Long tipoIngredienteId) {
		this.tipoIngredienteId = tipoIngredienteId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tipoIngredienteId == null) ? 0 : tipoIngredienteId.hashCode());
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
		IngredienteDTO other = (IngredienteDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipoIngredienteId == null) {
			if (other.tipoIngredienteId != null)
				return false;
		} else if (!tipoIngredienteId.equals(other.tipoIngredienteId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IngredienteDTO [id=" + id + ", nombre=" + nombre + ", tipoIngredienteId=" + tipoIngredienteId + "]";
	}
	
	
}
