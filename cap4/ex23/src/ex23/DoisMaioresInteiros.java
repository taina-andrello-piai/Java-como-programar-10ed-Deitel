package ex23;

import java.util.Scanner;

public class DoisMaioresInteiros {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		System.out.print("Insira n�mero: ");
		int largest = input.nextInt();
		System.out.print("Insira n�mero: ");
		int nextLargest = input.nextInt();
		if (nextLargest > largest) {
			int number = largest;
			largest = nextLargest;
			nextLargest = number;
		}
	
		int counter = 2;
		
		while(counter < 10) {
			System.out.print("Insira n�mero: ");
			int number = input.nextInt();
			if(number > nextLargest) {
				nextLargest = number;
				if(number > largest) {
					nextLargest = largest;
					largest = number;
				}
			}	
			counter++;
		}
			
		System.out.print(largest + "\t" + nextLargest);
		input.close();
		return;
	}
}
