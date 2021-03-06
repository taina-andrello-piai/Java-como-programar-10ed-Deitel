package ex37;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);	
		System.out.println("Insira um n?mero inteiro maior que 1.");
		int num = input.nextInt();
		
		System.out.println(calculaFatorial(num));
		
		System.out.println("\nN?mero de termos para calcular a constante matem?tica 'e': ");
		num = input.nextInt();
		
		double e = 1;
		
		for(int i = 2; i <= num; i++)
			e += 1.0 / calculaFatorial(i-1);
		
		System.out.printf("e = %.10f",e);
		
		System.out.println("\nN?mero de termos para calcular (e)^x: ");
		num = input.nextInt();
		
		double potencia = 0;
		
		for(int i = 0; i < num; i++) {
			potencia += (Math.pow(num, i) / calculaFatorial(i));
			System.out.println(potencia);
		}
		//formula usada igual a do livro, por?m
		System.out.printf("e^x = %.10f",potencia);//resultado diferente da calculadora
		
		input.close();
		return;
	}
	
	public static int calculaFatorial(int num) {
		int fatorial = 1;
		for(int i = 1; i <= num; i++) 
			fatorial = fatorial * i;
		return fatorial;
	}
}
