package Exercicio46;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        double valor1, valor2;

	        System.out.print("Digite o primeiro valor: ");
	        valor1 = sc.nextDouble();

	        do {
	            System.out.print("Digite o segundo valor: ");
	            valor2 = sc.nextDouble();

	            if (valor2 == 0) {
	                System.out.println("VALOR INVÁLIDO! O segundo valor não pode ser zero. Digite um novo valor.");
	            }
	        } while (valor2 == 0);

	        double resultado = valor1 / valor2;
	        System.out.println("Resultado da divisão: " + resultado);

	        sc.close();

	}

}
