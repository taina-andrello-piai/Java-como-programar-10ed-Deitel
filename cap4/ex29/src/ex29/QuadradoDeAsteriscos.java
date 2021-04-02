package ex29;

import java.util.Scanner;

public class QuadradoDeAsteriscos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean confere = true;
		int valor = 0;
		
		while(confere == true) {
			System.out.print("Insira um inteiro entre 1 e 20: ");
			valor = input.nextInt();
			if (!(valor < 1 || valor > 20)) {
				confere = false;
			}	
		}
		
		for(int count = 1; count <= valor; count++) {
			for(int j = 1; j <= valor; j++) {
				if(count > 1 && count < valor) {
					if(j > 1 && j < valor) 
						System.out.print(" ");
					else
						System.out.print("*");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
		input.close();
		return;
	}
}
