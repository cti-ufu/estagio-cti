package br.ufu.cti.estagio.testes.dojo.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeroporo {
	private String nome;
	private String codigo;
	private Double taxaDeEmbarque;
	private String endereco;
	private List<EmpresaAerea> listaDeEmpresasAereas = new ArrayList <EmpresaAerea>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getTaxaDeEmbarque() {
		return taxaDeEmbarque;
	}
	public void setTaxaDeEmbarque(Double taxaDeEmbarque) {
		this.taxaDeEmbarque = taxaDeEmbarque;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void adicionarEmpresa(EmpresaAerea emp) {
		
		this.listaDeEmpresasAereas.add(emp);
	}
	
	public void removerEmpresa(EmpresaAerea emp) {
		this.listaDeEmpresasAereas.remove(emp);
	}
	
	
}
