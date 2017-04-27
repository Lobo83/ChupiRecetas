package org.lobo.chupirecetas.persistence.dto;

import java.util.Date;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

public class PlanificacionDTO extends AuditableDTO {
	@MappingId(id="idPlanificacion")
	private Long id;
	
	@MappingId(id="fechaIniPlanificacion")
	private Date fechaIni;
	
	@MappingId(id="fechaFinPlanificacion")
	private Date fechaFin;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	@Override
	public String toString() {
		return "PlanificacionDTO [id=" + id + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaIni == null) ? 0 : fechaIni.hashCode());
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
		PlanificacionDTO other = (PlanificacionDTO) obj;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaIni == null) {
			if (other.fechaIni != null)
				return false;
		} else if (!fechaIni.equals(other.fechaIni))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
