package org.lobo.chupirecetas.persistence.repository;

import org.lobo.chupirecetas.persistence.entity.RecetaTag;
import org.lobo.chupirecetas.persistence.entity.RecetaTagPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repositorio para consultas de la entidad RecetaTag 
 * @author Lobo
 *
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public interface JPARecetaTagRepository extends JpaRepository<RecetaTag, RecetaTagPK> {

}
