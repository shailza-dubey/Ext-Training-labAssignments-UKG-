package q2;

public class TimeTable {

	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		System.out.print("* |\t1\t2\t3\t4\t5\t6\t7\t8\t9\n");
		System.out.println("----------------------------------------------------------------------------");
		for(int i=0; i<9;i++) {
			System.out.print(i+1 + " |\t");
			for(int j=0;j<9;j++) {
				arr[i][j] = (i+1) * (j+1);
				System.out.print(arr[i][j] + "\t");
			  }
			System.out.println();
			
		}
		
	
}
}
