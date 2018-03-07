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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Cirurgia implements Serializable {
	
	private static final long serialVersionUID = -3556751655672609629L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String prontuario;
	
	private String cirurgiao;
	
	private Boolean realizada;
	
	
	
	@Column(nullable=true)
	private String cpf;
	
	private String procedimento;
	
	private Boolean reagendada;
	
	private Boolean cancelada;
	
	
	@Temporal(TemporalType.DATE)
	private Calendar dataCirurgiaMarcada;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataCirurgiaReagendada;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataCirurgiaMarcada() {
		return dataCirurgiaMarcada;
	}

	public void setDataCirurgiaMarcada(Calendar dataCirurgiaMarcada) {
		this.dataCirurgiaMarcada = dataCirurgiaMarcada;
	}

	public Calendar getDataCirurgiaReagendada() {
		return dataCirurgiaReagendada;
	}

	public void setDataCirurgiaReagendada(Calendar dataCirurgiaReagendada) {
		this.dataCirurgiaReagendada = dataCirurgiaReagendada;
	}

	public Calendar getDataCirurgiaCancelada() {
		return dataCirurgiaCancelada;
	}

	public void setDataCirurgiaCancelada(Calendar dataCirurgiaCancelada) {
		this.dataCirurgiaCancelada = dataCirurgiaCancelada;
	}
	
	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getCirurgiao() {
		return cirurgiao;
	}

	public void setCirurgiao(String cirurgiao) {
		this.cirurgiao = cirurgiao;
	}

	public Boolean getReagendada() {
		return reagendada;
	}

	public void setReagendada(Boolean reagendada) {
		this.reagendada = reagendada;
	}

	public Boolean getCancelada() {
		return cancelada;
	}

	public void setCancelada(Boolean cancelada) {
		this.cancelada = cancelada;
	}

	public Boolean getRealizada() {
		return realizada;
	}

	public void setRealizada(Boolean realizada) {
		this.realizada = realizada;
	}
	
	@Temporal(TemporalType.DATE)
	private Calendar dataCirurgiaCancelada;
	
	@OneToOne
	private Medico medico;
	
	@OneToOne
	private SIGEC sigec;
	
	@OneToOne
	private Paciente paciente;

}
