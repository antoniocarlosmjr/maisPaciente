package br.com.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Paciente extends Pessoa implements Serializable{


	private static final long serialVersionUID = 5251613389349045953L;
	
	@Column(unique=true, nullable=false)
	private Long numProntuario;
	
	private Long cartaoSUS;
	
	private Long acompanhanteAss;

	public Long getCartaoSUS() {
		return cartaoSUS;
	}

	public void setCartaoSUS(Long cartaoSUS) {
		this.cartaoSUS = cartaoSUS;
	}

	public Long getAcompanhanteAss() {
		return acompanhanteAss;
	}

	public void setAcompanhanteAss(Long acompanhanteAss) {
		this.acompanhanteAss = acompanhanteAss;
	}
	
	@OneToMany
	private List<Acompanhante> acompanhantes;
	
	
	
	

}
