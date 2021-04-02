package ex17;

/*4.17 (Quilometragem de combust�vel) Os motoristas se preocupam com a quilometragem obtida por seus autom�veis. Um motorista monitorou
v�rias viagens registrando a quilometragem dirigida e a quantidade de combust�vel em litros utilizados para cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quil�metros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
para cada viagem. O programa deve calcular e exibir o consumo em quil�metros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combust�vel consumidos at� esse ponto para todas as viagens. Todos os c�lculos de m�dia devem produzir
resultados de ponto flutuante. Utilize classe Scanner e repeti��o controlada por sentinela para obter os dados do usu�rio. */

public class Quilometragem {
	
	private int quilometroDirigido;
	private int combustivelConsumido;
	private int totalKm;
	private int totalGas;
	private double consumoMedio;
	
	//construtor
	/*public Quilometragem(int quilometroDirigido, int combustivelConsumido) 
	{
		this.quilometroDirigido = quilometroDirigido;
		this.combustivelConsumido = combustivelConsumido;			
	}*/
	
	public double consumoViagem() 
	{
		consumoMedio = (double)quilometroDirigido/combustivelConsumido;
		return consumoMedio;
	}
	
	public int totalQuilometros()		
	{
		totalKm = totalKm + quilometroDirigido;
		return totalKm;
	}
	
	public int totalCombustivel()		
	{
		totalGas = totalGas + combustivelConsumido;
		return totalGas;
	}
	
	public void setQuilometro(int quilometroDirigido) 
	{
		this.quilometroDirigido = quilometroDirigido;
	}
	
	public int getQuilometro() 
	{
		return quilometroDirigido;
	}
	
	public void setCombustivel(int combustivelConsumido) 
	{
		this.combustivelConsumido = combustivelConsumido;
	}
	
	public int getCombustivel() 
	{
		return combustivelConsumido;
	}
}
