package ex18;

public class CreditoTest {

	public static void main(String[] args) 
	{
		
		Credito cliente1 = new Credito(001,10000,2500,100,8000);
		Credito cliente2 = new Credito(002,15000,10000,1500,13000);
		Credito cliente3 = new Credito(003,2000,1500,50,1000);
		
		cliente1.calculoSaldo();
		cliente2.calculoSaldo();
		cliente3.calculoSaldo();

	}

}
