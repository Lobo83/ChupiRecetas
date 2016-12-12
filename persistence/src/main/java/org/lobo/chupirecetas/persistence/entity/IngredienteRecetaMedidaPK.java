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
}
