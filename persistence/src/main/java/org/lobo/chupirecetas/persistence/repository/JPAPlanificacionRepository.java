package org.lobo.chupirecetas.persistence.repository;

import org.lobo.chupirecetas.persistence.entity.Planificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repositorio para consultas de la entidad Planificacion
 * @author Lobo
 *
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public interface JPAPlanificacionRepository extends JpaRepository<Planificacion, Long> {

}
