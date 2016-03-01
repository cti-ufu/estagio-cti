package br.ufu.cti.estagio.testes.carlos.extra2;

import java.util.ArrayList;

public class Caixa {

	private ArrayList<FluxoDeCaixa> listaDespesas = new ArrayList<FluxoDeCaixa>();
	private ArrayList<FluxoDeCaixa> listaReceitas = new ArrayList<FluxoDeCaixa>();
	
	public Caixa(ArrayList<FluxoDeCaixa> listaDespesas, ArrayList<FluxoDeCaixa> listaReceitas) {
		
		this.listaDespesas = listaDespesas;
		this.listaReceitas = listaReceitas;
	}
	
	public void setListaDespesas(ArrayList<FluxoDeCaixa> lista) {
		
		listaDespesas = lista;
	}
	
	public ArrayList<FluxoDeCaixa> getListaDespesas() {
		
		return listaDespesas;
	}
	
	public void setListaReceitas(ArrayList<FluxoDeCaixa> lista) {
		
		listaReceitas = lista;
	}
	
	public ArrayList<FluxoDeCaixa> getListaReceitas() {
		
		return listaReceitas;
	}
	
	public void cadastrarReceita(String info, double valor) {
		
		if(valor > 0) {
			
			FluxoDeCaixa receita = new FluxoDeCaixa(info, valor);
			listaReceitas.add(receita);
		}
		
		else {
			
			System.out.println("Valor de receita invalido");
			return;
		}
	}
	
	public void cadastrarDespesa(String info, double valor) {
		
		if(valor <= 0) {
			
			FluxoDeCaixa despesa = new FluxoDeCaixa(info, valor);
			listaReceitas.add(despesa);
		}
		
		else {
			
			System.out.println("Valor de despesa invalido");
			return;
		}
	}
}
