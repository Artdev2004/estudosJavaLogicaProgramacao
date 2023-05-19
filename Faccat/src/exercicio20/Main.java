package exercicio20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        int menor, maior;

        if (valor1 < valor2) {
            menor = valor1;
            maior = valor2;
        } else {
            menor = valor2;
            maior = valor1;
        }

        System.out.println("Valores em ordem crescente: " + menor + ", " + maior);

        sc.close();

	}

}
