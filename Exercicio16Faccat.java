package exercicio;

import java.util.Scanner;

public class Exercicio16Faccat {

	public static void main(String[] args) {
		
Scanner ler= new Scanner(System.in);
		
		
		
		System.out.print("Digite o número de maçãs compradas: ");
		        int macaCompradas = ler.nextInt();
		        
		 System.out.println("digite o custo total da compra:");
		 double custoTotal= ler.nextDouble();
		 
	if (macaCompradas < 12) {
		
	custoTotal =   macaCompradas*1.30;

	} else {
	custoTotal =macaCompradas * 1.00;
		            
		 
	 }
	System.out.print("Custo total da compra: R$ " + custoTotal);

		         ler.close();
		     }
		 


	}

