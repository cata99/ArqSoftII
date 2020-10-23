package ar.edu.ucc.arqSoft.rentService.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ArqSoft.rentService.Service.Services.AlquilerService;
import ar.edu.ArqSoft.rentService.Service.dto.AlquilerRequestDto;
import ar.edu.ArqSoft.rentService.Service.dto.AlquilerResponseDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class AlquilerServiceTest{
	
	@Autowired
	private AlquilerService alquilerService;
	
	@Test
	public void testInsert() {
		AlquilerRequestDto request = new AlquilerRequestDto();
		request.setPeliculaId((long) 1);
		request.setSocioId((long) 1);
		
		AlquilerResponseDto response = alquilerService.registrarAlquiler(request);
		
		Assert.assertEquals("1",response.getPelicula());
		return;
	}
}