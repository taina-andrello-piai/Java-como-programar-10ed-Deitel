package ex18;

/*(Programa de juros compostos modificado) 
 * Modifique o aplicativo na Figura 5.6 para utilizar apenas inteiros para calcular os juros compostos. 
 * [Dica: trate todas as quantidades monet�rias como n�meros inteiros em centavos. 
 * Ent�o, divida o resultado em suas partes d�lar e centavos utilizando as opera��es divis�o e resto, 
 * respectivamente. Insira uma v�rgula entre as partes d�lar e centavos.]
 */

public class JurosCompostosModificadoAgain {

	public static void main(String[] args) {
	
		double amount;
		int principal = 100000;
		double rate = 0.05;
		
		System.out.printf("%n%s%20s%n", "Year","Amount on Deposit");
			
		for(int year = 1; year <= 10; ++year) {
			amount = principal * Math.pow(1 + rate, year);
			double dolar = amount / 100;
			int centavo = (int) (amount % 100);
			System.out.printf("%4d%20.0f d�lares e %d centavos%n", year, dolar, centavo);
		}
	}	
}

