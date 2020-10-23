package ar.edu.ArqSoft.rentService.Service.dto;

import java.util.Date;

import ar.edu.ArqSoft.rentService.Common.dto.*;

public class AlquilerResponseDto implements DtoEntity{

	private String apellido;
	
	private String pelicula;
	
	private Date fecha;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	


	
}