package exercicio;

import java.util.Scanner;

public class Exercicio30Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
		
		System.out.println("Insira o 1º valor");
		int n1 = sc.nextInt();
		System.out.println("Insira o 2º valor");
		int n2 = sc.nextInt();
		System.out.println("Insira o 3º valor");
		int n3 = sc.nextInt();
		
		if ((n1==n2)||(n2==n3)||(n3==n1)) {
			System.out.println("Valores iguais não são permitidos.");
		} else if ((n1<n2)&&(n2<n3)) { //se o 1º valor for menor que 2º; e o 2º valor for menor que 3;
			System.out.println("A ordem crescente ficou "+n1+" "+n2+" "+n3+".");
		} else if ((n1<n3)&&(n3<n2)) { //se o 1º valor for menor que 3º; e o 3º valor for menor que 2;
			System.out.println("A ordem crescente ficou "+n1+" "+n3+" "+n2+".");
		} else if ((n2<n1)&&(n1<n3)) { //se o 2º valor for menor que 1º; e o 1º valor for menor que 3;
			System.out.println("A ordem crescente ficou "+n2+" "+n1+" "+n3+".");
		} else if ((n2<n3)&&(n3<n1)) { //se o 2º valor for menor que 3º; e o 3º valor for menor que 1;
			System.out.println("A ordem crescente ficou "+n2+" "+n3+" "+n1+".");
		} else if ((n3<n1)&&(n1<n2)) { //se o 3º valor for menor que 1º; e o 1º valor for menor que 2;
			System.out.println("A ordem crescente ficou "+n3+" "+n1+" "+n2+".");
		} else                         //se não for nenhuma, a ordem crescente será n3 < n2 < n1;
			System.out.println("A ordem crescente ficou "+n3+" "+n2+" "+n1+".");
		
		} catch (Exception e) {
			System.out.println("Erro. Digite somente números!!!"+e);
		}

		sc.close();
		}
	
	}
