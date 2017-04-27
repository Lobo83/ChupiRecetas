package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.Planificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanificacionDAO extends JpaRepository<Planificacion, Long> {

}
