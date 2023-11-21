package exercicio;

import java.util.Scanner;

public class Exercicio11Faccat {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o valor do seu salário fixo por mês:R$");
		float salarioFixo= sc.nextFloat();
		
		System.out.println("Digite o valor da sua comissão que recebe por cada carro vendido: R$");
		float comissaoFixa= sc.nextFloat();
		
		System.out.println("Digite a quantidade de carros vendidos no mês:");
		float quantidadeCarros= sc.nextFloat();
		
		System.out.println("Digite o valor total vendido no mês");
		float valorTotal= sc.nextFloat();
		
		float totalComissao= quantidadeCarros*comissaoFixa;
		float porcentagemValor=valorTotal*5/100;
		
		float valorFinal= salarioFixo+totalComissao+porcentagemValor;
		
		System.out.println("O valor final do salário corresponde a:R$");
		
		sc.close();
		
	
		
	   
	    
		
	    
		
		
		


		

		
	}

}
