package br.ufu.cti.estagio.testes.dojo.aeroporto;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestePassageiro {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testeCriarPassageiro (){
		Passageiro passageiro = new Passageiro();
		Voo voo = new Voo();
		passageiro.setNome("Passageiro 1");
		passageiro.setCpf("12312312334");
		passageiro.adicionarVoos(voo);
	}

}
