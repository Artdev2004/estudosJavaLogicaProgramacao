package exercicio25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o n�mero da conta do cliente: ");
        int numeroConta = sc.nextInt();

        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o d�bito: ");
        double debito = sc.nextDouble();

        System.out.print("Digite o cr�dito: ");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println("Saldo atual: " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        sc.close();
		
	}

}
