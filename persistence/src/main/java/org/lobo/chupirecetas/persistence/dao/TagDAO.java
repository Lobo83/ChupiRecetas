package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagDAO extends JpaRepository<Tag, Long> {

}
