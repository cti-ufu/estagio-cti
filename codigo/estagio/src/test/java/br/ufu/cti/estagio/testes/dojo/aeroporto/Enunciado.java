package br.ufu.cti.estagio.testes.dojo.aeroporto;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Vamos pensar em um caso simples para o uso de classes e objetos.
 * 
 * Temos um aeroporto, que possui as seguintes características: nome, taxa de embarque, código 
 * reduzido, endereço e uma lista de empresas aéreas.
 * 
 * Uma empresa aérea possui: um nome, uma lista de aviões e uma lista de voos, caixa;
 * 
 * Um caixa possui: uma lista de despesas e receita;
 * 
 * Um  despesa ou receita consiste em uma descrição e um valor (negativo para despesa e positivo 
 * para receita)
 * 
 * Um avião possui: um modelo, um identificador, capacidade de passageiros;
 * 
 * Um voo possui: um identificador, origem, destino, iros horário de chegada e horário de saída.
 * 
 * Um passageiro possui: um nome, um cpf e uma lista de voos;
 * 
 * Um aeroporto pode realizar as seguintes ações:
 * - Adicionar uma empresa aérea;
 * - Remover uma empresa aérea;
 * - Verificar voos das empresas;
 * 
 * Uma empresa aérea pode realizar as seguintes ações:
 * - Cadastrar novo voo;
 * - Excluir voo (caso não tenha nenhum passageiro);
 * - Realizar venda de voo (cadastrar passageiro e receber o dinheiro do mesmo);
 * - Cadastrar nova despesa;
 * 
 * Um caixa pode:
 * - Cadastrar receita;
 * - Cadastrar despesa;
 * 
 * Um passageiro pode:
 * - Comprar um voo;
 * 
 * Utilize a imaginação para fazer este exercício, espera-se que sejam criadas as seguintes classes:
 * - Aeroporto;
 * - EmpresaAerea;
 * - Caixa;
 * - FluxoDeCaixa;
 * - Aviao;
 * - Voo;
 * - Passageiro.
 * 
 * As classes devem possuir os métodos get e set para seus atributos e os métodos descritos nas ações;
 * - Utilize Junit para testar seus métodos.
 * - Para cada método faça um teste de falha e um de sucesso;
 * - Utilize as padronizações de nomenclatura e código para realizar este trabalho.
 * 
 *   @author diego
 *
 */
public class Enunciado {

	@Test
	public void testarAdicionarEmpresaAerea (){
		
	}
	
	@Test
	public void testarRemoverEmpresaAerea () {
		
	}
	
	@Test
	public void testarVerificarVoosDasEmpresas (){
			
	}

	@Test
	public void testarCadastrarNovoVoo () {
		 
	}
	
	@Test
	public void testarExcluirVoo () {
		 
	}
	
	@Test
	public void testarRealizarVendaDeVoo (){
		 
	}
	
	@Test
	public void testarCadastrarNovaDespesa () {
		 
	}

	@Test
	public void testarCadastrarReceita () {
		
	}
	
	@Test
	public void testarCadastrarDespesa () {
		
	}
	
	@Test
	public void testarComprarVoo (){
		
	}
}
