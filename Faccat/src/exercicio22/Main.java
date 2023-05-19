package exercicio22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int horasSemanais = 40; // Jornada de trabalho semanal em horas
        int semanasMes = 4; // Número de semanas no mês

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor do salário por hora: ");
        double salarioHora = sc.nextDouble();

        int horasExtras = horasTrabalhadas - (horasSemanais * semanasMes);

        double salarioTotal;

        if (horasExtras > 0) {
            double valorHoraExtra = salarioHora * 1.5; // Valor da hora extra com acréscimo de 50%
            double salarioHoraNormal = horasSemanais * salarioHora; // Salário das horas normais (jornada semanal)
            double salarioHorasExtras = horasExtras * valorHoraExtra; // Salário das horas extras

            salarioTotal = salarioHoraNormal + salarioHorasExtras;
        } else {
            salarioTotal = horasTrabalhadas * salarioHora; // Sem horas extras, calcula o salário total com base nas horas trabalhadas
        }

        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

        sc.close();
	}

}
