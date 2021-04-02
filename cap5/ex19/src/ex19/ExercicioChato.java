package ex19;

/*Suponha que i = 1, j = 2, k = 3 e m = 2. O que cada uma das seguintes instruções imprime?
a) System.out.println(i == 1);
b) System.out.println(j == 3);
c) System.out.println((i >= 1) && (j < 4));
d) System.out.println((m <= 99) & (k < m));
e) System.out.println((j >= i) || (k == m));
f) System.out.println((k + m < j) | (3 - j >= k));
g) System.out.println(!(k > m));
*/

public class ExercicioChato {

	public static void main(String[] args) {
	
		int i = 1, j = 2, k = 3, m = 2;
		System.out.println(i == 1);
		System.out.println(j == 3);
		System.out.println((i >= 1) && (j < 4));
		System.out.println((m <= 99) & (k < m));
		System.out.println((j >= i) || (k == m));
		System.out.println((k + m < j) | (3 - j >= k));
		System.out.println(!(k > m));
		//true or false
		return;
	}
}
