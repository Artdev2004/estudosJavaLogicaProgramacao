package exercicio17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a nota da 1ª avaliação: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a nota da 2ª avaliação: ");
	        double nota2 = scanner.nextDouble();

	        double media = (nota1 + nota2) / 2;

	        System.out.println("A média do aluno é: " + media);

	        if (media >= 6.0) {
	            System.out.println("O aluno foi aprovado!");
	        } else {
	            System.out.println("O aluno foi reprovado.");
	            
	            scanner.close();
	}
	        
	}
}
