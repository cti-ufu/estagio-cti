package br.ufu.cti.estagio.testes.dojo.aeroporto;

import java.util.List;

public class EmpresaAerea {

	private String nome;
	private List<Aviao> listaDeAvioes;
	private List<Voo> listaDeVoos;
	private Caixa caixa;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aviao> getListaDeAvioes() {
		return listaDeAvioes;
	}
	public void setListaDeAvioes(List<Aviao> listaDeAvioes) {
		this.listaDeAvioes = listaDeAvioes;
	}
	public List<Voo> getListaDeVoos() {
		return listaDeVoos;
	}
	public void setListaDeVoos(List<Voo> listaDeVoos) {
		this.listaDeVoos = listaDeVoos;
	}
	public Caixa getCaixa() {
		return caixa;
	}
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
}
