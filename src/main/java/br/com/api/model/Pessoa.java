package br.com.api.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/*
 * Padrao Utilizado: Factory
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa implements Serializable {
	
	private static final long serialVersionUID = -3556751655672609629L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String genero;
	
	private String telefone;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Column(nullable=true)
	private String cpf;
	
	@Column(unique=true, nullable=true)
	private String email;
	
	private String senha;
	
	private String endereco;
	
	/**
	 * chave usada para confirmar a alteração da senha
	 */
	@Column(length=16)
	private String chaveAlteracaoSenha;
	
	/**
	 * Atributo não persistido em BD
	 * Possui a função de ser serializado para o front-end
	 */
	@Transient
	private String token;
	
	@OneToMany(mappedBy="pessoa")
	private List<Token> tokens;
	
	@OneToOne
	private Mapa mapa;
	
	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Token> getTokens() {
		return tokens;
	}

	public void setTokens(List<Token> tokens) {
		this.tokens = tokens;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getChaveAlteracaoSenha() {
		return chaveAlteracaoSenha;
	}

	public void setChaveAlteracaoSenha(String chaveAlteracaoSenha) {
		this.chaveAlteracaoSenha = chaveAlteracaoSenha;
	}

	public String getSexo() {
		return genero;
	}

	public void setSexo(String sexo) {
		this.genero = genero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	public void setDatanascimento(String data) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar instance = Calendar.getInstance();
		instance.setTime(simpleDateFormat.parse(data));
		
		this.setDataNascimento(instance);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}