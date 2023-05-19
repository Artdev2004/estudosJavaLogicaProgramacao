package exercicio33;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        if (valor1 == valor2) {
            System.out.println("Números iguais");
        } else if (valor1 > valor2) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }

        sc.close();


	}

}
