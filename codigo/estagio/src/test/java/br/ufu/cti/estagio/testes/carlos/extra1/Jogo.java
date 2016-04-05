package br.ufu.cti.estagio.testes.carlos.extra1;

public class Jogo {
	
	private String name;
	private int start;
	private int end;
	
	public Jogo(String name, int start, int end) { //Constructor
		
		this.name = name;
		this.start = start;
		this.end = end;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setStart(int start) {
		
		this.start = start;
	}
	
	public void setEnd(int end) {
		
		this.end = end;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getStart() {
		
		return start;
	}
	
	public int getEnd() {
		
		return end;
	}

}
