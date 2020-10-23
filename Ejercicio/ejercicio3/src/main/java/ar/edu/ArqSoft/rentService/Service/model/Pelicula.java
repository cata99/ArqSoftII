package ar.edu.ArqSoft.rentService.Service.model;


import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.OneToMany;

import ar.edu.ArqSoft.rentService.Common.model.*;

@Entity
@Table(name="PELICULA")
public class Pelicula extends GenericObject{
	@NotNull
	@Size(min=1, max=500)
	@Column(name="TITLE")
	private String name;
	
	@NotNull
	@Size(min=1, max=2500)
	@Column(name="SINOPSIS")
	private String sinopsis;
	
	@NotNull
	@Size(min=1, max=4)
	@Column(name="ANIO")
	private String anio;
	
	@Enumerated (value= EnumType.STRING)
	@Column(name = "GENERO")
	private Genero genero;
	
	@OneToMany(mappedBy="pelicula", fetch = FetchType.LAZY)
	private Set<Alquiler> alquileres;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Set<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Set<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}


	
}
