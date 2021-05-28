package br.edu.facthus.os.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.os.model.Material;

@Stateless
public class MateriaisService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void cadastraMaterial(Material material) {
		entityManager.persist(material);
	}
	
	public List<Material> buscaTodos() {
		return entityManager
				.createNamedQuery("Material.findAll", Material.class)
				.getResultList();
	}

}
