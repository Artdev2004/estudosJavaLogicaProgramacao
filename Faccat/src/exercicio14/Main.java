package exercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*   Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10! */
		
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextDouble();
		
		if(numero == 10) {
			System.out.println("É IGUAL A 10!");
		}
		else if(numero > 10) {
			System.out.println("É MAIOR QUE 10!");
		}
		else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}
		sc.close();
		

	}

}
