package q3;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		double initBal=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name, type of account,initial balance: ");
		String userName=sc.nextLine();
		String acType=sc.nextLine();
		
		if(acType.equals("savings")) {
			System.out.println("Enter initial balance:");
			initBal=sc.nextDouble();
			if(initBal<500.0) {
				initBal=500.0;
			}
			System.out.println("Enter the maximum withdrawl limit:");
			double maxWithdrawLimit=sc.nextDouble();
			SavingsAccount s = new SavingsAccount(userName, initBal, maxWithdrawLimit);
			do {
				System.out.println(" Main Menu ");
				System.out.println(" 1 - Deposit ");
				System.out.println(" 2 - Withdraw ");
				System.out.println(" 3 - Display account balance ");
				System.out.println(" 0 - Exit ");
				System.out.println("Enter your choice: ");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:System.out.println("Do you want to check balance? (true/false) ");
				       Boolean showBalance = sc.nextBoolean();
				       if(showBalance)
				    	   	System.out.println("Balance before deposit :" + s.getAccountBalance());
				       System.out.println("Enter the amt you want to deposit");
					   double amt=sc.nextDouble();
					   s.deposit(amt);
 
					   if(showBalance)	 
					 	 	System.out.println("Balance after deposit :" + s.getAccountBalance());
					   break;
				 	
				     
				    
				     
				     
				case 2:System.out.println("Do you want to check balance? (true/false) ");
			           Boolean showBalance1 = sc.nextBoolean();
			           if(showBalance1)
			    	   		System.out.println("Balance before deposit :" + s.getAccountBalance());
			           System.out.println("Enter the amt you want to withdraw");
				       double withdrawAmt=sc.nextDouble();
				       s.withdraw(withdrawAmt);

				       if(showBalance1)	 
				 	 		System.out.println("Balance after deposit :" + s.getAccountBalance());
				       break;
			     
				case 3:System.out.println("Balance in account is: " + s.getAccountBalance());
				       break;
				       
				case 0:break;
				default:System.out.println("WRONG CHOICE!");
				
					
				}
			
				
			}while(true);
		}
		else if (acType.equals("current")) {
			System.out.println("Enter initial balance:");
			initBal=sc.nextDouble();
			
			System.out.println("Enter the trade license number:");
			String tradeLicenseNumber=sc.nextLine();
			CurrentAccount c = new CurrentAccount(userName, initBal, tradeLicenseNumber);
			do {
				System.out.println(" Main Menu ");
				System.out.println(" 1 - Deposit ");
				System.out.println(" 2 - Withdraw ");
				System.out.println(" 3 - Display account balance ");
				System.out.println(" 0 - Exit ");
				System.out.println("Enter your choice: ");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:System.out.println("Do you want to check balance? (true/false) ");
				       Boolean showBalance = sc.nextBoolean();
				       if(showBalance)
				    	   	System.out.println("Balance before deposit :" + c.getAccountBalance());
				       System.out.println("Enter the amt you want to deposit");
					   double amt=sc.nextDouble();
					   c.deposit(amt);
 
					   if(showBalance)	 
					 	 	System.out.println("Balance after deposit :" + c.getAccountBalance());
					   break;
				 	
				     
				    
				     
				     
				case 2:System.out.println("Do you want to check balance? (true/false) ");
			           Boolean showBalance1 = sc.nextBoolean();
			           if(showBalance1)
			    	   		System.out.println("Balance before deposit :" + c.getAccountBalance());
			           System.out.println("Enter the amt you want to withdraw");
				       double withdrawAmt=sc.nextDouble();
				       c.withdraw(withdrawAmt);

				       if(showBalance1)	 
				 	 		System.out.println("Balance after deposit :" + c.getAccountBalance());
				       break;
			     
				case 3:System.out.println("Balance in account is: " + c.getAccountBalance());
				       break;
				       
				case 0:break;
				default:System.out.println("WRONG CHOICE!");
				
					
				}
			
				
			}while(true);
		}
		sc.close();
	}

}