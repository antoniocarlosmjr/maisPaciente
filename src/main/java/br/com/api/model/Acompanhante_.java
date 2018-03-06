package br.com.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-06T12:19:20.506-0300")
@StaticMetamodel(Acompanhante.class)
public class Acompanhante_ extends Pessoa_ {
	public static volatile SingularAttribute<Acompanhante, Long> pacienteAss;
	public static volatile SingularAttribute<Acompanhante, Paciente> paciente;
	public static volatile ListAttribute<Acompanhante, Cardapio> cardapios;
}
