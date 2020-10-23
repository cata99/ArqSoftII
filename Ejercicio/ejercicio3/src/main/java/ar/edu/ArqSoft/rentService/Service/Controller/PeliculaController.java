package ar.edu.ArqSoft.rentService.Service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ArqSoft.rentService.Service.Services.*;
import ar.edu.ArqSoft.rentService.Service.dto.*;

@Controller
@RequestMapping("/pelicula")
public class PeliculaController{
	
	@Autowired
	private PeliculaService peliculaService;
	
	 @RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody List<PeliculaResponseDto> getAll(){
		 
		 return peliculaService.getAll();
	
	 }
	 
	 @RequestMapping(value="{/id}",method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody PeliculaResponseDto getById(@PathVariable("id") Long id) {
		 
		 return peliculaService.getPeliculaById(id);
	 }
}