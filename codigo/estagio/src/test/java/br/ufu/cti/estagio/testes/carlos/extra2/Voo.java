package br.ufu.cti.estagio.testes.carlos.extra2;

import java.util.ArrayList;
import java.util.Calendar;

public class Voo {

	private long identificador;
	private String origem;
	private String destino;
	private Calendar horarioChegada = Calendar.getInstance();
	private Calendar horarioSaida = Calendar.getInstance();
	private ArrayList<Passageiro> listaPassageiros = new ArrayList<Passageiro>(); //Adicionar capacidade de passageiros do objeto da classe Aviao
	
	public Voo(long identificador, String origem, String destino, Calendar horarioChegada, Calendar horarioSaida, ArrayList<Passageiro> listaPassageiros) {
		
		this.identificador = identificador;
		this.origem = origem;
		this.destino = destino;
		this.horarioChegada = horarioChegada;
		this.horarioSaida = horarioSaida;
		this.listaPassageiros = listaPassageiros;
	}
	
	public void setIdentificador(long identificador) {
		
		this.identificador = identificador;
	}
	
	public long getIdentificador() {
		
		return identificador;
	}
	
	public void setOrigem(String origem) {
		
		this.origem = origem;
	}
	
	public String getOrigem() {
		
		return origem;
	}
	
	public void setDestino(String destino) {
		
		this.destino = destino;
	}
	
	public String getDestino() {
		
		return destino;
	}
	
	public void setHorarioChegada(Calendar horarioChegada) {
		
		this.horarioChegada = horarioChegada;
	}
	
	public Calendar getHorarioChegada() {
		
		return horarioChegada;
	}
	
	public void setHorarioSaida(Calendar horarioSaida) {
		
		this.horarioSaida = horarioSaida;
	}
	
	public Calendar getHorarioSaida() {
		
		return horarioSaida;
	}
	
	public void setListaPassageiros(ArrayList<Passageiro> listaPassageiros) {
		
		this.listaPassageiros = listaPassageiros;
	}
	
	public ArrayList<Passageiro> getListaPassageiros() {
		
		return listaPassageiros;
	}
}
