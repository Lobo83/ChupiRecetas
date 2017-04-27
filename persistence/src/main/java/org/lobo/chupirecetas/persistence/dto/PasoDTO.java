package org.lobo.chupirecetas.persistence.dto;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

public class PasoDTO extends AuditableDTO{
	@MappingId(id="idPaso")
	private Long id;
	
	private Long recetaId;
	
	@MappingId(id="descripcionPaso")
	private String descripcion;
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRecetaId() {
		return recetaId;
	}

	public void setRecetaId(Long recetaId) {
		this.recetaId = recetaId;
	}

	@Override
	public String toString() {
		return "PasoDTO [id=" + id + ", recetaId=" + recetaId + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((recetaId == null) ? 0 : recetaId.hashCode());
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
		PasoDTO other = (PasoDTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (recetaId == null) {
			if (other.recetaId != null)
				return false;
		} else if (!recetaId.equals(other.recetaId))
			return false;
		return true;
	}

	

}
