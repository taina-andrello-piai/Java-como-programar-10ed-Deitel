package ex29;

/*Escreva um aplicativo que utiliza instru��es de repeti��o e switch para imprimir a can��o 
 * �The Twelve Days of Christmas�. Uma instru��o switch deve ser utilizada para imprimir o dia 
 * (�primeiro�, �segundo� etc.). Uma instru��o switch separada deve ser utilizada para imprimir 
 * o restante de cada verso.
 */

public class TheTwelveDaysOfChristmas {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 12; i++) {
			switch (i) 
			{
				case 1:
					System.out.println("On the first day of Christmas");
					break;
				case 2:
					System.out.println("On the second day of Christmas");
					break;
				case 3:
					System.out.println("On the third day of Christmas");
					break;
				case 4:
					System.out.println("On the fourth day of Christmas");
					break;
				case 5:
					System.out.println("On the fifth day of Christmas");
					break;
				case 6:
					System.out.println("On the sixth day of Christmas");
					break;
				case 7:
					System.out.println("On the seventh day of Christmas");
					break;
				case 8:
					System.out.println("On the eighth day of Christmas");
					break;
				case 9:
					System.out.println("On the ninth day of Christmas");
					break;
				case 10:
					System.out.println("On the tenth day of Christmas");
					break;
				case 11:
					System.out.println("On the eleventh day of Christmas");
					break;
				case 12:
					System.out.println("On the twelfth day of Christmas");
					break;
			}
			
			if (i == 1)
				System.out.print("My true love gave to me\nA ");
			else
				System.out.println("My true love gave to me");
			
			for(int j = i; j >= 1; j--) {
				switch (j)
				{
					case 1:
						System.out.println("partridge in a pear tree");
						break;
					case 2:
						System.out.print("Two turtle doves\nAnd a ");
						break;
					case 3:
						System.out.println("Three French hens");
						break;
					case 4:
						System.out.println("Four calling birds");
						break;
					case 5:
						System.out.println("Five gold rings, badam-pam-pam");
						break;
					case 6:
						System.out.println("Six geese a laying");
						break;
					case 7:
						System.out.println("Seven swans a swimming");
						break;
					case 8:
						System.out.println("Eight maids a milking");
						break;
					case 9:
						System.out.println("Nine ladies dancing");
						break;
					case 10:
						System.out.println("Ten lords a leaping");
						break;
					case 11:
						System.out.println("Eleven pipers piping");
						break;
					case 12:
						System.out.println("12 drummers drumming");
						break;	
				}
			}
			System.out.println();
		}
	}
}
