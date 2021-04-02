package ex12;

public class Invoice {

	private String numeroItem;
	private String descricaoItem;
	private int quantidadeItem;
	private double precoItem;
	private double totalItem;
	
	public Invoice(String numeroItem,String descricaoItem,int quantidadeItem,double precoItem) {
		this.numeroItem = numeroItem;
		this.descricaoItem = descricaoItem;
		this.quantidadeItem = quantidadeItem;
		this.precoItem = precoItem;
	}
	
	public double getInvoiceAmount() {
		if (quantidadeItem < 0)
			quantidadeItem = 0;
		if (precoItem < 0)
			precoItem = 0;
		totalItem = quantidadeItem * precoItem;
		return totalItem;
	}
	
	public String getNumeroItem() {
		return numeroItem;
	}
	
	public void setNumeroItem(String numeroItem) {
		this.numeroItem = numeroItem;
	}
	
	public String getDescricaoItem() {
		return descricaoItem;
	}
	
	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	
	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	
	public double getPrecoItem() {
		return precoItem;
	}
	
	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}

	public double getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(double totalItem) {
		this.totalItem = totalItem;
	} 
}
