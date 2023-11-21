package exercicio;

import java.util.Scanner;

public class Exercicio23Faccat {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Informe o seu nome:");
		String nome =  sc.next();
		
		System.out.println("Informe o seu sexo:");
		 char sexo = sc.next().charAt(0);
		 
		 
	    System.out.println("Digite a altura:");
	    float altura= sc.nextFloat();
	    
	    double pesoIdeal;
	    
		if((sexo== 'm')||(sexo=='M')) {
	    pesoIdeal = 72.2 * altura-58;
	    System.out.println("O peso ideal do (a) "+ nome + "é :"+ pesoIdeal);
	    
	    }else if((sexo== 'f')||(sexo=='F')) {
	  	 pesoIdeal= 62.1* altura-44.7;
	  	System.out.println("O peso ideal do (a) "+ nome + " é :" + pesoIdeal);
		
	    }else {
	    	System.out.println("Caracter digitado não correponde a nenhum sexo.");
	    
	    }
		}	
			
			
			
		}

