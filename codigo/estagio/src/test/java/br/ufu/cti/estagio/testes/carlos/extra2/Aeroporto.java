package br.ufu.cti.estagio.testes.carlos.extra2;

import java.util.ArrayList;

public class Aeroporto {

	private String nome;
	private double taxaDeEmbarque;
	private String codigoReduzido;
	private String endereco;
	private ArrayList<EmpresaAerea> listaEmpresasAereas = new ArrayList<EmpresaAerea>();
	static String var = "emp";
	static Integer cont = 0;
	
	public Aeroporto(String nome, double taxaDeEmbarque, String codigoReduzido, String endereco, ArrayList<EmpresaAerea> listaEmpresasAereas) {
		
		this.nome = nome;
		this.taxaDeEmbarque = taxaDeEmbarque;
		this.codigoReduzido = codigoReduzido;
		this.endereco = endereco;
		this.listaEmpresasAereas = listaEmpresasAereas;
	}
	
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
	
	public void setCodigoReduzido(String codigoReduzido) {
		
		this.codigoReduzido = codigoReduzido;
	}
	
	public String getCodigoReduzido() {
		
		return codigoReduzido;
	}
	
	public void setEndereco(String endereco) {
		
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		
		return endereco;
	}
	
	public void setListaEmpresasAereas(ArrayList<EmpresaAerea> listaEmpresasAereas) {
		
		this.listaEmpresasAereas = listaEmpresasAereas;
	}
	
	public ArrayList<EmpresaAerea> getListaEmpresasAereas() {
		
		return listaEmpresasAereas;
	}
	
	public void adicionarEmpresaAerea(EmpresaAerea emp) {
		
		listaEmpresasAereas.add(emp);
		System.out.println("Empresa " + emp + " adicionada � lista.");
	}
	
	public void removerEmpresaAerea(EmpresaAerea emp) {
		
		listaEmpresasAereas.remove(emp);
		System.out.println("Empresa " + emp + " removida da lista.");
	}
	
	public void verificarVoosEmpresas(EmpresaAerea emp) {
		
		System.out.println("A empresa " + emp + " tem " + emp.getListaVoos().size());

		for(Voo voo : emp.getListaVoos()) {
			
			System.out.printf("Voo %d%n", emp.getListaVoos().indexOf(voo) + 1 );
			System.out.println("Numero do voo: " + voo.getIdentificador());
			System.out.println("Origem: " + voo.getOrigem());
			System.out.println("Destino: " + voo.getDestino());
			System.out.println("Horario de Saida: " + voo.getHorarioSaida());
			System.out.println("Horario de Chegada: " + voo.getHorarioChegada());
			System.out.println();
		}
	}
}
