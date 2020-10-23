package ar.edu.ucc.arqSoft.rentService.test.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ArqSoft.rentService.Service.dao.AlquilerDao;
import ar.edu.ArqSoft.rentService.Service.dao.SocioDao;
import ar.edu.ArqSoft.rentService.Service.model.Alquiler;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional
public class AlquilerDaoTest{
	

	private static final Logger logger = LogManager.getLogger(AlquilerDaoTest.class);
	
	@Autowired
	private AlquilerDao alquilerDao;
	@Test
	public void testRegister() {

		logger.info("Test de Registro de State");
		Alquiler alquiler = new Alquiler();
		alquiler.setPelicula("Juego de gemelas"); // como hago aca?

		alquilerDao.insert(alquiler);
	//	Assert.assertEquals());// y aca?
		return;
	}
}