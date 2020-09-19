package q3;

public class CurrentAccount extends Account {
	private String tradeLicenseNumber;
	
	public CurrentAccount(String userName, double initBal,String tradeLicenseNumber) {
		super(userName,initBal);
		this.tradeLicenseNumber=tradeLicenseNumber;
	}
	

	public double getBalance() {
		return this.getAccountBalance();
	}
	
	public void withdraw(double withdrawAmt) {
		if(withdrawAmt<=this.getAccountBalance())
			this.setAccountBalance(this.getAccountBalance()-withdrawAmt);
	}

}
