package exercicio26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a quantidade atual em estoque: ");
	        int quantidadeAtual = sc.nextInt();

	        System.out.print("Digite a quantidade m�xima em estoque: ");
	        int quantidadeMaxima = sc.nextInt();

	        System.out.print("Digite a quantidade m�nima em estoque: ");
	        int quantidadeMinima = sc.nextInt();

	        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

	        System.out.println("Quantidade m�dia: " + quantidadeMedia);

	        if (quantidadeAtual >= quantidadeMedia) {
	            System.out.println("N�o efetuar compra");
	        } else {
	            System.out.println("Efetuar compra");
	        }

	        sc.close();

	}

}
