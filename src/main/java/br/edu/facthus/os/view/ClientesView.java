package br.edu.facthus.os.view;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import br.edu.facthus.os.model.Cliente;
import br.edu.facthus.os.model.Material;
import br.edu.facthus.os.service.ClientesService;
import br.edu.facthus.os.service.MateriaisService;
import br.edu.facthus.os.util.FacesUtils;

@Named
@ViewScoped
public class ClientesView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Inject
	private ClientesService clientesService;
	
	private Integer codigoCliente; 
	
	private String nome;
	
	private List<Cliente> clientes;
	
	private Cliente cliente;
	
	public void pesquisa() {
		
		clientes = clientesService.buscaTodos();
	}
	
	public void novo() {
		cliente = new Cliente();
		PrimeFaces.current().executeScript("PF('clienteDialog').show()");
	}
	
	public void salvaMaterial() {
		clientesService.cadastraCliente(cliente);
		cliente = new Cliente();
		FacesUtils.showInfo("Material cadastrado com sucesso!");

    }

	public ClientesService getClientesService() {
		return clientesService;
	}

	public void setClientesService(ClientesService clientesService) {
		this.clientesService = clientesService;
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}