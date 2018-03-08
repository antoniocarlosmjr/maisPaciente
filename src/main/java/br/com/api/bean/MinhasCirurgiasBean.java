package br.com.api.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.com.api.dao.AGHUDAO;
import br.com.api.model.Paciente;

@RequestScoped
@ManagedBean(name="minhasCirurgiasBean")
public class MinhasCirurgiasBean {
	
	@Inject
	private AGHUDAO aghuDAO;
	
	AGHUDAO aghudao = new AGHUDAO();
	
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
			System.out.println("teste");
			return;
		}else {
			aghudao.consultarProntuario(getNumeroProntuario());
			
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
