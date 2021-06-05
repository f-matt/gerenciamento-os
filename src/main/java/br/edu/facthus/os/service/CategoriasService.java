package br.edu.facthus.os.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.facthus.os.model.Categoria;
import br.edu.facthus.os.model.Material;

// T13: Atualizar
@Stateless
public class CategoriasService {
    @PersistenceContext
    private EntityManager entityManager;

    public void cadastraCategoria(Categoria categoria) {
        entityManager.persist(categoria);
    }

    public List<Categoria> buscaTodos() {
        return entityManager
                .createNamedQuery("Categoria.findAll", Categoria.class)
                .getResultList();
    }
}
