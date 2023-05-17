package exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
		área do retângulo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do retângulo: ");
		float base = sc.nextFloat();
		System.out.println("Digite a altura do retângulo: ");
		float altura = sc.nextFloat();
		
		System.out.println("Área do retângulo: " + (base * altura));
		
		
		sc.close();
		
		}
}
