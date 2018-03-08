package br.com.api.dao;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import org.hibernate.SessionFactory;
import org.apache.log4j.Logger;

import br.com.api.model.Paciente;
import br.com.api.model.Pessoa;

/**
 * Classe responsável por acesso a entidade Paciente
 */

public class PacienteDAO extends DAOGeneric<Paciente, Paciente> {

	/*
	 * Utilizamos o logger para realizar log's da aplicação no servidor
	 */
	private static Logger logger = Logger.getLogger(Paciente.class);

	@ManagedProperty(value = "#{paciente}")
	private Paciente paciente;

	@Override
	public Paciente consultarPorID(Paciente e) {
		// TODO Auto-generated method stub
		return null;
	}

}
