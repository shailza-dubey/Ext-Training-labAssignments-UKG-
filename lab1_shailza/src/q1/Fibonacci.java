package q1;


public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[20];
		int sum=0;
		System.out.println("The first 20 Fibonacci numbers are: ");
		for(int i=0;i<20;i++) {
			a[i]=display(i+1);
			System.out.print(a[i] + "\t");
			sum+=a[i];
			
			
		}
		System.out.println();
		
		System.out.print("The average is " + sum/20D);
		
	

	}
	
	 static int display(int n) {
		
		 
			if(n==1 || n==2)
				return 1;
			else
				return display(n-1) + display(n-2);
			
			
		
		
	}

}
