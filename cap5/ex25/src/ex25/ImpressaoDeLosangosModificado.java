package ex25;

/*(Programa de impress?o de losangos modificado)
 *  Modifique o aplicativo que voc? escreveu na Quest?o 5.24 para ler um n?mero ?mpar 
 *  no intervalo 1 a 19 para especificar o n?mero de linhas no losango. 
 *  Seu programa ent?o deve exibir um losango do tamanho apropriado.
*/

import java.util.Scanner;

public class ImpressaoDeLosangosModificado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um n?mero ?mpar do intervalo de 1 a 19: ");
		int num = input.nextInt();
		
		if(((num > 19) || (num < -1)) || (num % 2 == 0)) {
			System.out.print("\nN?mero inv?lido.");
			input.close();
			return;
		}	
		else {
			int aux = (num - 1) / 2;
		
			for(int j = 0; j < (aux + 1); j++) {
				for(int k = 0; k < (aux - j); k++) // pre-espa?os
					System.out.print(' ');
				for(int i = 0; i < (2*j + 1); i++) // asteriscos
					System.out.print('*');
				System.out.println();
			}
			for(int j = aux; j > 0; j--) {
				for(int k = 0; k < (aux + 1 - j); k++)
					System.out.print(' ');
				for(int i = 2; i < (2*j +1); i++)
					System.out.print('*');
				System.out.println();
			}
		}
		input.close();
		return;
	}
}