package ex39;

//2010, taxa 1.2% ao ano, 6,9 bi

public class CrescimentoDemograficoMundial {

	public static void main(String[] args) {
		
		double populacaoInicial = 6908000000.0;
		double taxa = 0.01;
		double populacao = 0;
		double populacaoAnterior = 6908000000.0;
		
		System.out.printf("%10s%25s%25s%n","Ano","Popula??o","Aumento Populacional");
		
		for(int i = 0; i <= 75; i++) {
			populacao = populacaoInicial * Math.pow(1 + taxa, i);
			double aumentoPopulacional = populacao - populacaoAnterior;
			int ano = 2010 + i;
			System.out.printf("%10d%25.4f%25.4f%n",ano,populacao,aumentoPopulacional);
			populacaoAnterior = populacao;
		}
		
		for(int i = 0; i <= 75; i++) {
			populacao = populacaoInicial * Math.pow(1 + taxa, i);
			int ano = 2010 + i;
			if(populacao >= 2*populacaoInicial) {
				System.out.printf("Popula??o dobra no ano %d.",ano);
				return;
			}
		}
	}
}
