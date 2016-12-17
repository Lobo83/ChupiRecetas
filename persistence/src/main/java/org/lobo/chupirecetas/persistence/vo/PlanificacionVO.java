package org.lobo.chupirecetas.persistence.vo;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

public class PlanificacionVO {
	@MappingId(id="idPlanificacion")
	private Long id;
	@MappingId(id="fechaIniPlanificacion")
	private Date fechaIni;
	@MappingId(id="fechaFinPlanificacion")
	private Date fechaFin;
	
	private List<MenuVO> menus;
	
	private Map<Long, Date> menuFecha;

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

	public List<MenuVO> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuVO> menus) {
		this.menus = menus;
	}

	public Map<Long, Date> getMenuFecha() {
		return menuFecha;
	}

	public void setMenuFecha(Map<Long, Date> menuFecha) {
		this.menuFecha = menuFecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaIni == null) ? 0 : fechaIni.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((menuFecha == null) ? 0 : menuFecha.hashCode());
		result = prime * result + ((menus == null) ? 0 : menus.hashCode());
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
		PlanificacionVO other = (PlanificacionVO) obj;
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
		if (menuFecha == null) {
			if (other.menuFecha != null)
				return false;
		} else if (!menuFecha.equals(other.menuFecha))
			return false;
		if (menus == null) {
			if (other.menus != null)
				return false;
		} else if (!menus.equals(other.menus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlanificacionVO [id=" + id + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", menus=" + menus
				+ ", menuFecha=" + menuFecha + "]";
	}
	
	
	
}
