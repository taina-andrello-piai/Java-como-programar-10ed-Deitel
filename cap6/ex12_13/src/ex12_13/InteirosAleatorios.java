package ex12_13;

import java.security.SecureRandom;

public class InteirosAleatorios {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		System.out.println("Exerc?cio 6.12");
		int n = 1 + randomNumbers.nextInt(2);
		System.out.println(n);
		n = 1 + randomNumbers.nextInt(100);
		System.out.println(n);
		n = randomNumbers.nextInt(10);
		System.out.println(n);
		n = 1000 + randomNumbers.nextInt(112);
		System.out.println(n);
		n = -1 + randomNumbers.nextInt(2);
		System.out.println(n);
		n = -3 + randomNumbers.nextInt(15);
		System.out.println(n);
		
		System.out.println("\nExerc?cio 6.13");
		n = 2 + 2*randomNumbers.nextInt(5);
		System.out.println(n);
		n = 3 + 2*randomNumbers.nextInt(5);
		System.out.println(n);
		n = 6 + 4*randomNumbers.nextInt(5);
		System.out.println(n);
	}
}
