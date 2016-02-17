package br.ufu.cti.estagio.testes;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

class Music {
	String name; 

public static void main(String[] args){ 
	//cria objeto Music e o acessa
	Music one = new Music();
	one.name="Prey for me";
	//agora cria uma matriz Music
	Music[] title = new Music[3];
	title[0] =  new Music();
	title[1] =  new Music();
	title[2] =  one;
	// agora acessa os objetos  Musica
	//usando as referências da matriz
	title[0].name="I'm so sick";
	title[1].name="Vitória";
	System.out.println("O nome da múscia é");
	System.out.print(title[2].name);
}
}
