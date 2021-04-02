package ex17;

public class HealthProfile {
	
	private String nome, sobrenome, sexo;
	private int dia, mes, ano;
	private double altura, peso;
	
	public HealthProfile(String nome,String sobrenome,String sexo,
						int dia,int mes, int ano, double altura, double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.altura = altura;
		this.peso = peso;
	}

	public int calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
		int idade = 0;
		if(mesAtual > mes) 
			idade = anoAtual - ano;
		else if(mesAtual == mes) {
			if(diaAtual >= dia) 
				idade = anoAtual - ano;
			else
				idade = anoAtual - ano - 1;
		}
		else if(mesAtual < mes)
			idade = anoAtual - ano - 1;
		return idade;
	}
	
	public int frequenciaCardiacaMaxima() {
		int frequenciaCardiacaMaxima = 220 - calculaIdade(20,8,2020);
		return frequenciaCardiacaMaxima;
	}
	
	public String frequenciaCardiacaAlvo() {
		double frequenciaCardiacaAlvoMin = 0.5 * frequenciaCardiacaMaxima(); 
		double frequenciaCardiacaAlvoMax = 0.85 * frequenciaCardiacaMaxima();
		return frequenciaCardiacaAlvoMin + " - " + frequenciaCardiacaAlvoMax;
	}
	
	public double indiceMassaCorporal() {
		double indiceMassaCorporal = peso / (altura * altura);
		return indiceMassaCorporal;
	}
	
	public String info() {
		return "BMI VALUES\n" + 
				"Underweight: less than 18.5\n" + 
				"Normal:      between 18.5 and 24.9\n" + 
				"Overweight:  between 25 and 29.9\n" + 
				"Obese:       30 or greater";
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
