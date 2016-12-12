package org.lobo.chupirecetas.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PASO",schema="chupi_recetas")
public class Paso extends AuditableEntity {
	@Id
	@Column(name="ID", nullable=false)
	@GeneratedValue
	private Long id;
	
	@Column(name="RECETA_ID")
	private Long recetaId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRecetaId() {
		return recetaId;
	}

	public void setRecetaId(Long recetaId) {
		this.recetaId = recetaId;
	}

	@Override
	public String toString() {
		return "Paso [id=" + id + ", recetaId=" + recetaId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((recetaId == null) ? 0 : recetaId.hashCode());
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
		Paso other = (Paso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (recetaId == null) {
			if (other.recetaId != null)
				return false;
		} else if (!recetaId.equals(other.recetaId))
			return false;
		return true;
	}

	

}
