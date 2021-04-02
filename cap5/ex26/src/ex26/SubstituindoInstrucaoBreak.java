package ex26;

/*Uma cr�tica � instru��o break e � instru��o continue � que cada uma � desestruturada. 
 * Na verdade, essas instru��es sempre podem ser substitu�das por instru��es estruturadas, 
 * embora fazer isso possa ser dif�cil. Descreva de maneira geral como voc� removeria qualquer 
 * instru��o break de um loop em um programa e a substituiria por alguma equivalente estruturada. 
 * [Dica: a instru��o break sai de um loop do corpo do loop. A outra maneira de sair de um loop � 
 * falhando no teste de continua��o do loop. Considere a possibilidade de utilizar no teste de 
 * continua��o do loop um segundo teste que indica �sa�da pr�via por causa de uma condi��o �break� �.] 
 * Utilize a t�cnica que voc� desenvolve aqui para remover a instru��o break do aplicativo na Figura 5.13.
*/

public class SubstituindoInstrucaoBreak {

	public static void main(String[] args) {
		
		int count;
		int aux = 0;
	      
	      for (count = 1; count <= 10; count++)
	      {  
	         if (count == 5) {
	        	aux = count; 
	            count = 11;
	            System.out.printf("%d ", aux);
	         }  
	         else 
	        	 System.out.printf("%d ", count);
	      }

	      System.out.printf("%nSa�da pr�via por causa de uma condi��o �break�. "
	      		+ "%nBroke out of loop at count = %d%n", aux);
	}
}
