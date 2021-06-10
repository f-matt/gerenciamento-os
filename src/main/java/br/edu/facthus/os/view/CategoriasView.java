package br.edu.facthus.os.view;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.facthus.os.model.Categoria;
import br.edu.facthus.os.service.CategoriasService;
import org.primefaces.PrimeFaces;

import br.edu.facthus.os.model.Material;
import br.edu.facthus.os.service.MateriaisService;
import br.edu.facthus.os.util.FacesUtils;

// T18: Atualizar
@Named
@ViewScoped
public class CategoriasView implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private CategoriasService categoriasService;
    private Integer codigoPesquisa;
    private String descricaoPesquisa;
    private Categoria categoria;

    private List<Categoria> categorias;

    public void pesquisa() {
        categorias = categoriasService.buscaTodos();
    }

    public void novo() {
        categoria = new Categoria();
        PrimeFaces.current().executeScript("PF('categoriasDialog').show()");
    }
    public void salvaCategoria() {
        categoriasService.cadastraCategoria(categoria);
        categoria = new Categoria();
        FacesUtils.showInfo("Categoria cadastrado com sucesso!");
    }




    public Integer getCodigoPesquisa() {
        return codigoPesquisa;
    }

    public void setCodigoPesquisa(Integer codigoPesquisa) {
        this.codigoPesquisa = codigoPesquisa;
    }

    public String getDescricaoPesquisa() {
        return descricaoPesquisa;
    }

    public void setDescricaoPesquisa(String descricaoPesquisa) {
        this.descricaoPesquisa = descricaoPesquisa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
