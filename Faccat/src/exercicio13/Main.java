package exercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
		Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
		*/
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3;
		double mediaFinal;
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		
		mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		
		System.out.println("Média: " + mediaFinal);
		
		
		
		

	}

}
