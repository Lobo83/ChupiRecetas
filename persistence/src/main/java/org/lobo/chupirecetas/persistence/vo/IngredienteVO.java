package org.lobo.chupirecetas.persistence.vo;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

/**
 * VO de la entidad de dominio ingrediente
 * @author Lobo
 *
 */
public class IngredienteVO {

	@MappingId(id="id")
	private Long id;
	@MappingId(id="nombre")
	private String nombre;
	@MappingId(id="tipoIngredienteId")
	private Long tipoIngredienteId;
	@MappingId(id="nombreTipoIngrediente")
	private String nombreTipoIngrediente;
	
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
	public String getNombreTipoIngrediente() {
		return nombreTipoIngrediente;
	}
	public void setNombreTipoIngrediente(String nombreTipoIngrediente) {
		this.nombreTipoIngrediente = nombreTipoIngrediente;
	}
	@Override
	public String toString() {
		return "IngredienteVO [id=" + id + ", nombre=" + nombre + ", tipoIngredienteId=" + tipoIngredienteId
				+ ", nombreTipoIngrediente=" + nombreTipoIngrediente + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreTipoIngrediente == null) ? 0 : nombreTipoIngrediente.hashCode());
		result = prime * result + ((tipoIngredienteId == null) ? 0 : tipoIngredienteId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IngredienteVO other = (IngredienteVO) obj;
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
		if (nombreTipoIngrediente == null) {
			if (other.nombreTipoIngrediente != null)
				return false;
		} else if (!nombreTipoIngrediente.equals(other.nombreTipoIngrediente))
			return false;
		if (tipoIngredienteId == null) {
			if (other.tipoIngredienteId != null)
				return false;
		} else if (!tipoIngredienteId.equals(other.tipoIngredienteId))
			return false;
		return true;
	}
	
		
	
}
