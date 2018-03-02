package br.com.api.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.api.enumeration.CategoriaCardapio;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Cardapio implements Serializable {
	
	private static final long serialVersionUID = 1790901686263558308L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private CategoriaCardapio categoria;
	
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaCardapio getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaCardapio categoria) {
		this.categoria = categoria;
	}

	public Calendar getDataCardapio() {
		return data;
	}

	public void setDataCardapio(Calendar data) {
		this.data = data;
	}


	
	
	
}