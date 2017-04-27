package org.lobo.chupirecetas.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="RECETA_TAG",schema="chupi_recetas")
public class RecetaTag extends AuditableEntity {

	@EmbeddedId
	private RecetaTagPK id;

	public RecetaTagPK getId() {
		return id;
	}

	public void setId(RecetaTagPK id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RecetaTag [id=" + id + "]";
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
		RecetaTag other = (RecetaTag) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
