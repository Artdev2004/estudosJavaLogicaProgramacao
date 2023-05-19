package exercicio32;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = sc.nextLine();

        System.out.print("Digite o número de gols marcados pelo primeiro time: ");
        int golsTime1 = sc.nextInt();

        System.out.print("Digite o nome do segundo time: ");
        sc.nextLine(); // Consumir a quebra de linha pendente
        String time2 = sc.nextLine();

        System.out.print("Digite o número de gols marcados pelo segundo time: ");
        int golsTime2 = sc.nextInt();

        String vencedor;

        if (golsTime1 > golsTime2) {
            vencedor = time1;
        } else if (golsTime2 > golsTime1) {
            vencedor = time2;
        } else {
            vencedor = "EMPATE";
        }

        System.out.println("O vencedor da partida é: " + vencedor);

        sc.close();

	}

}
