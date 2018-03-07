package br.com.api.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SIGEC implements Serializable {

	private static final long serialVersionUID = -2442048336586334645L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_cirurgia;

	@Column(nullable = false)
	private Long cv_prontuario;
	
	//Nome do Paciente
	private String cv_paciente;
	
	@Temporal(TemporalType.DATE)
	private Calendar cv_data_cirurgia;
	
	private String cv_procedimento;
	
	private String cv_cirurgiao;
	
	@Column(nullable = true)
	private String cv_reagendada;
	
	@OneToOne
	private Paciente paciente;
	
	@OneToOne
	private Medico medico;
	
	@OneToOne
	private Cirurgia cirurgia;
	
	public Long getId_cirurgia() {
		return id_cirurgia;
	}

	public void setId_cirurgia(Long id_cirurgia) {
		this.id_cirurgia = id_cirurgia;
	}

	public Long getCv_prontuario() {
		return cv_prontuario;
	}

	public void setCv_prontuario(Long cv_prontuario) {
		this.cv_prontuario = cv_prontuario;
	}

	public String getCv_paciente() {
		return cv_paciente;
	}

	public void setCv_paciente(String cv_paciente) {
		this.cv_paciente = cv_paciente;
	}

	public Calendar getCv_data_cirurgia() {
		return cv_data_cirurgia;
	}

	public void setCv_data_cirurgia(Calendar cv_data_cirurgia) {
		this.cv_data_cirurgia = cv_data_cirurgia;
	}

	public String getCv_procedimento() {
		return cv_procedimento;
	}

	public void setCv_procedimento(String cv_procedimento) {
		this.cv_procedimento = cv_procedimento;
	}

	public String getCv_cirurgiao() {
		return cv_cirurgiao;
	}

	public void setCv_cirurgiao(String cv_cirurgiao) {
		this.cv_cirurgiao = cv_cirurgiao;
	}

	public String getCv_reagendada() {
		return cv_reagendada;
	}

	public void setCv_reagendada(String cv_reagendada) {
		this.cv_reagendada = cv_reagendada;
	}

}

