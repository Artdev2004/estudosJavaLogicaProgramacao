package exercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do
			distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor
			seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro,
			calcular e escrever o custo final ao consumidor
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		double custoFabrica, precoFinal;
		
		System.out.println("Digite o Custo de f�brica do carro: ");
		custoFabrica = sc.nextDouble();
		
		precoFinal =  custoFabrica + custoFabrica * 0.28 + custoFabrica * 0.45;
		System.out.printf("CUSTO FINAL: R$ %.2f", precoFinal );
		

	}

}
