package br.edu.facthus.os.view;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import br.edu.facthus.os.model.Servico;
import br.edu.facthus.os.service.ServicosService;
import br.edu.facthus.os.util.FacesUtils;

@Named
@ViewScoped
public class ServicosView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ServicosService servicosService;

	private Integer codigoPesquisa;
	
	private String descricaoPesquisa;
	
	private Servico servico;
	
	private List<Servico> servicos;
	
	public void pesquisa() {
		servicos = servicosService.buscaTodos();
	}
	
	public void novo() {
		servico = new Servico();
		PrimeFaces.current().executeScript("PF('servicosDialog').show()");
	}
	
	public void salvaServico() {
		servicosService.cadastraServicos (servico);
		servico = new Servico();
		FacesUtils.showInfo("Servico cadastrado com sucesso!");
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

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos= servicos;
	}
	
}
