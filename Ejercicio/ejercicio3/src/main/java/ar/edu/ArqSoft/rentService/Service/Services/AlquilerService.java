package ar.edu.ArqSoft.rentService.Service.Services;

import java.util.Calendar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.ArqSoft.rentService.Service.dao.AlquilerDao;
import ar.edu.ArqSoft.rentService.Service.dao.PeliculaDao;
import ar.edu.ArqSoft.rentService.Service.dao.SocioDao;
import ar.edu.ArqSoft.rentService.Service.dto.*;
import ar.edu.ArqSoft.rentService.Service.model.Alquiler;

@Service
@Transactional
public class AlquilerService{
	
	@Autowired
	private AlquilerDao alquilerDao;
	
	@Autowired 
	private PeliculaDao peliculaDao;
	
	@Autowired 
	private SocioDao socioDao;
	
	
	public AlquilerResponseDto registrarAlquiler (AlquilerRequestDto request) {
		
		Alquiler alquiler = new Alquiler();
		
		alquiler.setRentDate(Calendar.getInstance().getTime());
		alquiler.setPelicula(peliculaDao.load(request.getPeliculaId()));
		alquiler.setSocio(socioDao.load(request.getSocioId()));
		
		alquilerDao.insert(alquiler);
		
		AlquilerResponseDto response = new AlquilerResponseDto();
		
		response.setApellido(alquiler.getSocio().getLastName());
		response.setPelicula(alquiler.getPelicula().getName());
		response.setFecha(alquiler.getRentDate());
		
		return response;
		
	}
	
}