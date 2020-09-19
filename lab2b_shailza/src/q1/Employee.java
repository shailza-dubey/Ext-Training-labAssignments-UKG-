package q1;

public abstract class Employee implements Payable {

	public abstract double getSalary();
	public abstract void setSalary(double rate);
	public abstract void incSalary(int percentage);


}
class SalariedEmployee extends Employee{
    private double weeklyRate;
    
 
   public SalariedEmployee(double weeklyRate) {
		super();
		this.weeklyRate = weeklyRate;
	}


	@Override
	public double getPayment() {
		return this.getSalary();
	}


	@Override
	public double getSalary() {
		return this.weeklyRate;
	}


	@Override
	public void setSalary(double rate) {
		weeklyRate=rate;
		
	}


	@Override
	public void incSalary(int percentage) {
		weeklyRate = weeklyRate+(1.0 + (double)percentage/100.0);
		
	}

}	
	

class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double hrRate;
	public HourlyEmployee(double hoursWorked, double hrRate) {
		
		this.hoursWorked = hoursWorked;
		this.hrRate = hrRate;
	}
	@Override
	public double getPayment() {
		return this.getSalary();
	}
	@Override
	public double getSalary() {
		return hrRate*hoursWorked;
	}
	@Override
	public void setSalary(double rate) {
		hrRate = rate;
		
	}
	@Override
	public void incSalary(int percentage) {
		hrRate = hrRate+(1.0 + (double)percentage/100.0);
		
	}
    

}	


class CommissionEmployee extends Employee{
   
    private double sales;
    private double percentage;
    
    
	public CommissionEmployee(double sales, double percentage) {
		super();
		this.sales = sales;
		this.percentage = percentage;
	}
	
	@Override
	public double getSalary() {
	    return percentage * sales/100;
	}
	
	@Override
	public void setSalary(double rate) {
		percentage = rate;
		
	}
	@Override
	public void incSalary(int percentage) {
		this.percentage = this.percentage * (1.0 + (double)percentage/100.0);
		
	}
	

	@Override
	public double getPayment() {
		return this.getSalary();
	
	}
	
}


