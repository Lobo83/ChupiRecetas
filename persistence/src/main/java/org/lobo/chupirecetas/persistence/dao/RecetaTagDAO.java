package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.RecetaTag;
import org.lobo.chupirecetas.persistence.entity.RecetaTagPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaTagDAO extends JpaRepository<RecetaTag, RecetaTagPK> {

}
