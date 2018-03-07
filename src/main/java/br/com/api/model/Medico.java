package br.com.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Medico extends Pessoa implements Serializable {

	private static final long serialVersionUID = 3181776865840886312L;

	@Column(unique = true, nullable = true)
	private String especialidade;

	private String CRM;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Paciente> pacientes;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Cirurgia> cirurgia;

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}