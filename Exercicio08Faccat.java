package exercicio;

import java.util.Scanner;

public class Exercicio08Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Digite a quantidade total de eleitores do municipio:");
	float quantidadeTotalEleitores=sc.nextInt();
	System.out.println("Digite a quantidade de votos brancos do municipio");
	int quantidadeVotosBrancos=sc.nextInt();
	System.out.println("Digite a quantidade de votos nulos:");
	float quantidadeVotosNulos=sc.nextInt();
	System.out.println("Digite a quantidade de votos validos do municipio:");
	float quantidadeVotosValidos=sc.nextInt();
	
	//Processamento
	
	float porcentagemVotosBrancos= quantidadeVotosBrancos/quantidadeTotalEleitores*100;
	
	//Saída
	
	System.out.println("A porcentagem de votos brancos corresponde a:"+porcentagemVotosBrancos+"%");
	
	}
}	


	
	
