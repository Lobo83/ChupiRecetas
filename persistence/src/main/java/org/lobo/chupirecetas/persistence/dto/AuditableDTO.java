package org.lobo.chupirecetas.persistence.dto;

import java.sql.Timestamp;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

public class AuditableDTO {
	@MappingId(id="fechaCreacionAudit")
	private Timestamp fechaCreacion;
	@MappingId(id="fechaActualizacionAudit")
	private Timestamp fechaActualizacion;
	@MappingId(id="usuarioCreacionAudit")
	private String usuarioCreacion;
	@MappingId(id="usuarioActualizacionAudit")
	private String usuarioActualizacion;
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Timestamp getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Timestamp fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getUsuarioActualizacion() {
		return usuarioActualizacion;
	}
	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}
	@Override
	public String toString() {
		return "AuditableDTO [fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion
				+ ", usuarioCreacion=" + usuarioCreacion + ", usuarioActualizacion=" + usuarioActualizacion + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaActualizacion == null) ? 0 : fechaActualizacion.hashCode());
		result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result + ((usuarioActualizacion == null) ? 0 : usuarioActualizacion.hashCode());
		result = prime * result + ((usuarioCreacion == null) ? 0 : usuarioCreacion.hashCode());
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
		AuditableDTO other = (AuditableDTO) obj;
		if (fechaActualizacion == null) {
			if (other.fechaActualizacion != null)
				return false;
		} else if (!fechaActualizacion.equals(other.fechaActualizacion))
			return false;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (usuarioActualizacion == null) {
			if (other.usuarioActualizacion != null)
				return false;
		} else if (!usuarioActualizacion.equals(other.usuarioActualizacion))
			return false;
		if (usuarioCreacion == null) {
			if (other.usuarioCreacion != null)
				return false;
		} else if (!usuarioCreacion.equals(other.usuarioCreacion))
			return false;
		return true;
	}
	
}
