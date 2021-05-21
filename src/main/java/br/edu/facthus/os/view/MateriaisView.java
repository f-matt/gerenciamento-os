package br.edu.facthus.os.view;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.edu.facthus.os.util.FacesUtils;

@Named
@ViewScoped
public class MateriaisView implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer codigoPesquisa;
	
	private String descricaoPesquisa;
	
	public void pesquisa() {
		FacesUtils.showInfo("Em construção...");
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
	
}
