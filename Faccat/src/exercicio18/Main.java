package exercicio18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Voc� poder� votar este ano!");
        } else {
            System.out.println("Voc� n�o poder� votar este ano.");
        }
        sc.close();
	}
}
