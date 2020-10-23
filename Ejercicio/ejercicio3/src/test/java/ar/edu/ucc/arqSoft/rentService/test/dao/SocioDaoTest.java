package ar.edu.ucc.arqSoft.rentService.test.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ArqSoft.rentService.Service.dao.SocioDao;
import ar.edu.ArqSoft.rentService.Service.model.Socio;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional
public class SocioDaoTest{

	private static final Logger logger = LogManager.getLogger(SocioDaoTest.class);
	
	@Autowired
	private SocioDao socioDao;
	
	@Test
	public void testRegister() {

		logger.info("Test de Registro de State");
		Socio socio = new Socio();
		socio.setName("Pedro");

		socioDao.insert(socio);
	//	Assert.assertEquals();
		return;
	}
}