package br.com.api.enumeration;

public enum CategoriaCardapio {

	CAFE_DA_MANHA("Café da Manhã"),
	
	ALMOCO("Almoço"),
	
	
	JANTAR("Jantar");
	
	private String descricao;
	
	private CategoriaCardapio(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return descricao;
	}
	
}
