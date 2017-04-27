package org.lobo.chupirecetas.persistence.dao;

import org.lobo.chupirecetas.persistence.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuDAO extends JpaRepository<Menu, Long> {

}
