package ar.edu.ArqSoft.rentService.Service.dto;

import ar.edu.ArqSoft.rentService.Common.dto.*;

public class SocioResponseDto implements DtoEntity{
	
	private String name;
	
	private String lastName;
	
	private String email;
	
	private Long dni;
	
	private String alquiler;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(String alquiler) {
		this.alquiler = alquiler;
	}
	
}