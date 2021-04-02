package ex20;

import java.util.Scanner;

public class CalculadoraSalario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("   C�lculo de sal�rio\n\nInsira dados de funcion�rio"
				+ "\n\n   Funcion�rio 1"
				+ "\nHoras totais trabalhadas: ");
		int horaTotal = input.nextInt();
		System.out.print("Sal�rio-hora: R$ ");
		double salarioHora = input.nextDouble();
		Salario empregado1 = new Salario(1,horaTotal,salarioHora);
		
		System.out.print("\n\n   Funcion�rio 2\nHoras totais trabalhadas: ");
		horaTotal = input.nextInt();
		System.out.print("Sal�rio-hora: R$ ");
		salarioHora = input.nextDouble();
		Salario empregado2 = new Salario(2,horaTotal,salarioHora);

		System.out.print("\n\n   Funcion�rio 3\nHoras totais trabalhadas: ");
		horaTotal = input.nextInt();
		System.out.print("Sal�rio-hora: R$ ");
		salarioHora = input.nextDouble();
		Salario empregado3 = new Salario(3,horaTotal,salarioHora);
		
		System.out.printf("Sal�rio calculado\n\nFuncion�rio %d\tSal�rio Bruto: R$ %.2f\n"
				+ "Funcion�rio %d\tSal�rio Bruto: R$ %.2f\n"
				+ "Funcion�rio %d\tSal�rio Bruto: R$ %.2f\n",
				empregado1.getEmpregado(),empregado1.getSalarioBruto(),
				empregado2.getEmpregado(),empregado2.getSalarioBruto(),
				empregado3.getEmpregado(),empregado3.getSalarioBruto());
		
		input.close();
		return;
	}
}
