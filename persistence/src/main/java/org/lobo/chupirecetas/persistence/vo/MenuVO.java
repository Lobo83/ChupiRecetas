package org.lobo.chupirecetas.persistence.vo;

import java.util.List;
import java.util.Map;

import org.lobo.chupirecetas.persistence.mapper.annotation.MappingId;

/**
 * VO de la entidad de dominio ingrediente
 * @author Lobo
 *
 */
public class MenuVO {
	@MappingId(id="idMenu")
	private Long id;
	
	@MappingId(id="descripcionMenu")
	private String descripcion;
	
	private List<RecetaVO> recetas;

	private Map<Long,PosicionPlatoVO> recetaPosicion;
	
	
	

	public Map<Long, PosicionPlatoVO> getRecetaPosicion() {
		return recetaPosicion;
	}

	public void setRecetaPosicion(Map<Long, PosicionPlatoVO> recetaPosicion) {
		this.recetaPosicion = recetaPosicion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<RecetaVO> getRecetas() {
		return recetas;
	}

	public void setRecetas(List<RecetaVO> recetas) {
		this.recetas = recetas;
	}

	@Override
	public String toString() {
		return "MenuVO [id=" + id + ", descripcion=" + descripcion + ", recetas=" + recetas + ", recetaPosicion="
				+ recetaPosicion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((recetaPosicion == null) ? 0 : recetaPosicion.hashCode());
		result = prime * result + ((recetas == null) ? 0 : recetas.hashCode());
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
		MenuVO other = (MenuVO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (recetaPosicion == null) {
			if (other.recetaPosicion != null)
				return false;
		} else if (!recetaPosicion.equals(other.recetaPosicion))
			return false;
		if (recetas == null) {
			if (other.recetas != null)
				return false;
		} else if (!recetas.equals(other.recetas))
			return false;
		return true;
	}
	
	

}
