package exercicio38;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o c�digo de usu�rio: ");
        int codigoUsuario = sc.nextInt();

        if (codigoUsuario != 1234) {
            System.out.println("Usu�rio inv�lido!");
        } else {
            System.out.print("Digite a senha: ");
            int senha = sc.nextInt();

            if (senha != 9999) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido");
            }
        }

        sc.close();

	}

}
