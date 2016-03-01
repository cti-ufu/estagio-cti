package br.ufu.cti.estagio.testes.carlos.extra2;

import java.util.ArrayList;

public class EmpresaAerea{

	private String nome;
	private ArrayList<String> listaAvioes = new ArrayList<String>();
	private ArrayList<Voo> listaVoos = new ArrayList<Voo>();
	private Caixa caixa;
	
	public EmpresaAerea(String nome, ArrayList<String> listaAvioes, ArrayList<Voo> listaVoos, Caixa caixa) {
		
		this.nome = nome;
		this.listaAvioes = listaAvioes;
		this.listaVoos = listaVoos;
		this.caixa = caixa;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setListaAvioes(ArrayList<String> listaAvioes) {
		
		this.listaAvioes = listaAvioes;
	}
	
	public ArrayList<String> getListaAvioes() {
		
		return listaAvioes;
	}
	
	public void setListaVoos(ArrayList<Voo> listaVoos) {
		
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
	
	public void vendaVoo(Voo num, Passageiro pas, double valor, Caixa caixa) {
		
		if(this.listaVoos.contains(num) == true) {
			
			if(this.listaVoos.size() < 150) {
				
				if(valor == 300) {
					
					num.getListaPassageiros().add(pas);
					pas.getListaVoos().add(num);
					String info = "Venda de passagem do Voo " + num + ".";
					FluxoDeCaixa receita = new FluxoDeCaixa(info, valor);
					caixa.getListaReceitas().add(receita);
				}
				
				else {
					
					System.out.println("Valor de pagamento (" + valor + "R$) nao confere com o preco da passagem (300R$):");
					return;
				}
			}
			
			else {
				
				System.out.println("Nao ha mais vagas para passageiros.");
				return;
			}
		}
		
		else {
			
			System.out.println("Voo nao existe.");
			return;
		}
		
	}
	
	public void cadastrarNovaDespesa(String info, double valor, Caixa caixa) {
		
		caixa.cadastrarDespesa(info, valor);
	}
}
