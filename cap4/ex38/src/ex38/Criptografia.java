package ex38;

import java.util.Scanner;

public class Criptografia {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		boolean confere = true;
		int valor = 0;
		
		while(confere == true) {
			System.out.print("Insira inteiro de 4 d?gitos: ");
			int num = input.nextInt();
			if(!(num <= 999 || num > 9999)) {
				confere = false;
				valor = num;
			}
			else
				System.out.println("N?mero inv?lido.");
		}
		
		int digito1 = valor / 1000;
		int resto1 = valor % 1000;
		int digito2 = resto1 / 100;
		int resto2 = resto1 % 100;
		int digito3 = resto2 / 10;
		int resto3 = resto2 % 10;
		int digito4 = resto3;
		
		int cripDig1 = (digito1 + 7)%10;
		int cripDig2 = (digito2 + 7)%10;
		int cripDig3 = (digito3 + 7)%10;
		int cripDig4 = (digito4 + 7)%10;
		
		int aux13 = cripDig1;
		cripDig1 = cripDig3;
		cripDig3 = aux13;
		int aux24 = cripDig2;
		cripDig2 = cripDig4;
		cripDig4 = aux24;
		
		int digitoCriptografado = (1000*cripDig1) + (100*cripDig2) + (10*cripDig3) + cripDig4;
		System.out.println(digitoCriptografado);
		
		valor = digitoCriptografado;
		digito1 = valor / 1000;
		resto1 = valor % 1000;
		digito2 = resto1 / 100;
		resto2 = resto1 % 100;
		digito3 = resto2 / 10;
		resto3 = resto2 % 10;
		digito4 = resto3;
		
		cripDig1 = (digito1 + 3)%10;
		cripDig2 = (digito2 + 3)%10;
		cripDig3 = (digito3 + 3)%10;
		cripDig4 = (digito4 + 3)%10;
		
		aux13 = cripDig1;
		cripDig1 = cripDig3;
		cripDig3 = aux13;
		aux24 = cripDig2;
		cripDig2 = cripDig4;
		cripDig4 = aux24;
		
		int digitoDescriptografado = (1000*cripDig1) + (100*cripDig2) + (10*cripDig3) + cripDig4;
		System.out.println(digitoDescriptografado);
		
		input.close();
		return;
	}
}
