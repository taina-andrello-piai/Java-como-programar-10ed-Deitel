package ex16;

public class HeartRates {

	private String nome, sobrenome;
	private int dia, mes, ano;
	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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
}