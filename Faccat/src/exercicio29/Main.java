package exercicio29;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();

        int somaDosMaiores;

        if (valor1 > valor2 && valor1 > valor3) {
            somaDosMaiores = valor2 + valor3;
        } else if (valor2 > valor1 && valor2 > valor3) {
            somaDosMaiores = valor1 + valor3;
        } else {
            somaDosMaiores = valor1 + valor2;
        }

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

        sc.close();

	}

}
