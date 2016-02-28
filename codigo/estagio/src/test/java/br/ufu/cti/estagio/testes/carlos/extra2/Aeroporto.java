package extra2;

import java.util.ArrayList;

public class Aeroporto {

	private String nome;
	private double taxaDeEmbarque;
	private long codigoReduzido;
	private String endereco;
	private ArrayList<EmpresaAerea> listaEmpresasAereas = new ArrayList<EmpresaAerea>();
	static String var = "emp";
	static Integer cont = 0;
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setTaxaDeEmbarque(double taxaDeEmbarque) {
		
		this.taxaDeEmbarque = taxaDeEmbarque;
	}
	
	public double getTaxaDeEmbarque() {
		
		return taxaDeEmbarque;
	}
	
	public void setCodigoReduzido(long codigoReduzido) {
		
		this.codigoReduzido = codigoReduzido;
	}
	
	public long getCodigoReduzido() {
		
		return codigoReduzido;
	}
	
	public void setEndereco(String endereco) {
		
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		
		return endereco;
	}
	
	private void setListaEmpresasAereas(ArrayList<EmpresaAerea> listaEmpresasAereas) {
		
		this.listaEmpresasAereas = listaEmpresasAereas;
	}
	
	private ArrayList<EmpresaAerea> getListaEmpresasAereas() {
		
		return listaEmpresasAereas;
	}
	
	public void adicionarEmpresaAerea(EmpresaAerea emp) {
		
		listaEmpresasAereas.add(emp);
		System.out.println("Empresa " + emp + " adicionada à lista.");
	}
	
	public void removerEmpresaAerea(EmpresaAerea emp) {
		
		listaEmpresasAereas.remove(emp);
		System.out.println("Empresa " + emp + " removida da lista.");
	}
	
	public void verificarVoosEmpresas(EmpresaAerea emp) {

		ArrayList<Voo> lista = emp.getListaVoos();
		int count = 0;
		for(Voo voos : lista) {
			count++;
			System.out.printf("Voo %d%n", count);
			System.out.println(voos.getIdentificador());
			System.out.println(voos.getOrigem());
			System.out.println(voos.getDestino());
			System.out.println(voos.getHorarioSaida());
			System.out.println(voos.getHorarioChegada());
			System.out.println();
		}
	}
}
