package exercicio19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor: ");
	        int valor1 = sc.nextInt();

	        System.out.print("Digite o segundo valor: ");
	        int valor2 = sc.nextInt();

	        int maior;

	        if (valor1 > valor2) {
	            maior = valor1;
	        } else {
	            maior = valor2;
	        }

	        System.out.println("O maior valor é: " + maior);

	        sc.close();

	}

}
