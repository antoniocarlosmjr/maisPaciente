package br.com.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T21:52:20.976-0300")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Pessoa_ {
	public static volatile SingularAttribute<Paciente, Long> numProntuario;
	public static volatile SingularAttribute<Paciente, Long> cartaoSUS;
	public static volatile SingularAttribute<Paciente, Long> acompanhanteAss;
	public static volatile ListAttribute<Paciente, Acompanhante> acompanhantes;
}
