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
		
		float porcentagemValido = votoValido * 100 / totalEleitor;
		float porcentagemBranco = votoBranco * 100 / totalEleitor;
		float porcentagemNulo = votoNulo * 100 / totalEleitor;
		
		System.out.printf("Porcentagem de votos Válidos: " + porcentagemValido);
		System.out.printf("\nPorcentagem de votos Branco: " + porcentagemBranco);
		System.out.printf("\nPorcentagem de votos Nulo: " + porcentagemNulo);
	}
}
