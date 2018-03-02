package br.com.api.model;

import br.com.api.enumeration.CategoriaCardapio;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T17:23:28.415-0300")
@StaticMetamodel(Cardapio.class)
public class Cardapio_ {
	public static volatile SingularAttribute<Cardapio, Long> id;
	public static volatile SingularAttribute<Cardapio, String> descricao;
	public static volatile SingularAttribute<Cardapio, CategoriaCardapio> categoria;
	public static volatile SingularAttribute<Cardapio, Calendar> data;
}
