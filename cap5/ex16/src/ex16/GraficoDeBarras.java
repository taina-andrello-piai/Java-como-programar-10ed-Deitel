package ex16;

/*(Gráfico de barras do programa de impressão) 
 * Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras.
 * Escreva um aplicativo que leia cinco números entre 1 e 30. 
 * Para cada número que é lido, seu programa deve exibir o mesmo número de asteriscos adjacentes. 
 * Por exemplo, se seu programa lê o número 7, ele deve exibir *******. 
 * Exiba as barras dos asteriscos depois de ler os cinco números.
 */

import java.util.Scanner;

public class GraficoDeBarras {

	public static void main(String[] args) {
	
		Barras barra = new Barras();
		Scanner input = new Scanner(System.in);
		System.out.print("Insira cinco números inteiros (entre 1 e 30) separados por espaço: ");
		
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
