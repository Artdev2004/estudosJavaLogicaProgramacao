package exercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o n�mero de ma��s compradas: ");
        int quantidadeMacas = sc.nextInt();

        double custoTotal;

        if (quantidadeMacas < 12) {
            custoTotal = quantidadeMacas * 1.30;
        } else {
            custoTotal = quantidadeMacas * 1.00;
        }

        System.out.printf("O custo total da compra �: R$ %.2f", custoTotal);
        
        sc.close();

	}

}
