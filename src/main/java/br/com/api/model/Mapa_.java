package br.com.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-07T09:20:23.637-0300")
@StaticMetamodel(Mapa.class)
public class Mapa_ {
	public static volatile SingularAttribute<Mapa, Long> id;
	public static volatile SingularAttribute<Mapa, String> latitude;
	public static volatile SingularAttribute<Mapa, String> longitude;
	public static volatile SingularAttribute<Mapa, String> setor;
	public static volatile ListAttribute<Mapa, Paciente> pacientes;
	public static volatile ListAttribute<Mapa, Acompanhante> acompanhantes;
}
