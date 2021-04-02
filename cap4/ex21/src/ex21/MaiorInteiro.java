package ex21;

import java.util.Scanner;

public class MaiorInteiro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira número: ");
		int largest = input.nextInt();
		int counter = 1;
		
		while(counter < 10) {
			System.out.print("Insira número: ");
			int number = input.nextInt();
			if(number > largest)
				largest = number;
			counter++;
		}
		
		System.out.print(largest);
		input.close();
		return;
	}
}
