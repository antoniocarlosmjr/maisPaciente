package br.com.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Atendente extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7722125638156271784L;
	@Column(unique=true, nullable=true)
	private Long numIdentificacao;
	
	public Long getNumIdentificacao() {
		return numIdentificacao;
	}
	public void setNumIdentificacao(Long numIdentificacao) {
		this.numIdentificacao = numIdentificacao;
	}

}
