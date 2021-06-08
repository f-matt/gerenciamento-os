package br.edu.facthus.os.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.os.model.Servico;

// T16: Atualizar

@Stateless
public class ServicosService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void cadastraServicos(Servico servico) {
		entityManager.persist(servico);
	}
	
	public List<Servico> buscaTodos() {
		return entityManager
				.createNamedQuery("Servico.findAll", Servico.class)
				.getResultList();
	}
}
