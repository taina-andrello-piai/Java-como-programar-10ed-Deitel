package ex30;

import java.util.Scanner;

public class Palindromos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean confere = true;
		int valor = 0;
		
		while(confere == true) {
		
			System.out.print("Insira um inteiro de cinco d�gitos: ");
			int num = input.nextInt();
			if(!(num <= 9999 || num > 99999)) {
				confere = false;
				valor = num;
			}
			else
				System.out.println("N�mero inv�lido.");
		}
		 
		int digito1 = valor / 10000;
		int resto1 = valor % 10000;
		int digito2 = resto1 / 1000;
		int resto2 = resto1 % 1000;
		//int digito3 = resto2 / 100;
		int resto3 = resto2 % 100;
		int digito4 = resto3 / 10;
		int resto4 = resto3 % 10;
		int digito5 = resto4;
		
		if(digito1 == digito5) {
			if(digito2 == digito4)
				System.out.print("O n�mero � pal�ndromo.");
			else
				System.out.print("O n�mero n�o � pal�ndromo.");
		}
		else
			System.out.print("O n�mero n�o � pal�ndromo.");
		
		input.close();
		return;
	}
}
