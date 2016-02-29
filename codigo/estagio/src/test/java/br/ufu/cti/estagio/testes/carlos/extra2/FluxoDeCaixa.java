package br.ufu.cti.estagio.testes.carlos.extra2;

public class FluxoDeCaixa {

	private String descricao;
	private double valor;
	
	public FluxoDeCaixa(String descricao, double valor) {
		
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public void setDescricao(String descricao) {
		
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		
		return descricao;
	}
	
	public void setValor(double valor) {
		
		this.valor = valor;
	}
	
	public double getValor() {
		
		return valor;
	}
}
