package exercicio;

import java.util.Scanner;

public class Exercicio21Faccat {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		int horaInicial;
		int horaFinal;
		int duracaoJogo;
		System.out.println("qual foi o inicio do jogo de Xadrez:");
		horaInicial= ler. nextInt();
		
		System.out.println("qual foi o fim do jogo de xadrez:");
		horaFinal=ler.nextInt();
		
		if (horaFinal<horaInicial) {
		

		System.out.println("o tempo maximo:"+horaFinal+horaInicial); 

	}else { 
			System.out.println("o tempo excedeu o limite"); 


		
		}
	
		
		
		
	}

}
	
		
		
		
	

