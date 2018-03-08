package br.com.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Mapa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2916647992597176001L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, nullable = true)
	private String latitude;

	private String longitude;

	private String setor;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@OneToMany
	@JoinColumn(name="id", nullable = true)
	private List<Paciente> pacientes;
	
	@OneToMany
	@JoinColumn(name="id", nullable = true)
	private List<Acompanhante> acompanhantes;
	
}