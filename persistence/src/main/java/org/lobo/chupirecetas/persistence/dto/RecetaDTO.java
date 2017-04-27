package org.lobo.chupirecetas.persistence.dto;

import java.math.BigDecimal;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;


public class RecetaDTO extends AuditableDTO{

	
	@MappingId(id="idReceta")
	private Long id;
	
	
	@MappingId(id="nombreReceta")
	private String nombre;
	
	@MappingId(id="imagenReceta")
	private String imagen;
	
	
	@MappingId(id="caloriasReceta")
	private BigDecimal calorias;

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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public BigDecimal getCalorias() {
		return calorias;
	}

	public void setCalorias(BigDecimal calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "RecetaDTO [id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + ", calorias=" + calorias + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calorias == null) ? 0 : calorias.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		RecetaDTO other = (RecetaDTO) obj;
		if (calorias == null) {
			if (other.calorias != null)
				return false;
		} else if (!calorias.equals(other.calorias))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imagen == null) {
			if (other.imagen != null)
				return false;
		} else if (!imagen.equals(other.imagen))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
