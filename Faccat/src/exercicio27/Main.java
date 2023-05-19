package exercicio27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner  sc = new Scanner(System.in);

	        System.out.print("Digite um valor: ");
	        int valor = sc.nextInt();

	        if (valor > 0) {
	            System.out.println("O valor é positivo");
	        } else if (valor < 0) {
	            System.out.println("O valor é negativo");
	        } else {
	            System.out.println("O valor é zero");
	        }

	        sc.close();
	}

}
