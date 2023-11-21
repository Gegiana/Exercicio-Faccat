package exercicio;

import java.util.Scanner;

public class Exercicio25Faccat {

	public static void main(String[] args) {
		
		try {
			Scanner ler = new Scanner(System.in);	

			
			System.out.println("Digite o numero da conta do cliente:");
			double numeroDaConta = ler.nextDouble();

			System.out.println("Digite o seu saldo:");
			double Saldo = ler.nextDouble();

			System.out.println("Digite o valor em debito:");
			double debito = ler.nextDouble();

			System.out.println("Digite o valor em credito:");
			double credito = ler.nextDouble();

			double saldoAtual = Saldo - debito + credito;

			System.out.println("Saldo atual:" + saldoAtual);

			if (saldoAtual >= 0) {
				System.out.println("Saldo Positivo");

			} else {
				System.out.println("Saldo Negativo");
			}

			ler.close();

		} catch (Exception e) {
			System.out.println("Caro amigo(a),não sei se percebeu, mas só aceitamos " + "numeros!!" + e);
		}

	}


	}

