package ex24;

public class NumerosPerfeitos {

	public static void main(String[] args) {

		for(int i = 1; i <= 1000; i++) {
			int aux = i;
			System.out.print(i + "\tFatores: ");
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					aux = aux - j;
					System.out.print(" " + j);
				}
			}
			if(aux == 0)
				System.out.printf("\tResultado: ? perfeito\n");
			else
				System.out.printf("\tResultado: N?o ? perfeito\n");
		}
	}
}
