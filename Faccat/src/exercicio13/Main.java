package exercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno.
		Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5. F�rmula para o c�lculo da m�dia
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
		
		
		System.out.println("M�dia: " + mediaFinal);
		
		
		
		

	}

}
