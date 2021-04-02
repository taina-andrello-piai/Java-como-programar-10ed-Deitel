package ex16;

/*(Gr�fico de barras do programa de impress�o) 
 * Uma aplica��o interessante dos computadores � exibir diagramas e gr�ficos de barras.
 * Escreva um aplicativo que leia cinco n�meros entre 1 e 30. 
 * Para cada n�mero que � lido, seu programa deve exibir o mesmo n�mero de asteriscos adjacentes. 
 * Por exemplo, se seu programa l� o n�mero 7, ele deve exibir *******. 
 * Exiba as barras dos asteriscos depois de ler os cinco n�meros.
 */

import java.util.Scanner;

public class GraficoDeBarras {

	public static void main(String[] args) {
	
		Barras barra = new Barras();
		Scanner input = new Scanner(System.in);
		System.out.print("Insira cinco n�meros inteiros (entre 1 e 30) separados por espa�o: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		
		barra.barra(num1);
		barra.barra(num2);
		barra.barra(num3);
		barra.barra(num4);
		barra.barra(num5);
		
		input.close();
		return;
	}
}
