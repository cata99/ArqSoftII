package ar.edu.ArqSoft.rentService.Service.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ArqSoft.rentService.Service.dao.SocioDao;
import ar.edu.ArqSoft.rentService.Service.dto.SocioRequestDto;
import ar.edu.ArqSoft.rentService.Service.dto.SocioResponseDto;
import ar.edu.ArqSoft.rentService.Service.model.Socio;

@Service
@Transactional

public class SocioService{
	
	@Autowired
	private SocioDao socioDao;
	
	public SocioResponseDto registrarSocio (SocioRequestDto request) {
		
		Socio socio = new Socio();
		
		socio.setName(request.getName());
		socio.setLastName(request.getLastName());
		socio.setDni(request.getDni());
		socio.setEmail(request.getEmail());
		
		socioDao.insert(socio);
		
		SocioResponseDto response = new SocioResponseDto();
		
		response.setName(socio.getName());
		response.setLastName(socio.getLastName());
		response.setEmail(socio.getEmail());
		response.setDni(socio.getDni());
		
		return response;
	}
}