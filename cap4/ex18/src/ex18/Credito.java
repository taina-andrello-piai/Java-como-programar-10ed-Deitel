package ex18;

public class Credito 
{
	private int numeroConta,
				saldoInicial,
				despesas,
				creditoAplicado,
				limiteAutorizado;
	
	public Credito(int numeroConta, int saldoInicial, int despesas, int creditoAplicado, int limiteAutorizado) 
	{
		this.numeroConta = numeroConta;
		this.saldoInicial = saldoInicial;
		this.despesas = despesas;
		this.creditoAplicado = creditoAplicado;
		this.limiteAutorizado = limiteAutorizado;		
	}
	
	public void calculoSaldo() 
	{
		int totalDespesas = creditoAplicado - despesas;
		int novoSaldo = saldoInicial + totalDespesas;
		totalDespesas = totalDespesas * (-1);
		
		if (totalDespesas <= limiteAutorizado) 
			System.out.printf("Novo saldo do cliente %d é %d%n",numeroConta,novoSaldo);
		else
			System.out.printf("Limite de crédito do cliente %d excedido%n", numeroConta);
	}
	
	public void setNumeroConta(int numeroConta) 
	{
		this.numeroConta = numeroConta;
	}
	
	public int getNumeroConta() 
	{
		return numeroConta;
	}
	
	public void setSaldoInicial(int saldoInicial) 
	{
		this.saldoInicial = saldoInicial;
	}
	
	public int getSaldoInicial() 
	{
		return saldoInicial;
	}
	
	public void setDespesas(int despesas) 
	{
		this.despesas = despesas;
	}
	
	public int getDespesas() 
	{
		return despesas;
	}
	
	public void setCreditoAplicado(int creditoAplicado) 
	{
		this.creditoAplicado = creditoAplicado;
	}
	
	public int getCreditoAplicado() 
	{
		return creditoAplicado;
	}
	
	public void setLimiteAutorizado(int limiteAutorizado) 
	{
		this.limiteAutorizado = limiteAutorizado;
	}
	
	public int getLimiteAutorizado() 
	{
		return limiteAutorizado;
	}
}
