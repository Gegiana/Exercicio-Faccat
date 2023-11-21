package exercicio;

import java.util.Scanner; 

public class Exercicio20Faccat {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner (System.in);
    	System.out.println("digite o 1° valor: ");
    	int vlor1= ler.nextInt();
    	
    	System.out.println("digite o 2° valor:");
    	int vlor2= ler.nextInt();
    	
    	if(vlor1==vlor2) {
    		System.out.println("Digite valores distintos,seu corno!!");
    		
    	}else if(vlor1>vlor2) {
    		
    		System.out.println( "O menor valor digitado foi: "+vlor2+" e o maior numero digitado foi:"+vlor1);
    	
    	}else {
    		System.out.println("O menor valor digitado foi: "+vlor1+" e o maior numero digitado foi:"+vlor2);
    
    	
    	}ler.close();
    	 
	}
}

