package exercicio31;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        double ladoA = sc.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double ladoB = sc.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double ladoC = sc.nextDouble();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            System.out.println("Os valores informados formam um triângulo.");
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        sc.close();

	}

}
