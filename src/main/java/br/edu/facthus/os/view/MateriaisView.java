package br.edu.facthus.os.view;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import br.edu.facthus.os.model.Material;
import br.edu.facthus.os.service.MateriaisService;
import br.edu.facthus.os.util.FacesUtils;

@Named
@ViewScoped
public class MateriaisView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private MateriaisService materiaisService;

	private Integer codigoPesquisa;
	
	private String descricaoPesquisa;
	
	private Material material;
	
	private List<Material> materiais;
	
	public void pesquisa() {
		materiais = materiaisService.buscaTodos();
	}
	
	public void novo() {
		material = new Material();
		PrimeFaces.current().executeScript("PF('materiaisDialog').show()");
	}
	
	public void salvaMaterial() {
		materiaisService.cadastraMaterial(material);
		material = new Material();
		FacesUtils.showInfo("Material cadastrado com sucesso!");
	}

	/*
	 * 
	 */
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

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public List<Material> getMateriais() {
		return materiais;
	}

	public void setMateriais(List<Material> materiais) {
		this.materiais = materiais;
	}
	
}
