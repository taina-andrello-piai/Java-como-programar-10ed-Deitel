package ex15;

public class AccountModificada {

	private String name; 
	private double balance; 

	public AccountModificada(String name, double balance) {
		this.name = name;
		if (balance > 0.0)
			this.balance = balance; 
	}

	public void deposit(double depositAmount) {      
		if (depositAmount > 0.0) 
			balance = balance + depositAmount; 
	}
	
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance)
			balance = balance - withdrawAmount;
		else
			System.out.println("Withdrawal amount exceeded account balance.\n");
	}
	
	public double getBalance() {
		return balance; 
	} 
	
	public void setName(String name) {
		this.name = name; 
	} 

	public String getName() {
		return name; 
	} 
}
