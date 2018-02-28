package br.com.api.enumeration;

import br.com.api.model.Pessoa;

public enum Role {
	GERAL(Pessoa.class);
	
	private final Class<? extends Pessoa> classe;
	
	private Role(Class<? extends Pessoa> classe) {
		this.classe = classe;
	}

	public Class<? extends Pessoa> getClasse() {
		return classe;
	}
}
