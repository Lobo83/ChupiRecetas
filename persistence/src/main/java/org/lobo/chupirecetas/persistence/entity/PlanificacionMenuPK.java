package org.lobo.chupirecetas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PlanificacionMenuPK implements Serializable {

	private static final long serialVersionUID = 1218951190025960866L;

	@Column(name="PLANIFICACION_ID", nullable=false)
	private Long planificacionId;
	
	@Column(name="MENU_ID", nullable=false)
	private Long menuId;

	public Long getPlanificacionId() {
		return planificacionId;
	}

	public void setPlanificacionId(Long planificacionId) {
		this.planificacionId = planificacionId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return "PlanificacionMenuPK [planificacionId=" + planificacionId + ", menuId=" + menuId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
		result = prime * result + ((planificacionId == null) ? 0 : planificacionId.hashCode());
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
		PlanificacionMenuPK other = (PlanificacionMenuPK) obj;
		if (menuId == null) {
			if (other.menuId != null)
				return false;
		} else if (!menuId.equals(other.menuId))
			return false;
		if (planificacionId == null) {
			if (other.planificacionId != null)
				return false;
		} else if (!planificacionId.equals(other.planificacionId))
			return false;
		return true;
	}
	
	
	
}
