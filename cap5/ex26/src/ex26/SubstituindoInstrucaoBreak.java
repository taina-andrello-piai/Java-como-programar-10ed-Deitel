package ex26;

/*Uma crítica à instrução break e à instrução continue é que cada uma é desestruturada. 
 * Na verdade, essas instruções sempre podem ser substituídas por instruções estruturadas, 
 * embora fazer isso possa ser difícil. Descreva de maneira geral como você removeria qualquer 
 * instrução break de um loop em um programa e a substituiria por alguma equivalente estruturada. 
 * [Dica: a instrução break sai de um loop do corpo do loop. A outra maneira de sair de um loop é 
 * falhando no teste de continuação do loop. Considere a possibilidade de utilizar no teste de 
 * continuação do loop um segundo teste que indica “saída prévia por causa de uma condição ‘break’ ”.] 
 * Utilize a técnica que você desenvolve aqui para remover a instrução break do aplicativo na Figura 5.13.
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

	      System.out.printf("%nSaída prévia por causa de uma condição ‘break’. "
	      		+ "%nBroke out of loop at count = %d%n", aux);
	}
}
