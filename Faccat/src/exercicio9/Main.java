package exercicio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste.
		Calcular e escrever o valor do novo sal�rio.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio mensal: ");
		float salario = sc.nextFloat();
		
		System.out.println("Digite o percentual de reajuste: ");
		float porcenReajuste = sc.nextFloat();
		
		System.out.println("Novo Sal�rio: R$" + salario * (1 + (porcenReajuste/100)));
		
		sc.close();
	}
}
