package exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE UM NUMERO: \n");
		int x = sc.nextInt();
		
		System.out.println("Antecessor: " + (x - 1));
		
		sc.close();
	}

}
