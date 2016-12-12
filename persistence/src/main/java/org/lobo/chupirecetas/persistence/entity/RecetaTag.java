package org.lobo.chupirecetas.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="RECETA_TAG",schema="chupi_recetas")
public class RecetaTag extends AuditableEntity {

	@EmbeddedId
	private RecetaTagPK id;
	
}
