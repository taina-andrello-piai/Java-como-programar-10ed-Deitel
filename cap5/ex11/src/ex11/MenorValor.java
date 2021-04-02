package ex11;

/*(Localize o menor valor) Escreva um aplicativo que localiza o menor de vários números inteiros. Suponha que o primeiro valor lido
especifica o número de valores a serem inseridos pelo usuário.*/

import java.util.Scanner;

public class MenorValor 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos números inteiros quer inserir?");
		int count = input.nextInt();
		int i = 1;
		int x, y;
		
		
		if(count != 0) 
		{	
			System.out.println("Insira um inteiro: ");
			x = input.nextInt();
			
			while (i < count) 
			{
				System.out.println("Insira próximo inteiro: ");
				y = input.nextInt();
			
				if (y < x)
					x = y;
				i++;
			} 			
			System.out.printf("%nO menor valor inserido é: %d ",x);
		}
		else
			System.out.println("Nenhum número foi inserido para obter o menor.");
		
		input.close();
		return;
	}
}
