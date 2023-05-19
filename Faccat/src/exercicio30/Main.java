package exercicio30;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();

        int menor, meio, maior;

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
            if (valor2 < valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
            if (valor1 < valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 < valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);

        sc.close();

	}

}
