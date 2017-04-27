package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.PlanificacionMenu;
import org.lobo.chupirecetas.persistence.entity.PlanificacionMenuPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanificacionMenuDAO extends JpaRepository<PlanificacionMenu, PlanificacionMenuPK> {

}
