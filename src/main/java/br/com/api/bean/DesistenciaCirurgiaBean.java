package br.com.api.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.com.api.dao.AGHUDAO;
import br.com.api.dao.ChefeDAO;
import br.com.api.model.Cirurgia;
import br.com.api.model.Paciente;
import br.com.api.model.SIGEC;

@RequestScoped
@ManagedBean(name="desistenciaCirurgiaBean")
public class DesistenciaCirurgiaBean {
	
	private static final Object idCirurgia = null;

	private static String motivosDesistencia = null;

	@Inject
	private Cirurgia cirurgiaDAO;
	
	@Inject
	private SIGEC SIGECDAO;
	
	@Inject
	private ChefeDAO chefeDAO;
	
	@Inject
	private Paciente paciente;
	
	SIGEC sigecdao = new SIGEC();
	
	private long numeroProntuario;
	
	private long desistenciaCirurgia;
	
	public long getNumeroProntuario() {
		return numeroProntuario;
	}

	public void setNumeroProntuario(long numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}


	public void buttonAction() {
		if (getNumeroProntuario() < 0) {
			return;
		}else {
			sigecdao.consultarCirurgia(getCirurgia());
		}
	}

	
	private Object getCirurgia() {
		return idCirurgia;
	}
	
	public void buttonAction2() {
		if (getDesistenciaCirurgia() < 0) {
			return;
		}else {
			sigecdao.desistenciaCirurgia(getDesistenciaCirurgia());
		}
	}


	public void salvar() {
		System.out.println("salvo");
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public String getMotivosDesistencia() {
		return motivosDesistencia;
	}


	public void setMotivosDesistencia(String motivosDesistencia) {
		this.motivosDesistencia = motivosDesistencia;
	}


	public long getDesistenciaCirurgia() {
		return desistenciaCirurgia;
	}


	public void setDesistenciaCirurgia(long desistenciaCirurgia) {
		this.desistenciaCirurgia = desistenciaCirurgia;
	}
	
}
