package exercicio1;

public class Main {

	public static void main(String[] args) {
		/*Escreva um algoritmo que armazene o valor 10 em uma vari�vel A e o valor 20 em uma vari�vel B.
		A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com que o
		valor que est� em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
		nas vari�veis.*/
		
		
		int a = 10, b = 20 , c;
		
		
		
		System.out.println("O valor de A �: " +  a);
		System.out.println("O valor de B �: " +  b);
		c = a;
		a = b;
		b = c;
		
		System.out.println("O valor de A agora �: " +  a);
		System.out.println("O valor de B agora �: " +  b);
		

	}

}
