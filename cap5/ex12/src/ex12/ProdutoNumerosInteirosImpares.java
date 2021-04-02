package ex12;

/*(Calculando o produto de números inteiros ímpares) Escreva um aplicativo 
 * que calcula o produto dos números inteiros ímpares de 1 a 15.
 */

public class ProdutoNumerosInteirosImpares {

	public static void main(String[] args) {
		
		int total = 1;
		
		for (int i = 1; i <= 15; i += 2) 
			total *= i;
		
		System.out.print(total);
	}
}
