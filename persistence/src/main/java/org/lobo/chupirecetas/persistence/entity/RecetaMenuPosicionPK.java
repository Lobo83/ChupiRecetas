package org.lobo.chupirecetas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RecetaMenuPosicionPK implements Serializable {

	private static final long serialVersionUID = 2700023664026818572L;
	
	@Column(name="RECETA_ID", nullable=false)
	private Long recetaId;
	@Column(name="MENU_ID", nullable=false)
	private Long menuId;
	@Column(name="POSICION_ID", nullable=false)
	private Long posicionId;
	
	
	
	public Long getRecetaId() {
		return recetaId;
	}



	public void setRecetaId(Long recetaId) {
		this.recetaId = recetaId;
	}



	public Long getMenuId() {
		return menuId;
	}



	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}



	public Long getPosicionId() {
		return posicionId;
	}



	public void setPosicionId(Long posicionId) {
		this.posicionId = posicionId;
	}



	@Override
	public String toString() {
		return "RecetaMenuPK [recetaId=" + recetaId + ", menuId=" + menuId + ", posicionId=" + posicionId + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
		result = prime * result + ((posicionId == null) ? 0 : posicionId.hashCode());
		result = prime * result + ((recetaId == null) ? 0 : recetaId.hashCode());
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
		RecetaMenuPosicionPK other = (RecetaMenuPosicionPK) obj;
		if (menuId == null) {
			if (other.menuId != null)
				return false;
		} else if (!menuId.equals(other.menuId))
			return false;
		if (posicionId == null) {
			if (other.posicionId != null)
				return false;
		} else if (!posicionId.equals(other.posicionId))
			return false;
		if (recetaId == null) {
			if (other.recetaId != null)
				return false;
		} else if (!recetaId.equals(other.recetaId))
			return false;
		return true;
	}



	

	
	
}
