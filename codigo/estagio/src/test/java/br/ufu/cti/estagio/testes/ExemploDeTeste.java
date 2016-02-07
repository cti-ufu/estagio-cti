package br.ufu.cti.estagio.testes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExemploDeTeste {

	@Test
	public void testandoAssertEqualSuccess() {

		// Teste com sucesso
		assertEquals("String", "String");

	}

	@Test
	public void testandoAssertEqualFail() {

		// Teste com falha
		assertEquals("fail", "success");

	}

}
