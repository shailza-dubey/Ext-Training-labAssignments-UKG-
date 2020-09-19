package q3;

import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numStudents,temp=0;
		double sum=0;
		System.out.println("Enter the number of students: ");
		Scanner scanner = new Scanner(System.in);
		numStudents=scanner.nextInt();
		int[] grades=new int[numStudents];
		for(int i=0;i<numStudents;i++) {
			
				 System.out.println("Enter the grade of student "+ (i+1) + ": ");
				 temp=scanner.nextInt();
		
				 
			     
				 if(temp<0 || temp>100) {
					System.out.println("Invalid grade, try again...");
					i--;
					
				    
				    }
				 
				 else
					 {grades[i]=temp;
				      sum+=grades[i];
				      }
		
		
			
		}
		System.out.println("The average is: " + sum/numStudents);
		
		

	}
}




