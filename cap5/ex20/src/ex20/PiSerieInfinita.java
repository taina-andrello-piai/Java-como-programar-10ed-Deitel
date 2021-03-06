package ex20;

/*(Calculando o valor de pi) Calcule o valor de pi a partir de uma s?rie infinita
 
	pi = 4 - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + ... 

Imprima uma tabela que mostre o valor aproximado de pi calculando os 200.000 primeiros termos dessa s?rie. 
Quantos termos voc? tem de utilizar antes de primeiro obter um valor que come?a com 3,14159?
*/
 
public class PiSerieInfinita {

	public static void main(String[] args) {
		
		double pi = 0;
		double j = 1;
		
		for(int i = 1; i <= 200000; i++) {
			double termo = (4 / j) ;
			if ((i % 2) == 0) { 
				System.out.printf("%n%7d\t\t%.16f - %.16f = ", i, pi, termo);
				pi -= termo;
				System.out.printf("%.10f%n",pi);
			}
			else {
				System.out.printf("%n%7d\t\t%.16f + %.16f = ", i, pi, termo);
				pi += termo;
				System.out.printf("%.16f%n",pi);
			}
			j += 2;
		}
		
		pi = 0;
		j = 1;
		
		for(int i = 1; i <= 200000; i++) {
			double termo = (4 / j) ;
			if ((i % 2) == 0) { 
				pi -= termo;
			}
			else {
				pi += termo;
			}
			if ( pi >= 3.14159 && pi < 3.1416) {
				System.out.printf("\nN?mero de termos utilizados antes de obter 3.14159: %d termos.%n", (i - 1));
				return; 
			}//136123
			j += 2;
		}
	}
}
