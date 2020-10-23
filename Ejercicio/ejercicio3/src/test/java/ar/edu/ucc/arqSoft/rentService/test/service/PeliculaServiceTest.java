package ar.edu.ucc.arqSoft.rentService.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ArqSoft.rentService.Service.Services.PeliculaService;
import ar.edu.ArqSoft.rentService.Service.dto.PeliculaResponseDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class PeliculaServiceTest{
	
	@Autowired
	private PeliculaService peliculaService;
	
	@Test
	public void testFindById() {
		PeliculaResponseDto response = peliculaService.getPeliculaById((long) 2);
		
		Assert.assertEquals("Juego de Gemelas", response.getName());
		return;
	}
}