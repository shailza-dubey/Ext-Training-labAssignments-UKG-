package q1;


public class Application {

	public static void main(String[] args) {
     
		Employee e1 = new SalariedEmployee(10000);
		
		Employee e2 = new HourlyEmployee(25, 350);
		
		Employee e3 = new CommissionEmployee(8000, 40);
		
		Invoice i1 = new Invoice("1", "Monitor", 10, 4000);
		
		Invoice i2 = new Invoice("2", "Keyboard", 20, 600);
		
		System.out.println("Total payment: " + e1.getPayment() + "\n");
		System.out.println("Total payment: " + e2.getPayment() + "\n");
		System.out.println("Total payment: " + e3.getPayment() + "\n");
		System.out.println("Total payment: " + i1.getPayment() + "\n");
		System.out.println("Total payment: " + i2.getPayment() + "\n");
	
	

	}

}
