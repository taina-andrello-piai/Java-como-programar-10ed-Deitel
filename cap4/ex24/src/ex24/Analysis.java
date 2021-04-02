package ex24;

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
	     int passes = 0; 
	     int failures = 0;
	     int studentCounter = 1; 

	     while (studentCounter <= 10) 
	     {
	    	 int confere = 0;
	    	 while(!(confere == 1 || confere == 2)) {
	    		 System.out.print("Enter result (1 = pass, 2 = fail): ");
	    		 confere = input.nextInt();
	    		 if(!(confere == 1 || confere == 2))
	    			 System.out.println("Try Again");
	    	 }	 
	    	 
	    	 int result = confere;
	         if (result == 1)         
	            passes = passes + 1;   
	         else                        
	            failures = failures + 1; 
	         
	         studentCounter = studentCounter + 1;  
	      } 

	      System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

	      if (passes > 8)
	         System.out.println("Bonus to instructor!");
	      
	      input.close();
	      return;
	}
}
