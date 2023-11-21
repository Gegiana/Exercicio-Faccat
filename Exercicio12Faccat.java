package exercicio;

import java.util.Scanner;

public class Exercico12Faccat {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Digite a temperatura em graus Fahrenheit:");
        double fahrenheit= sc.nextDouble();
        
        double testeCelsius = fahrenheit - 32 * 5 / 9;

        System.out.println("A temperatura em graus Celsius é: " +testeCelsius);

        // Testando 
        
        double testeFahrenheit = 212;
        double testeCelsius1 = (testeFahrenheit - 32) * 5 / 9;
        System.out.println("Testando: 212F em Celsius é: " + testeCelsius1);
        {     
 }


		
		

	}

}
