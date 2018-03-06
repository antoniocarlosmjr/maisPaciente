package br.com.api.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.api.model.Paciente;



@ManagedBean
@RequestScoped
public class CadastrarPacienteBean {
	private Paciente paciente = new Paciente();
	private String id;
	private String nome;
	private String prontuario;
	private String datanascimento;
	private String sexo;
	private String email;
	private String telefone;
	private String nro_cartao_saude;
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNro_cartao_saude() {
		return nro_cartao_saude;
	}
	public void setNro_cartao_saude(String nro_cartao_saude) {
		this.nro_cartao_saude = nro_cartao_saude;
	}

}

