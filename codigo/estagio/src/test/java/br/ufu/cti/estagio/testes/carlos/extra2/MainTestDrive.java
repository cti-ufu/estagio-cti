package br.ufu.cti.estagio.testes.carlos.extra2;

public class MainTestDrive {

	public static void main(String[] args) {
		
		Passageiro carlos = new Passageiro("Carlos Humberto de Paula Borges", "123.456.789-00", null);
		Aeroporto uberlandia = new Aeroporto("Aeroporto Rock n Roll", 20, "UDI", "Av. Randon Pacheco", null);
		Caixa caixaTam = new Caixa(null, null);
		EmpresaAerea tam = new EmpresaAerea("Tam", null, null, caixaTam);
		Aviao boing = new Aviao("357", 654321, 150);
		
	}
}
