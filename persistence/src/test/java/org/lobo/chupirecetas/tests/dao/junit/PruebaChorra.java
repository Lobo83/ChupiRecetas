package org.lobo.chupirecetas.tests.dao.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/DataSourceTestApplicationContext.xml",
		"classpath:spring/TransactionTestApplicationContext.xml",
		"classpath:spring/DAOApplicationContext.xml"})
public class PruebaChorra {

	@Test
	public void testJpaClienteDao(){}
}
