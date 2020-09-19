package q4;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = null;
		while(true) {
			System.out.println("Main Menu");
			System.out.println("1 - to create a Student object");
			System.out.println("2 - to display the student info");
			System.out.println("3 - Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("1 - create the object using name,id & grade");
			        System.out.println("1 - create the object using name & id");
			        System.out.println("1 - create the object using id");
			        System.out.print("Enter your choice: ");
			        int choice2 = sc.nextInt();
			        if(choice2 == 1) {
			        	sc.nextLine();
			        	System.out.println("Enter name,id & grade");
			        	String name=sc.nextLine();
			        	String id=sc.nextLine();
			        	double grade=sc.nextDouble();
			        	 s = new Student(name,id,grade);
			        	
			        }
			        else if(choice2 == 2) {
			        	sc.nextLine();
			        	System.out.println("Enter name & id");
			        	String name=sc.nextLine();
			        	String id=sc.nextLine();
			        	s = new Student(name,id);
			        	
			        }
			        else if(choice2 == 3) {
			        	sc.nextLine();
			        	System.out.println("Enter name & id");
			        	String id=sc.nextLine();
			            s = new Student(id);
			        }
			        break;
			        
			case 2: System.out.println("1 - Display the object with year");
			        System.out.println("2 - Display the object without year");
			        System.out.print("Enter your choice: ");
			        int choice3 = sc.nextInt();
			        if(choice3 == 1) {
			        	System.out.println("Enter year: ");
			        	int year = sc.nextInt();
			        	if(s != null)
			        		s.display(year);
			        }
			        else if(choice3 == 2) {
			        	s.display();
			        }
			        break;
			        
			case 3: break;
			default:System.out.println("WRONG CHOICE");
			       
		}
			
			
		}
		
		
	
		

	}

}
