package br.ufu.cti.estagio.testes.carlos.extra2;

public class Aviao {

	private String modelo;
	private long identificador;
	private int capacidadeDePassageiros;
	
	public Aviao(String modelo, long identificador, int capacidadeDePassageiros) {
		
		this.modelo = modelo;
		this.identificador = identificador;
		this.capacidadeDePassageiros = capacidadeDePassageiros;
	}
	
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
	}
	
	public String getModelo() {
		
		return modelo;
	}
	
	public void setIdentificador(long identificador) {
		
		this.identificador = identificador;
	}
	
	public long getIdentificador() {
		
		return identificador;
	}
	
	public void setCapacidadeDePassageiros(int capacidadeDePassageiros) {
		
		this.capacidadeDePassageiros = capacidadeDePassageiros;
	}
	
	public long getCapacidadeDePassageiros() {
		
		return capacidadeDePassageiros;
	}
}
