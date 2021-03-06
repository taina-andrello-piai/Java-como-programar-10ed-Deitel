package ex33;

public class CrescimentoFacebook {

	public static void main(String[] args) {

		double total = 0;
		double usuario = 1000000000.0;
		double rate = 0.04;
		int month = 1; 
	
		while(total < 1500000000.0) {		
			total = usuario * Math.pow(1.0 + rate, month);
			System.out.printf("%4d%,20.2f%n", month, total);
			month++;
		}
		
		System.out.println("\nO Facebook aumenta sua base de usu?rios para 1,5 bilh?o em " 
				+ (month - 1) + " meses.\n");
		
		while(total < 2000000000.0) {		
			total = usuario * Math.pow(1.0 + rate, month);
			System.out.printf("%4d%,20.2f%n", month, total);
			month++;
		}
		
		System.out.println("\nO Facebook aumenta sua base de usu?rios para 2,0 bilh?o em " 
				+ (month - 1) + " meses.\n");
	}
}
