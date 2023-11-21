package exercicio;

import java.util.Scanner;

public class Exercicio31Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
				
		System.out.println("Digite o valor do lado A:");
        double A = sc.nextDouble(); 

        System.out.println("Digite o valor do lado B:");
        double B = sc.nextDouble();

        System.out.println("Digite o valor do lado C:");
        double C = sc.nextDouble();

        //Se lado A for menor que lado B soma lado C;
        //Se lado B for menor que lado A soma lado C;
        //Se lado C for menor que lado A soma lado B;
        if ((A<B+C)&&(B<A+C)&&(C<A+B)) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
      
		} catch (Exception e) {
			System.out.println("Erro. Digite somente números!!!"+e);
		}
        sc.close();
    }

	}
