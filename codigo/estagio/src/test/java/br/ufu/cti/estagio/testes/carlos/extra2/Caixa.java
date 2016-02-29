package br.ufu.cti.estagio.testes.carlos.extra2;

import java.util.ArrayList;

public class Caixa {

	private ArrayList<FluxoDeCaixa> listaDespesas = new ArrayList<FluxoDeCaixa>();
	private ArrayList<FluxoDeCaixa> listaReceitas = new ArrayList<FluxoDeCaixa>();
	
	public void setListaDespesas(ArrayList lista) {
		
		listaDespesas = lista;
	}
	
	public ArrayList getListaDespesas() {
		
		return listaDespesas;
	}
	
	public void setListaReceitas(ArrayList lista) {
		
		listaReceitas = lista;
	}
	
	public ArrayList getListaReceitas() {
		
		return listaReceitas;
	}
	
	public void cadastrarReceita(String info, double valor) {
		
		FluxoDeCaixa receita = new FluxoDeCaixa(info, valor);
		listaReceitas.add(receita);
	}
	
	public void cadastrarDespesa(String info, double valor) {
		
		FluxoDeCaixa despesa = new FluxoDeCaixa(info, valor);
		listaReceitas.add(despesa);
	}
}
