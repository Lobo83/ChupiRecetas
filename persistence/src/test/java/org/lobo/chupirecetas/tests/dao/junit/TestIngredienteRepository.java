package org.lobo.chupirecetas.tests.dao.junit;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lobo.chupirecetas.persistence.entity.Ingrediente;
import org.lobo.chupirecetas.persistence.repository.JPAIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/DataSourceTestApplicationContext.xml",
		"classpath:spring/TransactionTestApplicationContext.xml",
		"classpath:spring/DAOApplicationContext.xml"})
public class TestIngredienteRepository {

	@Autowired
	private JPAIngredienteRepository ingredienteRepository;
	
	@Test
	public void findAll(){
		Ingrediente ingrediente = new Ingrediente();
		Date now = new Date();
		Timestamp timeStamp=new Timestamp(now.getTime());
		ingrediente.setFechaActualizacion(timeStamp);
		ingrediente.setFechaCreacion(timeStamp);
		ingrediente.setNombre("Perejil");
		ingrediente.setUsuarioActualizacion("Lobo");
		ingrediente.setUsuarioCreacion("Lobo");
		
		ingredienteRepository.saveAndFlush(ingrediente );
		List<Ingrediente> ingredientes=ingredienteRepository.findAll();
		
		Assert.assertTrue("ingredientes no encontrados", ingredientes.size()>0);
	}
	
	@Test
	public void deleteAll(){
		
		ingredienteRepository.deleteAll();
		List<Ingrediente> ingredientes=ingredienteRepository.findAll();
		
		Assert.assertTrue("ingredientes encontrados", ingredientes.size()==0);
	}
}
