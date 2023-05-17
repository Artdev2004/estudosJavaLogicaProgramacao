package exercicio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
		Calcular e escrever o valor do novo salário.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário mensal: ");
		float salario = sc.nextFloat();
		
		System.out.println("Digite o percentual de reajuste: ");
		float porcenReajuste = sc.nextFloat();
		
		System.out.println("Novo Salário: R$" + salario * (1 + (porcenReajuste/100)));
		
		sc.close();
	}
}
