package org.lobo.chupirecetas.persistence.dto;

import java.io.Serializable;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

public class RecetaTagPK implements Serializable{

	private static final long serialVersionUID = -200846588395436068L;
	@MappingId(id="idReceta")
	private Long recetaId;
	@MappingId(id="idTag")
	private Long tagId;

	public Long getRecetaId() {
		return recetaId;
	}
	public void setRecetaId(Long recetaId) {
		this.recetaId = recetaId;
	}
	public Long getTagId() {
		return tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
	@Override
	public String toString() {
		return "RecetaTagPK [recetaId=" + recetaId + ", tagId=" + tagId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recetaId == null) ? 0 : recetaId.hashCode());
		result = prime * result + ((tagId == null) ? 0 : tagId.hashCode());
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
		RecetaTagPK other = (RecetaTagPK) obj;
		if (recetaId == null) {
			if (other.recetaId != null)
				return false;
		} else if (!recetaId.equals(other.recetaId))
			return false;
		if (tagId == null) {
			if (other.tagId != null)
				return false;
		} else if (!tagId.equals(other.tagId))
			return false;
		return true;
	}
	
	
}
