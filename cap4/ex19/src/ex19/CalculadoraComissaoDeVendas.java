package ex19;

public class CalculadoraComissaoDeVendas {

	public static void main(String[] args) {
		
		ComissaoDeVendas vendedor1 = new ComissaoDeVendas(1,21,13,4,5);		
		ComissaoDeVendas vendedor2 = new ComissaoDeVendas(2,10,9,34,1);
		ComissaoDeVendas vendedor3 = new ComissaoDeVendas(3,8,2,18,23);
		
		System.out.printf("Comiss?o calculada\n\nVendedor %d: R$ %.2f\nVendedor %d: R$ %.2f\n"
				+ "Vendedor %d: R$ %.2f\n", 
				vendedor1.getVendedor(),vendedor1.getTotal(),
				vendedor2.getVendedor(),vendedor2.getTotal(), 
				vendedor3.getVendedor(),vendedor3.getTotal());
	}
}
