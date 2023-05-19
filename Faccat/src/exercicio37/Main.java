package exercicio37;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de fruta (M-Morango, A-Maçã): ");
        char tipoFruta = sc.next().charAt(0);

        System.out.print("Digite a quantidade em quilogramas: ");
        double quantidade = sc.nextDouble();

        double precoMorangoAte5Kg = 2.50;
        double precoMorangoAcima5Kg = 2.20;
        double precoMacaAte5Kg = 1.80;
        double precoMacaAcima5Kg = 1.50;

        double valorAPagar = 0;

        if (tipoFruta == 'M' || tipoFruta == 'm') {
            if (quantidade <= 5) {
                valorAPagar = quantidade * precoMorangoAte5Kg;
            } else {
                valorAPagar = quantidade * precoMorangoAcima5Kg;
            }
        } else if (tipoFruta == 'A' || tipoFruta == 'a') {
            if (quantidade <= 5) {
                valorAPagar = quantidade * precoMacaAte5Kg;
            } else {
                valorAPagar = quantidade * precoMacaAcima5Kg;
            }
        }

        System.out.println("Valor a ser pago: R$ " + valorAPagar);

        sc.close();

	}

}
