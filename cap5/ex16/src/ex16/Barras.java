package ex16;

public class Barras {
	
	public void barra(int num) {
		
		if (num < 1 || num > 30) {
			System.out.print("\n       ----------------------");
		}
		else {
			System.out.println();
			System.out.printf("%3d    ", num);
			for (int i = 1; i <= num; i++)
				System.out.printf("*");
		}
	}
}
