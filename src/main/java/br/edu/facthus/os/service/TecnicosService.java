 package br.edu.facthus.os.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.os.model.Tecnico;

@Stateless
public class TecnicosService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void cadastraTecnico(Tecnico tecnico) {
		entityManager.persist(tecnico);
		
	}
	
	public List<Tecnico> buscaTodos() {
		return entityManager
				.createNamedQuery("Tecnico.findAll",Tecnico.class)
				.getResultList();
		
	}

}
