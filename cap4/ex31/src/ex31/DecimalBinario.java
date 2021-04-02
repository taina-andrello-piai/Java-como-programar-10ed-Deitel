package ex31;

import java.util.Scanner;

public class DecimalBinario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Insira um número binário: ");
		int binario = input.nextInt();
		boolean bin = true;
		int decimal = 0;
		int i = 0;
		int resto = 0;
		
		while(bin == true) {
		
			if (binario % 2 == 1) {
				decimal += Math.pow(2,i);
				resto = binario - 1;
			}
			else {
				resto = binario;
			}
			if (resto == 0)
				bin = false;
			else {
				binario = resto / 10;
				i++;
			}
		}
		System.out.println("Representa o decimal " + decimal);
		input.close();
		return;
	}
}
