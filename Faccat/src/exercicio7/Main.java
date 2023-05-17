package exercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
		dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */
		
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Escreva qual a sua idade em anos: ");
		int anos = sc.nextInt();
		System.out.println("Digite quantos meses se passaram desde o uúltimo aniversário: ");
		int meses = sc.nextInt();
		System.out.println("Digite o dia de hoje: ");
		int diaHoje = sc.nextInt();
		
		
		int idadeEmDias = (anos * 365) + (meses * 30) - diaHoje;
		
		System.out.println("IDADE EXPRESSA EM DIAS: " + idadeEmDias);
		
		
	}
}
