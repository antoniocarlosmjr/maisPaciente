package br.com.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-06T12:17:13.757-0300")
@StaticMetamodel(Chefe.class)
public class Chefe_ extends Pessoa_ {
	public static volatile SingularAttribute<Chefe, Long> numIdentificacao;
	public static volatile ListAttribute<Chefe, Relatorio> relatorios;
}
