package br.com.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Cardapio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1790901686263558308L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String cafeDaManha;
	private String almoco;
	private String jantar;
	
	public String getAlmoco() {
		return almoco;
	}
	public void setAlmoco(String almoco) {
		this.almoco = almoco;
	}
	public String getCafeDaManha() {
		return cafeDaManha;
	}
	public void setCafeDaManha(String cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}
	public String getJantar() {
		return jantar;
	}
	public void setJantar(String jantar) {
		this.jantar = jantar;
	}
	
	
}