package org.lobo.chupirecetas.persistence.dto;

import java.io.Serializable;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

public class PlanificacionMenuPKDTO implements Serializable {

	private static final long serialVersionUID = 1218951190025960866L;
	@MappingId(id="idPlanificacion")
	private Long planificacionId;
	@MappingId(id="idMenu")
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
		PlanificacionMenuPKDTO other = (PlanificacionMenuPKDTO) obj;
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
