package org.lobo.chupirecetas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IngredienteRecetaMedidaPK implements Serializable{

	
	private static final long serialVersionUID = -7219461669857204600L;

	@Column(name="INGREDIENTE_ID", nullable=false)
	private Long ingredienteId;
	@Column(name="RECETA_ID", nullable=false)
	private Long recetaId;
	@Column(name="MEDIDA_ID", nullable=false)
	private Long medidaId;
	public Long getIngredienteId() {
		return ingredienteId;
	}
	public void setIngredienteId(Long ingredienteId) {
		this.ingredienteId = ingredienteId;
	}
	public Long getRecetaId() {
		return recetaId;
	}
	public void setRecetaId(Long recetaId) {
		this.recetaId = recetaId;
	}
	public Long getMedidaId() {
		return medidaId;
	}
	public void setMedidaId(Long medidaId) {
		this.medidaId = medidaId;
	}
	@Override
	public String toString() {
		return "IngredienteRecetaMedidaPK [ingredienteId=" + ingredienteId + ", recetaId=" + recetaId + ", medidaId="
				+ medidaId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingredienteId == null) ? 0 : ingredienteId.hashCode());
		result = prime * result + ((medidaId == null) ? 0 : medidaId.hashCode());
		result = prime * result + ((recetaId == null) ? 0 : recetaId.hashCode());
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
		IngredienteRecetaMedidaPK other = (IngredienteRecetaMedidaPK) obj;
		if (ingredienteId == null) {
			if (other.ingredienteId != null)
				return false;
		} else if (!ingredienteId.equals(other.ingredienteId))
			return false;
		if (medidaId == null) {
			if (other.medidaId != null)
				return false;
		} else if (!medidaId.equals(other.medidaId))
			return false;
		if (recetaId == null) {
			if (other.recetaId != null)
				return false;
		} else if (!recetaId.equals(other.recetaId))
			return false;
		return true;
	}
	
	
}
