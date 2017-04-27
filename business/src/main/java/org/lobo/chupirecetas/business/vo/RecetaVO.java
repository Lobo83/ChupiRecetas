package org.lobo.chupirecetas.business.vo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * VO de la entidad de dominio ingrediente
 * @author Lobo
 *
 */
public class RecetaVO {
	private Long id;
	
	private String nombre;
	
	private String imagen;
	
	private BigDecimal calorias;
	
	private List<IngredienteVO> ingredientes;
	
	private Map<Long, List<Object>> ingredienteCantidadMedida;
	
	private List<PasoVO> pasos;

	/**
	 * Devuelve la cantidad de un ingrediente para una receta
	 * @param idIngrediente
	 * @return
	 */
	public BigDecimal getCantidadIngrediente(Long idIngrediente){
		return (BigDecimal) this.ingredienteCantidadMedida.get(idIngrediente).get(0);
	}
	/**
	 * Devuelve el identificador de la medida de un ingrediente para una receta
	 * @param idIngrediente
	 * @return
	 */
	public Long getIdMedidaIngrediente(Long idIngrediente){
		return (Long) this.ingredienteCantidadMedida.get(idIngrediente).get(1);
	}

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

	public List<IngredienteVO> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<IngredienteVO> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Map<Long, List<Object>> getIngredienteCantidadMedida() {
		return ingredienteCantidadMedida;
	}

	public void setIngredienteCantidadMedida(Map<Long, List<Object>> ingredienteCantidadMedida) {
		this.ingredienteCantidadMedida = ingredienteCantidadMedida;
	}

	public List<PasoVO> getPasos() {
		return pasos;
	}

	public void setPasos(List<PasoVO> pasos) {
		this.pasos = pasos;
	}

	@Override
	public String toString() {
		return "RecetaVO [id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + ", calorias=" + calorias
				+ ", ingredientes=" + ingredientes + ", ingredienteCantidadMedida=" + ingredienteCantidadMedida
				+ ", pasos=" + pasos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calorias == null) ? 0 : calorias.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
		result = prime * result + ((ingredienteCantidadMedida == null) ? 0 : ingredienteCantidadMedida.hashCode());
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pasos == null) ? 0 : pasos.hashCode());
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
		RecetaVO other = (RecetaVO) obj;
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
		if (ingredienteCantidadMedida == null) {
			if (other.ingredienteCantidadMedida != null)
				return false;
		} else if (!ingredienteCantidadMedida.equals(other.ingredienteCantidadMedida))
			return false;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pasos == null) {
			if (other.pasos != null)
				return false;
		} else if (!pasos.equals(other.pasos))
			return false;
		return true;
	}
		
	
	
}
