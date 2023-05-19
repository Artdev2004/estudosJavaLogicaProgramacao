package exercicico36;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a idade do primeiro homem: ");
	        int idadeHomem1 = sc.nextInt();

	        System.out.print("Digite a idade do segundo homem: ");
	        int idadeHomem2 = sc.nextInt();

	        System.out.print("Digite a idade da primeira mulher: ");
	        int idadeMulher1 = sc.nextInt();

	        System.out.print("Digite a idade da segunda mulher: ");
	        int idadeMulher2 = sc.nextInt();

	        int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
	        int homemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
	        int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);
	        int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);

	        int somaIdades = homemMaisVelho + mulherMaisNova;
	        int produtoIdades = homemMaisNovo * mulherMaisVelha;

	        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
	        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);

	        sc.close();

	}

}
