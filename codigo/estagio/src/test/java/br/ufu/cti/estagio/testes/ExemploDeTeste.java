package br.ufu.cti.estagio.testes;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ExemploDeTeste {

	@Test
	public void testandoAssertEqualSuccess() {
		System.out.println("Leticia");
		// Teste com sucesso
		assertEquals("String", "String");

	}

	@Ignore @Test
	public void testandoAssertEqualFail() {

		// Teste com falha
		assertEquals("fail", "success");

	}

}
