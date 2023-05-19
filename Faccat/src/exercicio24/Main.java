package exercicio24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor das vendas efetuadas: ");
        double valorVendas = sc.nextDouble();

        double comissao;
        
        if (valorVendas <= 1500.00) {
            comissao = valorVendas * 0.03; // 3% de comissão sobre o total das vendas
        } else {
            double valorExcedente = valorVendas - 1500.00;
            comissao = (1500.00 * 0.03) + (valorExcedente * 0.05); // 3% de comissão até R$ 1.500,00 e 5% sobre o excedente
        }

        double salarioTotal = salarioFixo + comissao;

        System.out.println("O salário total do vendedor é: R$" + salarioTotal);

        sc.close();

	}

}
