package org.lobo.chupirecetas.persistence.dto;

public class RecetaMenuPosicionDTO extends AuditableDTO{

	private RecetaMenuPosicionPKDTO id;

	public RecetaMenuPosicionPKDTO getId() {
		return id;
	}

	public void setId(RecetaMenuPosicionPKDTO id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RecetaMenuPosicionDTO [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
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
		RecetaMenuPosicionDTO other = (RecetaMenuPosicionDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

		
	
}