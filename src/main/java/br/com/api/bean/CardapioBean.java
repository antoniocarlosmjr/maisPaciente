package br.com.api.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.com.api.dao.AGHUDAO;
import br.com.api.model.Acompanhante;
import br.com.api.model.Cardapio;
import br.com.api.model.Chefe;
import br.com.api.model.Paciente;

@RequestScoped
@ManagedBean(name="CardapioBean")
public class CardapioBean {
	
	@Inject
	Cardapio cardapio = new Cardapio();
	
	
	@Inject
	private Paciente paciente;
	
	@Inject
	private Acompanhante acompanhante;
	
	@Inject
	private Chefe  chefe;
	
	private long idCardapio;
	
	
	public long getgetIdCardapio() {
		return idCardapio;
	}


	public void setNumeroProntuario(long idCardapio) {
		this.idCardapio = idCardapio;
	}


	public void buttonAction() {
		if (getgetIdCardapio() < 0) {
			return;
		}else {
			cardapio.consultarCardapio(getgetIdCardapio());
			
		}
	}

	
	public void salvar() {
		System.out.println("salvo");
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	
}
