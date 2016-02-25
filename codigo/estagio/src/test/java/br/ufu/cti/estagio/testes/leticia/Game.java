package br.ufu.cti.estagio.testes.leticia;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Scanner;
public class Game {
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inicio:");
		int start=sc.nextInt();
		System.out.println("Fim:");
		int end=sc.nextInt();
		sc.close();
		int h;
		h=end-start;
			if(h<=0){
			h=24+(end-start);
		}
		if(start==end){
			System.out.println("O jogo durou 24 horas.");

		}
		else{
			System.out.println("O jogo durou");
			System.out.println(h+"hora(s).");
		}
				
	}
	
}