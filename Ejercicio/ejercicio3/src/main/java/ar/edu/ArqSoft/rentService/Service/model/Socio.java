package ar.edu.ArqSoft.rentService.Service.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ArqSoft.rentService.Common.model.*;

@Entity
@Table(name="SOCIO")
public class Socio extends GenericObject{

	@NotNull
	@Size(min=1, max=350)
	@Column (name="NAME")
	private String name;
	
	@NotNull
	@Size(min=1, max=350)
	@Column (name="LASTNAME")
	private String lastName;
	
	@NotNull
	@Size(min=1, max=12)
	@Column (name="DNI")
	private Long dni;
	
	@NotNull
	@Size(min=1, max=250)
	@Column (name="EMAIL")
	private String email; 
	
	@OneToMany(mappedBy="socio", fetch = FetchType.LAZY)
	private Set<Alquiler> alquileres;

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

	public Set<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Set<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
	
	
}