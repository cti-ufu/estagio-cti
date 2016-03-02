package br.ufu.cti.estagio.testes.leticia;

public class Empresa extends Aeroporto {
	String nomeEmpresa;
	float caixa;
	public Empresa(){
		
	}
	public Empresa(String nomeEmpresa) {
		super();
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getNome() {
		return nomeEmpresa;
	}
	public void setNome(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public float getCaixa() {
		return caixa;
	}
	public void setCaixa(float caixa) {
		this.caixa = caixa;
	}
	
}
