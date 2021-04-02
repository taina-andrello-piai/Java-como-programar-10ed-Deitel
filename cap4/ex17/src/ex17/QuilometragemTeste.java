package ex17;

import java.util.Scanner;

public class QuilometragemTeste {

	public static void main(String[] args) {
		
		int numViagem = 1;
		int sentinela = 1;
		Quilometragem viagem = new Quilometragem();
		Scanner input = new Scanner(System.in);
		
		while (sentinela != 2) 
		{
			
			System.out.print("Informe quantos quil�metros percorridos nessa viagem: ");
			int quilometroDirigido = input.nextInt();
			viagem.setQuilometro(quilometroDirigido);

			System.out.print("Informe o consumo de combust�vel em litros nessa viagem: ");
			int combustivelConsumido = input.nextInt();
			viagem.setCombustivel(combustivelConsumido);
		
			System.out.printf("Dados da Viagem %d\nConsumo: %.2f km/litro\nTotal de quil�metros rodados at� o momento: %d km\nTotal de combust�vel gasto at� o momento: %d litros\n", numViagem,viagem.consumoViagem(),viagem.totalQuilometros(),viagem.totalCombustivel());
			
			System.out.print("Digite 1 para calcular os dados da pr�xima viagem ou 2 para encerrar: ");
			sentinela = input.nextInt();
			
			numViagem++;
		}
		
		if(sentinela == 2)
			System.out.println("C�lculo encerrado.");
		
		input.close();
		return;
	}	
}
