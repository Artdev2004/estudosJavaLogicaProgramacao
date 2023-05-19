package exercicio22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int horasSemanais = 40; // Jornada de trabalho semanal em horas
        int semanasMes = 4; // N�mero de semanas no m�s

        System.out.print("Digite o n�mero de horas trabalhadas no m�s: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor do sal�rio por hora: ");
        double salarioHora = sc.nextDouble();

        int horasExtras = horasTrabalhadas - (horasSemanais * semanasMes);

        double salarioTotal;

        if (horasExtras > 0) {
            double valorHoraExtra = salarioHora * 1.5; // Valor da hora extra com acr�scimo de 50%
            double salarioHoraNormal = horasSemanais * salarioHora; // Sal�rio das horas normais (jornada semanal)
            double salarioHorasExtras = horasExtras * valorHoraExtra; // Sal�rio das horas extras

            salarioTotal = salarioHoraNormal + salarioHorasExtras;
        } else {
            salarioTotal = horasTrabalhadas * salarioHora; // Sem horas extras, calcula o sal�rio total com base nas horas trabalhadas
        }

        System.out.println("O sal�rio total do funcion�rio �: R$" + salarioTotal);

        sc.close();
	}

}
