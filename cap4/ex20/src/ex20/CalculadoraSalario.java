package ex20;

import java.util.Scanner;

public class CalculadoraSalario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("   Cálculo de salário\n\nInsira dados de funcionário"
				+ "\n\n   Funcionário 1"
				+ "\nHoras totais trabalhadas: ");
		int horaTotal = input.nextInt();
		System.out.print("Salário-hora: R$ ");
		double salarioHora = input.nextDouble();
		Salario empregado1 = new Salario(1,horaTotal,salarioHora);
		
		System.out.print("\n\n   Funcionário 2\nHoras totais trabalhadas: ");
		horaTotal = input.nextInt();
		System.out.print("Salário-hora: R$ ");
		salarioHora = input.nextDouble();
		Salario empregado2 = new Salario(2,horaTotal,salarioHora);

		System.out.print("\n\n   Funcionário 3\nHoras totais trabalhadas: ");
		horaTotal = input.nextInt();
		System.out.print("Salário-hora: R$ ");
		salarioHora = input.nextDouble();
		Salario empregado3 = new Salario(3,horaTotal,salarioHora);
		
		System.out.printf("Salário calculado\n\nFuncionário %d\tSalário Bruto: R$ %.2f\n"
				+ "Funcionário %d\tSalário Bruto: R$ %.2f\n"
				+ "Funcionário %d\tSalário Bruto: R$ %.2f\n",
				empregado1.getEmpregado(),empregado1.getSalarioBruto(),
				empregado2.getEmpregado(),empregado2.getSalarioBruto(),
				empregado3.getEmpregado(),empregado3.getSalarioBruto());
		
		input.close();
		return;
	}
}
