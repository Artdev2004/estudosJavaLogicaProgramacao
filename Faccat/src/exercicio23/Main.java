package exercicio23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o sexo (M ou F): ");
        String sexo = sc.next();

        double pesoIdeal;

        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equals("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            sc.close();
            return;
        }

        System.out.println("O peso ideal de " + nome + " é " + pesoIdeal);

        sc.close();
	}
}
