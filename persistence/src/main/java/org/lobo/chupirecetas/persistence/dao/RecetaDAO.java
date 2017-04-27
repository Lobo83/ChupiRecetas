package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaDAO extends JpaRepository<Receta, Long> {

}
