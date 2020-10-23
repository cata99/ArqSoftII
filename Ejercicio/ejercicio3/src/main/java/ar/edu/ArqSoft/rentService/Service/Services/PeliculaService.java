package ar.edu.ArqSoft.rentService.Service.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ArqSoft.rentService.Common.dto.ModelDtoConverter;
import ar.edu.ArqSoft.rentService.Service.dao.PeliculaDao;
import ar.edu.ArqSoft.rentService.Service.dto.*;
import ar.edu.ArqSoft.rentService.Service.model.Pelicula;

@Service
@Transactional
public class PeliculaService{
	
	@Autowired
	private PeliculaDao peliculaDao;
	
	
	public PeliculaResponseDto getPeliculaById (Long id) { // no deberia devolver una lista de peliculas con el mismo id?
		
		Pelicula pelicula = peliculaDao.load(id);
		
		PeliculaResponseDto response = new PeliculaResponseDto();
		response.setName(pelicula.getName());
		
		return response;
		
	}
	
	public List<PeliculaResponseDto> getAll(){
		List<Pelicula> peliculas = peliculaDao.getAll();
		
		List<PeliculaResponseDto> response = new ArrayList<PeliculaResponseDto>();
		for (Pelicula pelicula : peliculas) {
			response.add((PeliculaResponseDto) new ModelDtoConverter().convertToDto(pelicula, new PeliculaResponseDto()));
			}
		return response;
	}
	
}
