package exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a
		�rea do ret�ngulo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do ret�ngulo: ");
		float base = sc.nextFloat();
		System.out.println("Digite a altura do ret�ngulo: ");
		float altura = sc.nextFloat();
		
		System.out.println("�rea do ret�ngulo: " + (base * altura));
		
		
		sc.close();
		
		}
}
