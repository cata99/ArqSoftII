package ar.edu.ArqSoft.rentService.Service.dto;

import ar.edu.ArqSoft.rentService.Common.dto.*;

public class PeliculaRequestDto implements DtoEntity{
	
	private Long id;
	
	private String name;
	
	private String Descripcion;
	
	private String anio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	
	
}