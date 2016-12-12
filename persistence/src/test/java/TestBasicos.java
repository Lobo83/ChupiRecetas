


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lobo.chupirecetas.persistence.dao.JPAGenericDAO;
import org.lobo.chupirecetas.persistence.entity.Cliente;
import org.lobo.chupirecetas.persistence.repository.JPAClienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/DataSourceTestApplicationContext.xml",
		"classpath:spring/TransactionTestApplicationContext.xml",
		"classpath:spring/DAOApplicationContext.xml"})
public class TestBasicos {

	@Autowired
	private JPAClienteRepository clienteRepository;
	@Autowired
	private JPAGenericDAO jpaGenericDAO;
	private static final Logger LOGGER = LoggerFactory.getLogger(TestBasicos.class);
	@Test
	public void testJpaClienteDao(){
		Cliente cliente = new Cliente();
		cliente.setApellido1("loco");
		List<Cliente> result=null;

		try {
			result=clienteRepository.findByApellido1("loco");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.info("numero de clientes recuperados ----------------> {}",result.size());
		for(Cliente c : result){
			LOGGER.info("Cliente recuperado "+c.toString());	
		}
		
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testJpaGenericDao(){
		Cliente cliente = new Cliente();
		cliente.setApellido1("loco");
		List<Cliente> result=null;

		try {
			
			result=(List<Cliente>) jpaGenericDAO.executeQueryByCriteria(cliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.info("numero de clientes recuperados ----------------> {}",result.size());
		for(Cliente c : result){
			LOGGER.info("Cliente recuperado "+c.toString());	
		}
		
	}
	
	
}
