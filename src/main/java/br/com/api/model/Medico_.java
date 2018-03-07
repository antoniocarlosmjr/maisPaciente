package br.com.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-06T22:54:45.672-0300")
@StaticMetamodel(Medico.class)
public class Medico_ extends Pessoa_ {
	public static volatile SingularAttribute<Medico, String> especialidade;
	public static volatile SingularAttribute<Medico, String> CRM;
	public static volatile ListAttribute<Medico, Paciente> pacientes;
	public static volatile ListAttribute<Medico, Cirurgia> cirurgia;
}
