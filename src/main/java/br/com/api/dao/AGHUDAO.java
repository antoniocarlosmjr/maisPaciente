package br.com.api.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.api.model.AGHU;
import br.com.api.model.Paciente;
import br.com.api.model.Pessoa;


public class AGHUDAO extends DAOGeneric<AGHU, Long> {
	
	/**
	 * @deprecated CDI eyes only
	 */
	public AGHUDAO() {
		this(null);
	}
	
	@Inject
	public AGHUDAO(EntityManager manager) {
		super(AGHU.class, manager);
	}
	
	public Paciente consultarProntuario(long prontuario) {
		try {
			return (Paciente) this.getEntityManager()
					.createQuery("select * from Paciente where :prontuario")
					//.setParameter("prontuario", prontuario)
					.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public AGHU consultarPorID(Long e) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
