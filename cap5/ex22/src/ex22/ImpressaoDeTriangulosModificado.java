package ex22;

/*(Programa de impressão de triângulos modificado) 
 * Modifique a Questão 5.15 para combinar seu código dos quatro triângulos de asteriscos separados, 
 * de modo que todos os quatro padrões sejam impressos lado a lado. 
 * [Dica: faça uso inteligente de loops for aninhados.]
*/

public class ImpressaoDeTriangulosModificado {

	public static void main(String[] args) {
		
		for(int j = 0; j < 10; j++) {
			for(int k = 0; k <= j; k++) // asteriscos 1
				System.out.print('*');
			for(int i = 0; i <= (10 - j); i++) // espaços 1
				System.out.print(' ');
			for(int k = 1; k <= (10 - j); k++) //asteriscos 2 
				System.out.print('*');
			for(int i = 0; i <= j; i++) // espaços 2
				System.out.print(' ');
			for(int i = 0; i <= j; i++) // espaços 3
				System.out.print(' ');
			for(int k = 1; k <= (10 - j); k++) // asteriscos 3
				System.out.print('*');
			for(int i = 0; i <= (10 - j); i++) // espaços 4
				System.out.print(' ');
			for(int k = 0; k <= j; k++) // asteriscos 4
				System.out.print('*');
			System.out.println();
		}
	}	
}
