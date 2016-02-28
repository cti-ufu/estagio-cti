package extra2;

import java.util.ArrayList;

public class Passageiro {

	private String nome;
	private long cpf;
	private ArrayList<Voo> listaVoos = new ArrayList<Voo>();
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setCpf(long cpf) {
		
		this.cpf = cpf;
	}
	
	public long getCpf() {
		
		return cpf;
	}
	
	private void setListaVoos(ArrayList<Voo> listaVoos) {
		
		this.listaVoos = listaVoos;
	}
	
	private ArrayList<Voo> getListaVoos() {
		
		return listaVoos;
	}
}
