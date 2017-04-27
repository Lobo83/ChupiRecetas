package org.lobo.chupirecetas.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

@Entity
@Table(name="TIPO_INGREDIENTE",schema="chupi_recetas")
public class TipoIngrediente extends AuditableEntity {

	@Id
	@Column(name="ID", nullable=false)
	@GeneratedValue
	@MappingId(id="idTipoIngrediente")
	private Long id;
	
	@Column(name="NOMBRE", nullable=false)
	@MappingId(id="nombreTipoIngrediente")
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		TipoIngrediente other = (TipoIngrediente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoIngrediente [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
