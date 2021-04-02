package ex22;

/*(Programa de impress�o de tri�ngulos modificado) 
 * Modifique a Quest�o 5.15 para combinar seu c�digo dos quatro tri�ngulos de asteriscos separados, 
 * de modo que todos os quatro padr�es sejam impressos lado a lado. 
 * [Dica: fa�a uso inteligente de loops for aninhados.]
*/

public class ImpressaoDeTriangulosModificado {

	public static void main(String[] args) {
		
		for(int j = 0; j < 10; j++) {
			for(int k = 0; k <= j; k++) // asteriscos 1
				System.out.print('*');
			for(int i = 0; i <= (10 - j); i++) // espa�os 1
				System.out.print(' ');
			for(int k = 1; k <= (10 - j); k++) //asteriscos 2 
				System.out.print('*');
			for(int i = 0; i <= j; i++) // espa�os 2
				System.out.print(' ');
			for(int i = 0; i <= j; i++) // espa�os 3
				System.out.print(' ');
			for(int k = 1; k <= (10 - j); k++) // asteriscos 3
				System.out.print('*');
			for(int i = 0; i <= (10 - j); i++) // espa�os 4
				System.out.print(' ');
			for(int k = 0; k <= j; k++) // asteriscos 4
				System.out.print('*');
			System.out.println();
		}
	}	
}
