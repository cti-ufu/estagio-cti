package extra2;

import java.util.ArrayList;

public class Caixa {

	private ArrayList<Despesas> listaDespesas = new ArrayList<Despesas>();
	private ArrayList<Receitas> listaReceitas = new ArrayList<Receitas>();
	
	private void setListaDespesas(ArrayList listaDespesas) {
		
		this.listaDespesas = listaDespesas;
	}
	
	private ArrayList getListaDespesas() {
		
		return listaDespesas;
	}
	
	private void setListaReceitas(ArrayList listaReceitas) {
		
		this.listaReceitas = listaReceitas;
	}
	
	private ArrayList getListaReceitas() {
		
		return listaReceitas;
	}
}
