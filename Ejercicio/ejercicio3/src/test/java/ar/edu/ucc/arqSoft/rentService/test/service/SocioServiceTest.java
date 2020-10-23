package ar.edu.ucc.arqSoft.rentService.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ArqSoft.rentService.Service.Services.SocioService;
import ar.edu.ArqSoft.rentService.Service.dto.SocioRequestDto;
import ar.edu.ArqSoft.rentService.Service.dto.SocioResponseDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class SocioServiceTest{
	
	@Autowired
	private SocioService socioService;
	
	@Test
	public void testInsert() {
		SocioRequestDto request = new SocioRequestDto();
		request.setName("Pilar");
		request.setLastName("Lopez");
		request.setDni((long) 40940842);
		request.setEmail("pilarlopez@gmail.com");
		
		
		SocioResponseDto response = socioService.registrarSocio(request);
		
		Assert.assertEquals("Pilar",response.getName());
		return;
	}
}