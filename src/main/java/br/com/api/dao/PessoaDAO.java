package br.com.api.dao;

import java.io.UnsupportedEncodingException;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.api.model.Pessoa;
import br.com.api.util.UtilToken;


public class PessoaDAO extends DAOGeneric<Pessoa, Long> {
	
	/**
	 * @deprecated CDI eyes only
	 */
	protected PessoaDAO() {
		this(null);
	}
	
	@Inject
	public PessoaDAO(EntityManager manager) {
		super(Pessoa.class, manager);
	}
	
	public Pessoa consultarPorToken(String jwt) {
		try {
			return super.consultarPorID(UtilToken.decode(jwt));
		} catch (IllegalArgumentException | UnsupportedEncodingException e) {
			return null;
		}
	}
	
	/**
	 * Consulta pessoa por email
	 * @param email
	 * @param senha
	 * @return
	 */
	public Pessoa consultarPorEmail(String email) {
		try {
			return (Pessoa) this.getEntityManager()
					.createQuery("select p from Pessoa p where p.email = :email")
					.setParameter("email", email)
					.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
