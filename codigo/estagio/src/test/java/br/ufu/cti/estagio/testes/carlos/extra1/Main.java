package br.ufu.cti.estagio.testes.carlos.extra1;

import java.io.IOException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		int start;
		int end;
		int result = 0;
		
		System.out.print("What is the start time? ");
		start = input.nextInt();
		
		System.out.print("What is the end time? ");
		end = input.nextInt();
		
		if(end > start) {
			result = end - start;
		}
		
		if(end < start) {
			result = (24 - start) + end;
		}
		
		if(start == end) {
			result = 24;
		}
		
		System.out.println("O JOGO DUROU " + result +" HORA(S)");
	}
}
