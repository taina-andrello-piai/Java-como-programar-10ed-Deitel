package ex32;

import java.util.Scanner;

public class FairTaxTest {

	public static void main(String[] args) {
		
		System.out.println("C?lculo de Fair Tax\n\n**Obs: Fair Tax corresponde a 23% do valor bruto pago"
				+ " e 30% do valor l?quido.**");

		Scanner input = new Scanner(System.in);
		System.out.print("\nInsira as despesas anual para cada categoria abaixo\n\nMoradia: $");
		double moradia = input.nextDouble();
		System.out.print("Alimenta??o: $");
		double alimentacao = input.nextDouble();
		System.out.print("Vestu?rio: $");
		double vestuario = input.nextDouble();
		System.out.print("Transporte: $");
		double transporte = input.nextDouble();
		System.out.print("Educa??o: $");
		double educacao = input.nextDouble();
		System.out.print("Assist?ncia M?dica: $");
		double assistenciaMedica = input.nextDouble();
		System.out.print("F?rias: $");
		double ferias = input.nextDouble();
		
		FairTax fairTax = new FairTax(moradia, alimentacao, vestuario, transporte, educacao,
				assistenciaMedica, ferias);
		
		System.out.printf("Fair Tax calculado: $%.2f", fairTax.getCalculaFairTax());
		
		input.close();
		return;
	}
}
