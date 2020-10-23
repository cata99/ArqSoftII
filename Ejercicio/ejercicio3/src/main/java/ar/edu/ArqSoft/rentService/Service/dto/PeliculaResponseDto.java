package ar.edu.ArqSoft.rentService.Service.dto;

import ar.edu.ArqSoft.rentService.Common.dto.DtoEntity;

public class PeliculaResponseDto implements DtoEntity{
	
	private Long id;
	
	private String name;

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
	
	
}