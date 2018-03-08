package br.com.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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

@ManyToOne
private Paciente paciente;

@ManyToOne
private Mapa mapa;

@ManyToOne
private Cardapio cardapio;


public void consultarProntuario(long numeroProntuario) {
	
}
	

}
