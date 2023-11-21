package exercicio;

import java.util.Scanner;

public class Exercicio19Faccat {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("digite o primeiro valor:");
		int valor1 = ler.nextInt();
		System.out.println("digite o segundo valor:");
		int valor2= ler.nextInt();
		
		if(valor1 >valor2) {
		System.out.println("o maior valor digitado foi :"+valor1);
		}else {
		System.out.println("O maior valor digitado foi : "+valor2);
		}
		ler.close();
		
		
		
		
		
		
		
		}

}
