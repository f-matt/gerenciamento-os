package br.edu.facthus.os.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.os.model.Produto;

// T15: Atualizar

 @Stateless
 
public class ProdutosService {
@PersistenceContext

	private EntityManager entityManager;

	public void cadastraProdutos(Produto produto) {
		entityManager.persist(produto);
		
		
	}
	public List<Produto> buscaTodos(){
		return entityManager
				.createNamedQuery("Produto.findAll", Produto.class)
				.getResultList();
	}
	 
	 
}
