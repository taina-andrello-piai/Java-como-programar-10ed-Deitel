package ex12;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice invoice1 = new Invoice("1","Mouse", 4, 55.00);
		Invoice invoice2 = new Invoice("2","MousePad", 4, 10.00);
		Invoice invoice3 = new Invoice("3","Calculadora Cassio", -9, 45.00);
		Invoice invoice4 = new Invoice("4","Fone de Ouvido", 10, -60.00);
		
		System.out.println("LOJ�O DE INFORM�TICA DA TAT�\n\nInvoice\n");
		
		System.out.printf("%8s%25s%12s%8s%8s%n%8s%25s%12d%8.2f%8.2f%n%8s%25s%12d%8.2f%8.2f%n"
				+ "%8s%25s%12d%8.2f%8.2f%n%8s%25s%12d%8.2f%8.2f%n",
				"Numero","Descri��o","Quantidade","Pre�o","Total",
				invoice1.getNumeroItem(),invoice1.getDescricaoItem(),invoice1.getQuantidadeItem(),
				invoice1.getPrecoItem(),invoice1.getInvoiceAmount(),
				invoice2.getNumeroItem(),invoice2.getDescricaoItem(),invoice2.getQuantidadeItem(),
				invoice2.getPrecoItem(),invoice2.getInvoiceAmount(),
				invoice3.getNumeroItem(),invoice3.getDescricaoItem(),invoice3.getQuantidadeItem(),
				invoice3.getPrecoItem(),invoice3.getInvoiceAmount(),
				invoice4.getNumeroItem(),invoice4.getDescricaoItem(),invoice4.getQuantidadeItem(),
				invoice4.getPrecoItem(),invoice4.getInvoiceAmount());
	}
}
