package ex17;

public class Produtos {

	private int numeroProduto,
				quantidadeProduto;
	private int quantidade1, quantidade2, quantidade3, quantidade4, quantidade5;
	private double total;
	
	public void produtos(int numeroProduto, int quantidadeProduto) {
		
		this.numeroProduto = numeroProduto;
		this.quantidadeProduto = quantidadeProduto;
		
		switch(numeroProduto) 
		{
			case 1:
				quantidade1 += quantidadeProduto;
				break;
			case 2:
				quantidade2 += quantidadeProduto;
				break;
			case 3:
				quantidade3 += quantidadeProduto;
				break;
			case 4:
				quantidade4 += quantidadeProduto;
				break;
			case 5:
				quantidade5 += quantidadeProduto;
				break;
			default:
				System.out.print("\nNenhum produto inserido.\n");
				break;
		}
	}
	
	public double precoVarejo(int numeroProduto) {
		
		switch(numeroProduto) 
		{
			case 1:
				total = quantidade1 * 2.98;
				break;
			case 2:
				total = quantidade2 * 4.50;
				break;
			case 3:
				total = quantidade3 * 9.98;
				break;
			case 4:
				total = quantidade4 * 4.49;
				break;
			case 5:
				total = quantidade5 * 6.87;
				break;
			default:
				System.out.print("N?mero de produto inv?lido.");
				break;
		}
		return total;
	}
	
	public void setNumeroProduto(int numeroProduto) {
		this.numeroProduto = numeroProduto;
	}
	
	public int getNumeroProduto() {
		return numeroProduto;
	}
	
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public int getQuantidade1() {
		return quantidade1;
	}

	public void setQuantidade1(int quantidade1) {
		this.quantidade1 = quantidade1;
	}

	public int getQuantidade2() {
		return quantidade2;
	}

	public void setQuantidade2(int quantidade2) {
		this.quantidade2 = quantidade2;
	}

	public int getQuantidade3() {
		return quantidade3;
	}

	public void setQuantidade3(int quantidade3) {
		this.quantidade3 = quantidade3;
	}

	public int getQuantidade4() {
		return quantidade4;
	}

	public void setQuantidade4(int quantidade4) {
		this.quantidade4 = quantidade4;
	}

	public int getQuantidade5() {
		return quantidade5;
	}

	public void setQuantidade5(int quantidade5) {
		this.quantidade5 = quantidade5;
	}
}
