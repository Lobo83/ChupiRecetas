package org.lobo.chupirecetas.persistence.dto;

import java.util.Date;

public class PlanificacionMenuDTO extends AuditableDTO{

	private PlanificacionMenuPKDTO id;
	
	private Date fecha;
	
	
	public PlanificacionMenuPKDTO getId() {
		return id;
	}
	public void setId(PlanificacionMenuPKDTO id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "PlanificacionMenu [id=" + id + ", fecha=" + fecha + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
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
		PlanificacionMenuDTO other = (PlanificacionMenuDTO) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
