package exercicio;

import java.util.Scanner;

public class Exercicio05Faccat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Digite um valor para saber o seu antecessor :");
		
		Scanner sc = new Scanner(System.in);
		
		int valor=sc.nextInt();
		
		int antecessor=valor -1;
		
		System.out.println("O antecessor do numero digitado e: "+antecessor);
	}

}
