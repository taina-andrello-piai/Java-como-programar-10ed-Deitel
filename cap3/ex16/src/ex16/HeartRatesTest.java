package ex16;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("C?LCULO DA FREQU?NCIA CARD?ACA\n\nInsira os dados\nNome: ");
		String nome = input.next();
		System.out.print("Sobrenome: ");
		String sobrenome = input.next();
		System.out.print("Data de nascimento\nDia: ");
		int dia = input.nextInt();
		System.out.print("M?s: ");
		int mes = input.nextInt();
		System.out.print("Ano: ");
		int ano = input.nextInt();
		
		HeartRates pessoa = new HeartRates(nome,sobrenome,dia,mes,ano);
		
		System.out.printf("%nNome: %s %s%nData de Nascimento: %d/%d/%d%nIdade: %d anos%n"
				+ "Frequ?ncia Card?aca M?xima: %d%nFrequ?ncia Card?aca Alvo: %s",
				pessoa.getNome(),pessoa.getSobrenome(),pessoa.getDia(),pessoa.getMes(),pessoa.getAno(),
				pessoa.calculaIdade(20,8,2020),pessoa.frequenciaCardiacaMaxima(),
				pessoa.frequenciaCardiacaAlvo());
		
		input.close();
		return;
	}
}
