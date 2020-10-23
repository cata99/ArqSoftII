package ar.edu.ArqSoft.rentService.Service.dto;


import ar.edu.ArqSoft.rentService.Common.dto.*;

public class AlquilerRequestDto implements DtoEntity{

	
	private Long peliculaId;
	
	private Long socioId;

	public Long getPeliculaId() {
		return peliculaId;
	}

	public void setPeliculaId(Long peliculaId) {
		this.peliculaId = peliculaId;
	}

	public Long getSocioId() {
		return socioId;
	}

	public void setSocioId(Long socioId) {
		this.socioId = socioId;
	}


	
}