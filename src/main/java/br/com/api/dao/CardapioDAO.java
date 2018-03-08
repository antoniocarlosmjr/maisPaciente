package br.com.api.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.api.model.AGHU;
import br.com.api.model.Paciente;
import br.com.api.model.Pessoa;


public class CardapioDAO extends DAOGeneric<AGHU, Long> {
	
	/**
	 * @deprecated CDI eyes only
	 */
	public CardapioDAO() {
		this(null);
	}
	
	@Inject
	public CardapioDAO(EntityManager manager) {
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
