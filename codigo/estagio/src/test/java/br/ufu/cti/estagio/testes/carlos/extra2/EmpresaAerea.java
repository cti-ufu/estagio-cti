package extra2;

import java.util.ArrayList;

public class EmpresaAerea {

	private String nome;
	private ArrayList<String> listaAvioes = new ArrayList<String>();
	private ArrayList<Voo> listaVoos = new ArrayList<Voo>();
	private Caixa caixa;
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	private void setListaAvioes(ArrayList<String> listaAvioes) {
		
		this.listaAvioes = listaAvioes;
	}
	
	private ArrayList<String> getListaAvioes() {
		
		return listaAvioes;
	}
	
	private void setListaVoos(ArrayList<Voo> listaVoos) {
		
		this.listaVoos = listaVoos;
	}
	
	public ArrayList<Voo> getListaVoos() {
		
		return listaVoos;
	}
	
	public void setCaixa(Caixa caixa) {
		
		this.caixa = caixa;
	}
	
	public Caixa getCaixa() {
		
		return caixa;
	}
	
	public void cadastrarVoo(Voo num) {
		
		this.listaVoos.add(num);
		System.out.println("Voo " + num + " cadastrado com sucesso.");
	}
	
	public void excluirVoo(Voo num) {
		
		this.listaVoos.remove(num);
		System.out.println("Voo " + num + " removido com sucesso.");
	}
	
	public void vendaVoo(Voo num) {
		
		
	}
}
