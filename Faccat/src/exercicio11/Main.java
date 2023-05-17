package exercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
		mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
		efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
		vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do
		vendedor.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		double carroVendido, totalVenda, salarioFixo, valorPorCarro, salarioFinal;
		
		System.out.println("DIGITE O N�MERO DE CARROS VENDIDOS: ");
		carroVendido = sc.nextDouble();
		System.out.println("DIGITE O VALOR TOTAL DE SUAS VENDAS: ");
		totalVenda = sc.nextDouble();
		System.out.println("DIGITE O SEU SAL�RIO FIXO: ");
		salarioFixo = sc.nextDouble();
		System.out.println("DIGITE O VALOR QUE RECEBE POR CARRO VENDIDO: ");
		valorPorCarro = sc.nextDouble();
		
		salarioFinal = salarioFixo + (carroVendido * valorPorCarro) + (totalVenda * 1.05);
		
		
		System.out.printf("SAL�RIO FINAL: R$ %.2f", salarioFinal);
		
	}

}
