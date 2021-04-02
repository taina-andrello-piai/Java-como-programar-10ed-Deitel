package ex19;

public class ComissaoDeVendas {
	
	private double total;
	private int vendedor;
	
	public ComissaoDeVendas(int vendedor, int item1, int item2, int item3, int item4) {
		setVendedor(vendedor);
		double totalBruto = (239.99*item1) + (129.75*item2) + (99.95*item3) + (350.89*item4);	
		setTotal(200 + 0.09 * totalBruto);
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setVendedor(int vendedor) {
		this.vendedor = vendedor;
	}
	
	public int getVendedor() {
		return vendedor;
	}
}
