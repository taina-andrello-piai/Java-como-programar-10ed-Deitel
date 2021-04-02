package ex14;

import java.util.Scanner;

public class Exponenciacao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Cálculo Exponencial\nBase: ");
		int base = input.nextInt();
		System.out.print("Expoente: ");
		int exponent = input.nextInt();
		System.out.print(base + "^" + exponent + " = " + integerPower(base,exponent));
		input.close();
		return;
	}
	
	public static int integerPower(int base,int exponent) {
		int result = 1;
		for(int i = 1; i <= exponent; i++)
			result *= base;
		return result;
	}
}
