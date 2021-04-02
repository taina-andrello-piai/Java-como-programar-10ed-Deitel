package ex13;

public class Employee {

	private String nome, sobrenome;
	private double salario;
	
	public Employee(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (salario > 0)
			this.salario = salario;
	}
	
	public double salarioAnual() {
		double salarioAnual = 12 * salario;
		return salarioAnual;
	}
	
	public double aumentoSalario() {
		double novoSalario = 12 * salario * 1.10;
		return novoSalario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
