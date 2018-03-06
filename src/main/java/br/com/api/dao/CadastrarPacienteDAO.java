package br.com.api.dao;

import br.com.api.model.Paciente;
public class CadastrarPacienteDAO<Paciente>{
	
	@Repository
	@Autowired
	public PacienteDAO(SessionFactory sessionFactory) {
		super(Paciente.class, sessionFactory)
	}
}
