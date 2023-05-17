package exercicio1;

public class Main {

	public static void main(String[] args) {
		/*Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
		A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
		valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
		nas variáveis.*/
		
		
		int a = 10, b = 20 , c;
		
		
		
		System.out.println("O valor de A é: " +  a);
		System.out.println("O valor de B é: " +  b);
		c = a;
		a = b;
		b = c;
		
		System.out.println("O valor de A agora é: " +  a);
		System.out.println("O valor de B agora é: " +  b);
		

	}

}
