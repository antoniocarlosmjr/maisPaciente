package br.com.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Acompanhante extends Pessoa implements Serializable{


	private static final long serialVersionUID = 7893171355651108502L;

	@Column(nullable=true)
	private Long pacienteAss;


	public Long getPacienteAss() {
		return pacienteAss;
	}


	public void setPacienteAss(Long pacienteAss) {
		this.pacienteAss = pacienteAss;
	}


}
