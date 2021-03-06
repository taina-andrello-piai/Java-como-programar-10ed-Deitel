package ex17;

/*(Calculando vendas) 
 * Um varejista on-line vende cinco produtos cujos pre?os no varejo s?o como a seguir: 
 * produto 1, US$ 2,98; 
 * produto 2, US$ 4,50; 
 * produto 3, US$ 9,98; 
 * produto 4, US$ 4,49 e 
 * produto 5, US$ 6,87. 
 * Escreva um aplicativo que leia uma s?rie de pares de n?meros como segue: 
 * a) n?mero de produto
 * b) quantidade vendida 
 * Seu programa deve utilizar uma instru??o switch para determinar o pre?o de varejo de cada produto. 
 * Voc? deve calcular e exibir o valor de varejo total de todos os produtos vendidos. 
 * Utilize um loop controlado por sentinela para determinar quando o programa 
 * deve parar o loop e exibir os resultados finais.
 */

import java.util.Scanner;

public class CalculandoVendas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Produtos produto = new Produtos();
		
		System.err.print("\tVAREJ?O DA TAIN? Ltda.\n");
		
		System.out.print("\nInsira qualquer n?mero para adicionar novo produto ou -1 para encerrar.");
		int sentinela = input.nextInt();
		
		while(sentinela != -1) {
					
			System.out.print("N?mero do Produto: ");
			int numero = input.nextInt();
			System.out.print("Quantidade: ");
			int quantidade = input.nextInt();
			produto.produtos(numero, quantidade);
			
			System.out.print("\nInsira qualquer n?mero para adicionar novo produto ou -1 para encerrar.");
			sentinela = input.nextInt();
		}
		
		System.out.printf("%n%nPre?o de varejo de cada produto: "
				+ "%n%nProduto 1:\t(%d x US$ 2,98)\t%.2f\n"
				+ "Produto 2: \t(%d x US$ 4,50)\t%.2f%n"
				+ "Produto 3: \t(%d x US$ 9,98)\t%.2f\n"
				+ "Produto 4: \t(%d x US$ 4,49)\t%.2f\n"
				+ "Produto 5: \t(%d x US$ 6,87)\t%.2f\n", 
				+ produto.getQuantidade1(), produto.precoVarejo(1), 
				+ produto.getQuantidade2(), produto.precoVarejo(2), 
				+ produto.getQuantidade3(), produto.precoVarejo(3),
				+ produto.getQuantidade4(), produto.precoVarejo(4), 
				+ produto.getQuantidade5(), produto.precoVarejo(5));
		
		input.close();
		return;
	}
}
