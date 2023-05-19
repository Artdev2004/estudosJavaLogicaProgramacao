package exercicio41;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = sc.nextDouble();

        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        String conceito;

        if (mediaAproveitamento >= 9) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6) {
            conceito = "C";
        } else if (mediaAproveitamento >= 4) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        sc.close();

	}

}
