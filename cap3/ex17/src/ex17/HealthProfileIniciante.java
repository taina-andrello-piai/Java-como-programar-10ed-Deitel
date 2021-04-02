package ex17;

import java.util.Scanner;

public class HealthProfileIniciante {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("REGISTRO DE SAÚDE\n\nInsira os dados\nNome: ");
		String nome = input.next();
		System.out.print("Sobrenome: ");
		String sobrenome = input.next();
		System.out.print("Sexo: ");
		String sexo = input.next();
		System.out.print("Data de nascimento\nDia: ");
		int dia = input.nextInt();
		System.out.print("Mês: ");
		int mes = input.nextInt();
		System.out.print("Ano: ");
		int ano = input.nextInt();
		System.out.print("Altura (metros): ");
		double altura = input.nextDouble();
		System.out.print("Peso (Kg): ");
		double peso = input.nextDouble();
		
		HealthProfile pessoa = new HealthProfile(nome,sobrenome,sexo,dia,mes,ano,altura,peso);
		
		System.out.printf("%nNome: %s %s%nSexo: %s%nData de Nascimento: %d/%d/%d%nIdade: %d anos%n"
				+ "Altura: %.2f m%nPeso: %.2fKg%nFrequência Cardíaca Máxima: %d%n"
				+ "Frequência Cardíaca Alvo: %s%nIMC: %.2f%n%s",
				pessoa.getNome(),pessoa.getSobrenome(),pessoa.getSexo(),
				pessoa.getDia(),pessoa.getMes(),pessoa.getAno(),
				pessoa.calculaIdade(20,8,2020),pessoa.getAltura(),pessoa.getPeso(),
				pessoa.frequenciaCardiacaMaxima(),pessoa.frequenciaCardiacaAlvo(),
				pessoa.indiceMassaCorporal(),pessoa.info());
		
		input.close();
		return;
	}
}
