package exercicio35;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        int litros = sc.nextInt();

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipoCombustivel = sc.next().charAt(0);

        double precoAlcool = 2.90;
        double precoGasolina = 3.30;
        double valorAPagar = 0;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                valorAPagar = litros * (precoAlcool - (precoAlcool * 0.03));
            } else {
                valorAPagar = litros * (precoAlcool - (precoAlcool * 0.05));
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                valorAPagar = litros * (precoGasolina - (precoGasolina * 0.04));
            } else {
                valorAPagar = litros * (precoGasolina - (precoGasolina * 0.06));
            }
        }

        System.out.println("Valor a ser pago pelo cliente: R$ " + valorAPagar);

        sc.close();

	}

}
