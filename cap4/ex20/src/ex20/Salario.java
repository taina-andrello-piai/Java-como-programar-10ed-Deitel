package ex20;

public class Salario {
	
	private int empregado;
	private double salarioBruto;
	
	public Salario(int empregado,int horaTotal,double salarioHora) {
		setEmpregado(empregado);
		int horaExtra = horaTotal - 40;
		setSalarioBruto(40*salarioHora + 0.5*horaExtra*salarioHora);
	}
	
	public int getEmpregado() {
		return empregado;
	}
	
	public void setEmpregado(int empregado) {
		this.empregado = empregado;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
}
