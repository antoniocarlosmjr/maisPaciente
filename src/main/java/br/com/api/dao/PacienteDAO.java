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

/**
 * Classe responsável por acesso a entidade Paciente
 */

@ManagedBean(name = "pacienteCadastro")

@ViewScoped
public class PacienteDAO extends DAOGeneric<Paciente, Paciente> {

	/*
	 * Utilizamos o logger para realizar log's da aplicação no servidor
	 */
	private static Logger logger = Logger.getLogger(Paciente.class);

	@ManagedProperty(value = "#{paciente}")
	private Paciente paciente;

}
