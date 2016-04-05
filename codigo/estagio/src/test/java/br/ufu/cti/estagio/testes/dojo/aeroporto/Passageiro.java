package br.ufu.cti.estagio.testes.dojo.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {

	private String nome;
	private String cpf;
	private List<Voo> listaDeVoos= new ArrayList<Voo>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void adicionarVoos(Voo voo) {
		this.listaDeVoos.add(voo);
	}
	
	
}
