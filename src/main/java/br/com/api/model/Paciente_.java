package br.com.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-06T23:02:16.611-0300")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Pessoa_ {
	public static volatile SingularAttribute<Paciente, Long> numProntuario;
	public static volatile SingularAttribute<Paciente, Long> cartaoSUS;
	public static volatile SingularAttribute<Paciente, Long> acompanhanteAss;
	public static volatile ListAttribute<Paciente, Acompanhante> acompanhantes;
	public static volatile ListAttribute<Paciente, SIGEC> sigecs;
	public static volatile ListAttribute<Paciente, Cirurgia> cirurgias;
	public static volatile ListAttribute<Paciente, Medico> medicos;
	public static volatile SingularAttribute<Paciente, Cardapio> cardapios;
	public static volatile SingularAttribute<Paciente, Mapa> mapa;
	public static volatile SingularAttribute<Paciente, AGHU> aghu;
}
