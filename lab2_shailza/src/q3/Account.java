package q3;

import java.util.Random;

public class Account {
	
	private String memberName;
	private String accountNumber;
	private double accountBalance;
	
	Account(){
		
	}

	public Account(String memberName, double accountBalance) {
		Random rand = new Random();
		accountNumber = 10000 + rand.nextInt(89999) + "";
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}
	public void deposit(double depAmt) {
		this.accountBalance+=depAmt;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

	

	}


