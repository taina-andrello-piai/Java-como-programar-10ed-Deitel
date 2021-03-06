package ex13;

/*(Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. 
 * O fatorial de um inteiro positivo n (escrito como n! e pronunciado 
 * como ?fatorial de n?) ? igual ao produto dos n?meros inteiros positivos de 1 a n. 
 * Escreva um aplicativo que calcula os fatoriais de 1 a 20. 
 * Utilize o tipo long. Exiba os resultados em formato tabular. 
 * Que dificuldade poderia impedir voc? de calcular o fatorial de 100?
 */

//Dificuldade para fatorial de 100: nem o long suporta o n?mero de bits. 

public class Fatoriais {

	public static void main(String[] args) {
		
		long fatorial = 1l;
	
		System.err.printf("%3s%25s%n","n","Fatorial de n (n!)" );
		for(int i = 1; i <= 20; i++) {
			fatorial *= i; 
			System.out.printf("%n%3d%25d", i, fatorial);
		}
	}
}
