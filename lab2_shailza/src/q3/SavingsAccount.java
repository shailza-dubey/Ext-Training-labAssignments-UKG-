package q3;

public class SavingsAccount extends Account {
	 private final double  interest=5;
	 private double maxWithdrawLimit;
	 
	 
	 public SavingsAccount(String userName, double initBal,double maxWithdrawLimit) {
		super(userName,initBal);
		this.maxWithdrawLimit=maxWithdrawLimit;
	}
	public double getBalance() {
		 double currBal = getAccountBalance()+(getAccountBalance()*interest*0.01);
		 return currBal;
	 }
	 public void withdraw(double withdrawAmt) {
		 if(withdrawAmt<=maxWithdrawLimit && this.getAccountBalance()-withdrawAmt>=500)
			 this.setAccountBalance(this.getAccountBalance()-withdrawAmt);
	 }

}