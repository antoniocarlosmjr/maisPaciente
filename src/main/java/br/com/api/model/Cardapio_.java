package br.com.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-02-28T13:56:49.574-0300")
@StaticMetamodel(Cardapio.class)
public class Cardapio_ {
	public static volatile SingularAttribute<Cardapio, Long> id;
	public static volatile SingularAttribute<Cardapio, String> cafeDaManha;
	public static volatile SingularAttribute<Cardapio, String> almoco;
	public static volatile SingularAttribute<Cardapio, String> jantar;
}
