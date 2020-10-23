package ar.edu.ArqSoft.rentService.Service.dto;

import ar.edu.ArqSoft.rentService.Common.dto.*;

public class SocioRequestDto implements DtoEntity{
	
	private String name;
	
	private String lastName;
	
	private Long dni;
	
	private String email;
	

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

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}