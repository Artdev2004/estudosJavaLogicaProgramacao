package exercicio47;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextDouble();

        while (valor2 == 0) {
            System.out.println("VALOR INV�LIDO! O segundo valor n�o pode ser zero.");
            System.out.print("Digite o segundo valor novamente: ");
            valor2 = sc.nextDouble();
        }

        double resultado = valor1 / valor2;
        System.out.println("Resultado da divis�o: " + resultado);

        sc.close();

	}

}
