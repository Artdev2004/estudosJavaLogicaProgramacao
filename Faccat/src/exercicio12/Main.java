package exercicio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
		correspondente em graus Celsius (baseado na fórmula abaixo):
		*/
		Scanner sc = new Scanner(System.in);
		
		int fahrenheit, celsius ;
		System.out.println("Digite uma temperatura em °F: ");
		fahrenheit = sc.nextInt();
		
		celsius = ((fahrenheit - 32) / 9) * 5; 

		System.out.println("Temperatura em °C: " + celsius);
		
		sc.close();
	}

}
