package exercicio;

import java.util.Scanner;

public class Exercicio10Faccat {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Digite o valor do custo de fabricação do automovel:R$");
		float valorAutomovel= sc.nextFloat();
		float distribuidor= valorAutomovel*28/100;
		float imposto= valorAutomovel*45/100;
		float valorFinal= valorAutomovel+distribuidor+imposto;
		System.out.println("Digite o valor do automovel correspondente:R$"+valorFinal);
		
		sc.close();
		
		
		
		
		
		

	}

}
