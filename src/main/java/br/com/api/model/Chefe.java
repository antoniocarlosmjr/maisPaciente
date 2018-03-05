package br.com.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Chefe extends Pessoa implements Serializable{


	private static final long serialVersionUID = 7854378563151799456L;
	@Column
	private Long numIdentificacao;
	
	public Long getNumIdentificacao() {
		return numIdentificacao;
	}
	public void setNumIdentificacao(Long numIdentificacao) {
		this.numIdentificacao = numIdentificacao;
	}
	
	@OneToOne
	private Relatorio relatorio;

}

