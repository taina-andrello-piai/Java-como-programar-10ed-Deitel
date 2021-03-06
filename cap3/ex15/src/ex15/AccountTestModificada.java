package ex15;

import java.util.Scanner;

public class AccountTestModificada {

	public static void main(String[] args) {
		
		AccountModificada account1 = new AccountModificada("Jane Green", 50.00);
		AccountModificada account2 = new AccountModificada("John Blue", -7.53);
		
		displayAccount(account1);
		displayAccount(account2);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("\nEnter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		
		System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
		account2.deposit(depositAmount); 
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("\nEnter withdraw amount for account1: ");
		double withdrawAmount = input.nextDouble();
		
		System.out.printf("%nwithdrawing %.2f to account1 balance%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("\nEnter withdraw amount for account2: ");
		withdrawAmount = input.nextDouble();
		
		System.out.printf("%nwithdrawing %.2f to account2 balance%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		input.close();
		return;
	}
	
	public static void displayAccount(AccountModificada accountToDisplay) {
		
		System.out.printf("%s balance: $%.2f%n",
				accountToDisplay.getName(), accountToDisplay.getBalance());	
	}
}
