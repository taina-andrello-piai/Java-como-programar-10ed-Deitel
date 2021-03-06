package ex23;

/*(Leis de De Morgan) Neste cap?tulo, discutimos os operadores l?gicos &&, &, ||, |, ^ e !. 
 * As leis de De Morgan ?s vezes podem tornar mais convenientes para expressar uma express?o l?gica. 
 * Essas leis afirmam que a express?o !(condi??o1 && condi??o2) ? logicamente equivalente ? express?o
 * (!condi??o1 || !condi??o2). Al?m disso, a express?o !(condi??o1|| condi??o2) ? logicamente equivalente ? 
 * express?o (!condi??o1&& !condi??o2). Utilize as leis de De Morgan para escrever express?es equivalentes 
 * para cada uma das express?es a seguir, ent?o escreva um aplicativo para mostrar que tanto a express?o 
 * original como a nova express?o em cada caso produzem o mesmo valor: 
 * a) !(x < 5) && !(y >= 7) 
 * b) !(a == b) || !(g != 5) 
 * c) !((x <= 8) && (y > 4))
 *  d) !((i > 4) || (j <= 6))
*/

public class LeisDeMorgan {

	public static void main(String[] args) {
		
		int x = 2,
			y = 6,
			g = 4,
			a = 5,
			b = 9,
			i = 15,
			j = 3;
		
		System.out.println(!(x < 5) && !(y >= 7)); //a
		System.out.println((x >= 5) && (y < 7));
		System.out.println(!((x < 5) || (y >= 7)));
		System.out.println();
		
		System.out.println(!(a == b) || !(g != 5)); //b
		System.out.println((a != b) || (g == 5));
		System.out.println(!((a == b) && (g != 5)));
		System.out.println();
		
		System.out.println(!((x <= 8) && (y > 4))); //c
		System.out.println(!(x <= 8) || !(y > 4));
		System.out.println(!(!(x > 8) && !(y <= 4)));
		System.out.println();
		
		System.out.println(!((i > 4) || (j <= 6))); //d
		System.out.println(!(i > 4) && !(j <= 6));
		System.out.println((i <= 4) && (j > 6));
		System.out.println();
		
	}
}
