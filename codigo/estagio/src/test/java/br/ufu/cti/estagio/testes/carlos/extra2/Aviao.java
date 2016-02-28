package extra2;

public class Aviao {

	private String modelo;
	private long identificador;
	private int capacidadeDePassageiros;
	
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
