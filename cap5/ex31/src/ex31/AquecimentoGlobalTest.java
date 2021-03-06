package ex31;

import java.util.Scanner;

public class AquecimentoGlobalTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AquecimentoGlobal teste = new AquecimentoGlobal();
		boolean tryAndTry = true;
		
		System.out.println("QUESTION?RIO SOBRE O AQUECIMENTO GLOBAL");
		
		while(tryAndTry == true) {
			for(int questao = 1; questao <= 5; questao++) {
				teste.questoes(questao);
				System.out.print("Resposta: ");
				int resposta = input.nextInt();
				while(!(resposta >= 1 && resposta <= 4)) {
					System.out.print("Alternativa inexistente. Tente novamente.\nResposta: ");
					resposta = input.nextInt();
				}
				teste.setAlternativaEscolhida(resposta);
				teste.confereAlternativa(questao, resposta);
			}
		
			teste.resultadoFinal();
			if((teste.getPontuacaoFinal() !=5) && (teste.getPontuacaoFinal() != 4)) {
				boolean continuar = true;
				while(continuar == true) {
				System.out.println("\nDeseja tentar novamente? \nDigite:\t1. SIM\t2. N?O");
				int tryAgain = input.nextInt();
					switch(tryAgain) {
					case 1:
						tryAndTry = true;
						continuar = false;
						teste.zeraPontuacaoFinal();
						break;
					case 2:
						tryAndTry = false;
						continuar = false;
						System.out.println("Sua pontua??o final foi " + teste.getPontuacaoFinal() + ".");
						break;
					default:
						System.out.println("\nOp??o Inv?lida.");
						continuar = true;
					}
				}
			}
			else
				tryAndTry = false;
		}
		input.close();
		return;
	}
}
