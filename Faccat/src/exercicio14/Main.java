package exercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*   Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso
contr�rio escrever N�O � MAIOR QUE 10! */
		
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um n�mero: ");
		numero = sc.nextDouble();
		
		if(numero == 10) {
			System.out.println("� IGUAL A 10!");
		}
		else if(numero > 10) {
			System.out.println("� MAIOR QUE 10!");
		}
		else {
			System.out.println("N�O � MAIOR QUE 10!");
		}
		sc.close();
		

	}

}
