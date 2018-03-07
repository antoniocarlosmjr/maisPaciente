package br.com.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-06T12:23:11.521-0300")
@StaticMetamodel(Relatorio.class)
public class Relatorio_ {
	public static volatile SingularAttribute<Relatorio, Long> id;
	public static volatile SingularAttribute<Relatorio, String> tipoRelatorio;
	public static volatile SingularAttribute<Relatorio, Chefe> chefe;
}
