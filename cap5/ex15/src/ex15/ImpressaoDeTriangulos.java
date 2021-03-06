package ex15;

/*(Programa para impress?o de tri?ngulos) 
 * Escreva um aplicativo que exibe os seguintes padr?es separadamente, um embaixo do outro.
 * Utilize loops for para gerar os padr?es. Todos os asteriscos (*) devem ser impressos por uma 
 * ?nica instru??o na forma System.out.print('*'); 
 * o que faz com que os asteriscos sejam impressos lado a lado. 
 * Uma instru??o na forma System.out.println(); pode ser utilizada para mover-se para a pr?xima linha. 
 * Uma instru??o na forma System.out.print(' '); pode ser utilizada para exibir um espa?o para os 
 * ?ltimos dois padr?es. N?o deve haver outras instru??es de sa?da no programa. 
 * [Dica: os dois ?ltimos padr?es requerem que cada linha inicie com um n?mero 
 * adequado de espa?os em branco.]*/

public class ImpressaoDeTriangulos {

	public static void main(String[] args) {
		
		for(int j = 1; j <= 10; j++) {
			for(int k = 1; k <= j; k++)
				System.out.print('*');
			System.out.println();
		}
		
		System.out.println();
		
		for(int j = 10; j >= 1; j--) {
			for(int k = 1; k <= j; k++)
				System.out.print('*');
			System.out.println();
		}
		
		System.out.println();
		
		for(int j = 10; j >= 1; j--) {
			for(int i = 1; i <= (10 - j); i++)
				System.out.print(' ');
			for(int k = 1; k <= j; k++)
				System.out.print('*');
			System.out.println();
		}
		
		System.out.println();
		
		for(int j = 1; j <= 10; j++) {
			for(int i = 1; i <= (10 - j); i++)
				System.out.print(' ');
			for(int k = 1; k <= j; k++)
				System.out.print('*');
			System.out.println();
		}
	}
}
