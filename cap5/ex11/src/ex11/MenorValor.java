package ex11;

/*(Localize o menor valor) Escreva um aplicativo que localiza o menor de v�rios n�meros inteiros. Suponha que o primeiro valor lido
especifica o n�mero de valores a serem inseridos pelo usu�rio.*/

import java.util.Scanner;

public class MenorValor 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos n�meros inteiros quer inserir?");
		int count = input.nextInt();
		int i = 1;
		int x, y;
		
		
		if(count != 0) 
		{	
			System.out.println("Insira um inteiro: ");
			x = input.nextInt();
			
			while (i < count) 
			{
				System.out.println("Insira pr�ximo inteiro: ");
				y = input.nextInt();
			
				if (y < x)
					x = y;
				i++;
			} 			
			System.out.printf("%nO menor valor inserido �: %d ",x);
		}
		else
			System.out.println("Nenhum n�mero foi inserido para obter o menor.");
		
		input.close();
		return;
	}
}
