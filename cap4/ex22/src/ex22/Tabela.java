package ex22;

public class Tabela {

	public static void main(String[] args) {
		
		System.out.printf("%-7s%-7s%-7s%-7s%n","N","10*N","100*N","1000*N");
		
		for(int count = 1; count <= 5; count++) 
			System.out.printf("%n%-7d%-7d%-7d%-7d",count,count*10,count*100,count*1000);
	}
}
