package ex21;

/*(Triplos de Pit?goras) Um tri?ngulo ret?ngulo pode ter lados cujos comprimentos s?o todos inteiros. 
 * O conjunto de tr?s valores inteiros para os comprimentos dos lados de um tri?ngulo ret?ngulo ? chamado de
 *triplo de Pit?goras. Os comprimentos dos tr?s lados devem satisfazer a rela??o de que a soma dos quadrados
 *de dois dos lados ? igual ao quadrado da hipotenusa. Escreva um aplicativo para exibir uma tabela dos 
 *triplos de Pit?goras para side1, side2 e hypotenuse, todos n?o maiores que 500. Utilize um loop for 
 *triplamente aninhado que tenta todas as possibilidades. Esse ? um m?todo de computa??o de ?for?a bruta?. 
 * Voc? aprender? nos cursos de ci?ncia da computa??o mais avan?ados que para muitos problemas interessantes
 *n?o h? uma abordagem algor?tmica conhecida al?m do uso de for?a bruta absoluta.
 */

public class TiplosDePitagoras 
{
	public static void main(String[] args)
	{	
		System.err.printf("%34s%n%n%15s%15s%15s%n", "TRIPLOS DE PIT?GORAS", "side 1", "side 2", "hypotenuse");
	
		for(int side1 = 1; side1 <= 500; side1++) 
		{
			for(int side2 = 1; side2 <=500; side2++) 
			{
				for(int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) 
				{
					int hy = (hypotenuse * hypotenuse),
						s1 = (side1 * side1),
						s2 = (side2 * side2);
					if(hy == (s1 + s2)) 
						System.out.printf("%15d%15d%15d%n", side1, side2, hypotenuse);
				}	
			}
		}
	}
}
