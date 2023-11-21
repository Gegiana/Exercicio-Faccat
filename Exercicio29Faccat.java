package exercicio;

import java.util.Scanner;

public class Exercicio29Faccat {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int v1 = ler.nextInt();
		System.out.print("Digite o segundo valor: ");
		int v2 = ler.nextInt();

		System.out.print("Digite o terceiro valor: ");
		int v3 = ler.nextInt();

		int somaDosMaiores;

		if (v1 > v2 && v1 > v3) {
		 somaDosMaiores = v1 + Math.max(v2, v3);
		somaDosMaiores = v1;

		}else if (v2 > v1 && v2 > v3) {
		somaDosMaiores = v2 + Math.max(v1, v3);
		        } 
		 else {
		 somaDosMaiores = v3 + Math.max(v1, v2);
		        }

		  System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

		  ler.close();
		    }



	}
