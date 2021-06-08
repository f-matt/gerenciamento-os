package br.edu.facthus.os.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.os.model.Cliente;


public class ClientesService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void cadastraCliente(Cliente cliente) {
		entityManager.persist(cliente);
	}
	
	public List<Cliente> buscaTodos() {
		return entityManager
				.createNamedQuery("Cliente.findAll", Cliente.class)
				.getResultList();
	}


}
