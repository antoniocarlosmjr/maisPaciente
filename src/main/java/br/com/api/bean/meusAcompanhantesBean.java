package br.com.api.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.com.api.dao.AGHUDAO;
import br.com.api.model.Acompanhante;
import br.com.api.model.Paciente;

@RequestScoped
@ManagedBean(name="MeusAcompanhantes")
public class meusAcompanhantesBean {
	
	@Inject
	private Acompanhante acompanhante;
	
	Acompanhante acompanhanteDAO = new Acompanhante();
	
	@Inject
	private Paciente paciente;
	
	private long numeroProntuario;
	
	private long idAcompanahnte;
	
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
			acompanhante.consultarProntuario(getNumeroProntuario());
			
		}
	}

	
	public void salvar() {
		System.out.println("Associado");
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public long getIdAcompanahnte() {
		return idAcompanahnte;
	}

	public void setIdAcompanahnte(long idAcompanahnte) {
		this.idAcompanahnte = idAcompanahnte;
	}
	
}
