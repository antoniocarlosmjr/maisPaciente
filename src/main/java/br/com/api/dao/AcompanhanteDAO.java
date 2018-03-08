package br.com.api.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.api.model.AGHU;
import br.com.api.model.Acompanhante;
import br.com.api.model.Paciente;
import br.com.api.model.Pessoa;


public class AcompanhanteDAO extends DAOGeneric<AGHU, Long> {
	
	/**
	 * @deprecated CDI eyes only
	 */
	public AcompanhanteDAO() {
	}
	
	@SuppressWarnings("deprecation")
	@Inject
	public AcompanhanteDAO(EntityManager manager) {
	}
	
	public Paciente consultarProntuario(long prontuario) {
		try {
			return (Paciente) this.getEntityManager();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public AGHU consultarPorID(Long e) {
		return null;
	}
	
}
