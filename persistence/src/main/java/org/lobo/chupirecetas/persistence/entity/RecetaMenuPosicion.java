package org.lobo.chupirecetas.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MENU_RECETA_POSICION",schema="chupi_recetas")
public class RecetaMenuPosicion extends AuditableEntity {

	@EmbeddedId
	private RecetaMenuPosicionPK id;

	public RecetaMenuPosicionPK getId() {
		return id;
	}

	public void setId(RecetaMenuPosicionPK id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RecetaMenuPosicion [id=" + id + "]";
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
		RecetaMenuPosicion other = (RecetaMenuPosicion) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

		
	
}
