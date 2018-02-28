package br.com.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Medico extends Pessoa implements Serializable{

	private static final long serialVersionUID = 3181776865840886312L;

	@Column(unique=true, nullable=false)
	private String especialidade;
	
	private String CRM;

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