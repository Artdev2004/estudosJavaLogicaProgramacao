package exercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um valor: ");
	        int valor = sc.nextInt();

	        if (valor >= 0) {
	            System.out.println("O valor � positivo.");
	        } else {
	            System.out.println("O valor � negativo.");
	        }

	        sc.close();
	}

}
