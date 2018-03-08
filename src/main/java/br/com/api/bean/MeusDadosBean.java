package br.com.api.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.com.api.dao.AGHUDAO;
import br.com.api.dao.PacienteDAO;
import br.com.api.model.Paciente;

@RequestScoped
@ManagedBean(name="meusDadosBean")
public class MeusDadosBean {
	
	@Inject
	private PacienteDAO pacienteDAO;
	
	PacienteDAO pacientedao = new PacienteDAO();
	
	@Inject
	private Paciente paciente;
	
	private long numeroProntuario;
	
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
			pacientedao.consultarPorID(getNumeroProntuario());
			
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
	
}
