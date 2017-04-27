package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.Paso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasoDAO extends JpaRepository<Paso, Long> {

}
