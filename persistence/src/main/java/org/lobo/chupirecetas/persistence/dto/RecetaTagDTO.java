package org.lobo.chupirecetas.persistence.dto;

public class RecetaTagDTO extends AuditableDTO{


	private RecetaTagPKDTO id;

	public RecetaTagPKDTO getId() {
		return id;
	}

	public void setId(RecetaTagPKDTO id) {
		this.id = id;
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
		RecetaTagDTO other = (RecetaTagDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "RecetaTagDTO [id=" + id + "]";
	}

}
