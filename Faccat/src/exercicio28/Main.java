package exercicio28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor: ");
	        int valor1 = sc.nextInt();

	        System.out.print("Digite o segundo valor: ");
	        int valor2 = sc.nextInt();

	        System.out.print("Digite o terceiro valor: ");
	        int valor3 = sc.nextInt();

	        int maiorValor;

	        if (valor1 > valor2 && valor1 > valor3) {
	            maiorValor = valor1;
	        } else if (valor2 > valor3) {
	            maiorValor = valor2;
	        } else {
	            maiorValor = valor3;
	        }

	        System.out.println("O maior valor é: " + maiorValor);

	}

}
