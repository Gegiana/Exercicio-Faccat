package exercicio;

import java.util.Scanner;

public class ExercicioFaccat06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Programa que efetue o calculo da area do retangulo");
	    
	    System.out.println("Digite o valor da base do retangulo:");
	    float base = sc.nextFloat();
	    
	    System.out.println("Digite o valor da altura do retangulo:");
	    float altura = sc.nextFloat();
	    
	    float area = base*altura;
	    
	   System.out.println("O valor da area é:"+area);
	   
	   sc.close();
	    
	    
	    
		

	}

}
