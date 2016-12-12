package org.lobo.chupirecetas.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PLANIFICACION_MENU",schema="chupi_recetas")
public class PlanificacionMenu extends AuditableEntity{

	@EmbeddedId
	private PlanificacionMenuPK id;
	
	@Column(name="FECHA")
	private Date fecha;
	
	
	public PlanificacionMenuPK getId() {
		return id;
	}
	public void setId(PlanificacionMenuPK id) {
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
		PlanificacionMenu other = (PlanificacionMenu) obj;
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
