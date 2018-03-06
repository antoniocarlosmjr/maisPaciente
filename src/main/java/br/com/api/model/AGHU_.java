package br.com.api.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-06T16:34:48.679-0300")
@StaticMetamodel(AGHU.class)
public class AGHU_ {
	public static volatile SingularAttribute<AGHU, Long> id;
	public static volatile SingularAttribute<AGHU, Long> prontuario;
	public static volatile SingularAttribute<AGHU, String> nome;
	public static volatile SingularAttribute<AGHU, String> uf_sigla;
	public static volatile SingularAttribute<AGHU, String> sexo;
	public static volatile SingularAttribute<AGHU, String> fone_residencial;
	public static volatile SingularAttribute<AGHU, String> cpf;
	public static volatile SingularAttribute<AGHU, Calendar> dt_Nascimento;
	public static volatile SingularAttribute<AGHU, Long> nro_cartao_saude;
	public static volatile SingularAttribute<AGHU, Paciente> paciente;
}
