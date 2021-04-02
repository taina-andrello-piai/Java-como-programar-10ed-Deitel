package ex8;

public class TaxasDeEstacionamento {

	public static void main(String[] args) {
		
		Estacionamento cliente1 = new Estacionamento(1,23);
		Estacionamento cliente2 = new Estacionamento(2,10);
		Estacionamento cliente3 = new Estacionamento(3,24);
		Estacionamento cliente4 = new Estacionamento(4,2);
		Estacionamento cliente5 = new Estacionamento(5,4);
		Estacionamento cliente6 = new Estacionamento(6,6);
		Estacionamento cliente7 = new Estacionamento(7,3);
		
		double total = cliente1.calculateCharges() + cliente2.calculateCharges() +
				cliente3.calculateCharges() + cliente4.calculateCharges() +
				cliente5.calculateCharges() + cliente6.calculateCharges() +
				cliente7.calculateCharges();
		
		System.out.printf("Tarifas de Estacionamento%n%n"
				+ "Cliente %d: R$ %.2f%n"
				+ "Cliente %d: R$ %.2f%n"
				+ "Cliente %d: R$ %.2f%n"
				+ "Cliente %d: R$ %.2f%n"
				+ "Cliente %d: R$ %.2f%n"
				+ "Cliente %d: R$ %.2f%n"
				+ "Cliente %d: R$ %.2f%n"
				+ "%nTotal de tarifas: %.2f",
				cliente1.getCliente(),cliente1.calculateCharges(),
				cliente2.getCliente(),cliente2.calculateCharges(),
				cliente3.getCliente(),cliente3.calculateCharges(),
				cliente4.getCliente(),cliente4.calculateCharges(),
				cliente5.getCliente(),cliente5.calculateCharges(),
				cliente6.getCliente(),cliente6.calculateCharges(),
				cliente7.getCliente(),cliente7.calculateCharges(),
				total);
		
		System.out.println("\n\nExercicio 6.10");
		double x = 4.8679;
		System.out.println(x);
		double y = Math.floor(x * 10 + 0.5) / 10;
		System.out.println(y);
		y = Math.floor(x * 100 + 0.5) / 100;
		System.out.println(y);
		y = Math.floor(x * 1000 + 0.5) / 1000;
		System.out.println(y);
	}
}
