package ex8;

public class Estacionamento {
	
	private int horas, cliente;
	
	public Estacionamento(int cliente, int horas) {
		setCliente(cliente);
		setHoras(horas);
	}
	
	public double calculateCharges(){
		double charge = 2.00;
		if(horas == 24)
			charge = 10.00;
		else {
			if(horas > 3) {
				int extraHoras = horas - 3;
				charge = 2.00 + 0.5 * extraHoras;
			}
		}
		return charge;
	}
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
}
