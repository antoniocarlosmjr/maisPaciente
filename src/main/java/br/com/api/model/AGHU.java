package br.com.api.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class AGHU implements Serializable {

	private static final long serialVersionUID = -1213369723451900385L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Long prontuario;

	@Column(nullable = false)
	private String cpf;

	private String nome;

	private String uf_sigla;

	private String sexo;

	private String fone_residencial;

	@Temporal(TemporalType.DATE)
	private Calendar dt_Nascimento;

	private Long nro_cartao_saude;

	public Long getProntuario() {
		return prontuario;
	}

	public void setProntuario(Long prontuario) {
		this.prontuario = prontuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf_sigla() {
		return uf_sigla;
	}

	public void setUf_sigla(String uf_sigla) {
		this.uf_sigla = uf_sigla;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFone_residencial() {
		return fone_residencial;
	}

	public void setFone_residencial(String fone_residencial) {
		this.fone_residencial = fone_residencial;
	}

	public Calendar getDt_Nascimento() {
		return dt_Nascimento;
	}

	public void setDt_Nascimento(String dt_Nascimento) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar instance = Calendar.getInstance();
		instance.setTime(simpleDateFormat.parse(dt_Nascimento));
		
		this.setDt_Nascimento(instance);
	}

	private void setDt_Nascimento(Calendar instance) {
		Calendar calendar = this.dt_Nascimento;
	}

	public Long getNro_cartao_saude() {
		return nro_cartao_saude;
	}

	public void setNro_cartao_saude(Long nro_cartao_saude) {
		this.nro_cartao_saude = nro_cartao_saude;
	}

}
