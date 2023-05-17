package exercicio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos
		brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total
		de eleitores. */
		
		Scanner sc = new Scanner(System.in);
		
		int totalEleitor, votoBranco, votoValido, votoNulo;
		
		
		System.out.println("Digite o n�mero total de Eleitores: ");
		totalEleitor = sc.nextInt();
		
		System.out.println("Digite n�mero de votos nulos: ");
		votoNulo = sc.nextInt();
		System.out.println("Digite n�mero de votos brancos: ");
		votoBranco = sc.nextInt();
		System.out.println("Digite n�mero de votos v�lidos: ");
		votoValido = sc.nextInt();
			
		System.out.println("Porcentagem de votos V�lidos: " + votoValido * 100 / totalEleitor + "%");
		System.out.println("\nPorcentagem de votos Branco: " + votoBranco * 100 / totalEleitor + "%");
		System.out.println("\nPorcentagem de votos Nulo: " + votoNulo * 100 / totalEleitor + "%");
		
		sc.close();
	}
}
