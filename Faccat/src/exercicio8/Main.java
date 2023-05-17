package exercicio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
		brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
		de eleitores. */
		
		Scanner sc = new Scanner(System.in);
		
		int totalEleitor, votoBranco, votoValido, votoNulo;
		
		
		System.out.println("Digite o número total de Eleitores: ");
		totalEleitor = sc.nextInt();
		
		System.out.println("Digite número de votos nulos: ");
		votoNulo = sc.nextInt();
		System.out.println("Digite número de votos brancos: ");
		votoBranco = sc.nextInt();
		System.out.println("Digite número de votos válidos: ");
		votoValido = sc.nextInt();
			
		System.out.println("Porcentagem de votos Válidos: " + votoValido * 100 / totalEleitor + "%");
		System.out.println("\nPorcentagem de votos Branco: " + votoBranco * 100 / totalEleitor + "%");
		System.out.println("\nPorcentagem de votos Nulo: " + votoNulo * 100 / totalEleitor + "%");
		
		sc.close();
	}
}
