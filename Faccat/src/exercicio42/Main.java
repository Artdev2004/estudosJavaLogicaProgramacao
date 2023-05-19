package exercicio42;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do empregado: ");
        int numeroEmpregado = sc.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite o ano de ingresso do empregado na empresa: ");
        int anoIngresso = sc.nextInt();

        int idade = calcularIdade(anoNascimento);
        int tempoTrabalho = calcularTempoTrabalho(anoIngresso);

        System.out.println("Idade: " + idade);
        System.out.println("Tempo de trabalho: " + tempoTrabalho);

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer aposentadoria");
        }

        sc.close();
    }

    private static int calcularIdade(int anoNascimento) {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - anoNascimento;
    }

    private static int calcularTempoTrabalho(int anoIngresso) {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - anoIngresso;
    }

	}


