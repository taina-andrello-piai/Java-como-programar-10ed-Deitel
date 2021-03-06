package ex24;

/*(Programa de impress?o de losangos) Escreva um aplicativo que imprime a seguinte forma de um losango. 
 * Voc? pode utilizar instru??es de sa?da que imprimem um ?nico asterisco (*), um ?nico espa?o ou um ?nico 
 * caractere de nova linha. Maximize sua utiliza??o de repeti??o (com instru??es for aninhadas) e minimize 
 * o n?mero de instru??es de sa?da.
*/

public class ImpressaoDeLosangos {

	public static void main(String[] args) {
			
		for(int j = 0; j < 5; j++) {
			for(int k = 0; k < (4 - j); k++) // pre-espa?os
				System.out.print(' ');
			for(int i = 0; i < (2*j + 1); i++) // asteriscos
				System.out.print('*');
			System.out.println();
		}
		for(int j = 4; j > 0; j--) {
			for(int k = 0; k < (5 - j); k++)
				System.out.print(' ');
			for(int i = 2; i < (2*j +1); i++)
				System.out.print('*');
			System.out.println();
		}
	}
}
