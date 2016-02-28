package extra1;

//import java.util.Scanner;

public class GameTime {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		
		int start;
		int end;
		
		/*
		System.out.print("What is the start time? ");
		start = input.nextInt();
		
		System.out.print("What is the end time? ");
		end = input.nextInt();
		*/
		
		start = 16;
		end = 2;
		tempoDoJogo(start, end);
		
		start = 0;
		end = 0;
		tempoDoJogo(start, end);
		
		start = 2;
		end = 16;
		tempoDoJogo(start, end);
		
	}
	
	static void tempoDoJogo(int start, int end) {
		
		int result = 0;
		if(end > start) {
			result = end - start;
		}
		
		if(end < start) {
			result = (24 - start) + end;
		}
		
		if(start == end) {
			result = 24;
		}
		
		System.out.println("O jogo durou " + result + " hora(s)");
	}
}
