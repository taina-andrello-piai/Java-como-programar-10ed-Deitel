package ex12;

/*(Calculando o produto de n�meros inteiros �mpares) Escreva um aplicativo 
 * que calcula o produto dos n�meros inteiros �mpares de 1 a 15.
 */

public class ProdutoNumerosInteirosImpares {

	public static void main(String[] args) {
		
		int total = 1;
		
		for (int i = 1; i <= 15; i += 2) 
			total *= i;
		
		System.out.print(total);
	}
}
