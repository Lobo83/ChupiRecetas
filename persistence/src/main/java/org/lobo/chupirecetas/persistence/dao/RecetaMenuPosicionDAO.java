package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.RecetaMenuPosicion;
import org.lobo.chupirecetas.persistence.entity.RecetaMenuPosicionPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaMenuPosicionDAO extends JpaRepository<RecetaMenuPosicion, RecetaMenuPosicionPK> {

}
