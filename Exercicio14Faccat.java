package exercicio;

import java.util.Scanner;

public class Exercicio14Faccat {

	public static void main(String[] args) {
		
Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = ler. nextInt();
		
		if( valor < 10){
		System.out.println("Não é maior que 10!");
	
	}else if (valor ==10) {
		System.out.println(" igual a 10!");
	} else {
		
		System.out.println("É maior que 10!");
	}
		ler.close();
	} 
	}


