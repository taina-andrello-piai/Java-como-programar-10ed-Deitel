package ex28;

/*Descreva de maneira geral como voc� removeria qualquer instru��o continue de um loop em um programa 
 * e a substituiria por alguma equivalente estruturada. Utilize a t�cnica que voc� desenvolve aqui para 
 * remover a instru��o continue do programa na Figura 5.14.
*/

public class SubstituindoInstrucaoContinue {

	public static void main(String[] args) {
		
		for (int count = 1; count <= 10; count++) // loop 10 times
	      {  
	         if (count == 5) 
	            count++;

	         System.out.printf("%d ", count);
	      } 

	      System.out.printf("%nNot used continue to skip printing 5%n");

	}

}
