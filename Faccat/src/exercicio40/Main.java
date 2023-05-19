package exercicio40;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);

        System.out.print("Digite a descri��o do produto: ");
        String descricaoProduto = sc.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidadeAdquirida = sc.nextInt();

        System.out.print("Digite o pre�o unit�rio: ");
        double precoUnitario = sc.nextDouble();

        double total = quantidadeAdquirida * precoUnitario;
        double desconto = 0;

        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02;
        } else if (quantidadeAdquirida <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalPagar = total - desconto;

        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + totalPagar);

        sc.close();

	}

}
