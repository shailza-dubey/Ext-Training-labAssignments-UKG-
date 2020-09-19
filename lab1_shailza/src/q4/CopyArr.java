package q4;

public class CopyArr {
	
	
	
	public static int[] copyOf(int[] array) {
		int[] arr = new int[array.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=array[i];
			
		}
		return arr;
		
		
	}
	
	public static void main(String args[]) {
		int[] a= {3,4,5,6,7,8};
		int[] arr=copyOf(a);
		for(int i : arr) {
		System.out.print("\t" + i);
		}
	}

}
