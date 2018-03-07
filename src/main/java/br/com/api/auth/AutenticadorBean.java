package br.com.api.auth;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.api.util.SessionUtil;


@RequestScoped
@ManagedBean
public class AutenticadorBean implements Serializable {

	private static final long serialVersionUID = 5083490121520371374L;
	private String email;
	private String senha;

	public String autentica() {
			
		
		//PEGAR ESSAS INFORMACOES DO BANCO 
		
		if (email.equals("antonio@maispaciente.com")&&senha.equals("123")) {
			
			//Adiciona Usuário na sessão
			
			Object b = new Object();
			
			SessionUtil.setParam("USUARIOLogado", b);
			
		return "/index.adm.xhtml?faces-redirect=true";

		} else {
			
			return null;

		}

	}

	/**
	 * Metodo que efetua o logout
	 * 
	 * @return
	 */
	public String registraSaida() {

		//REMOVER USUARIO DA SESSION
		
		
		return "/login.paciente.xhtml?faces-redirect=trues";
	}

	// GETTERS E SETTERS


	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
