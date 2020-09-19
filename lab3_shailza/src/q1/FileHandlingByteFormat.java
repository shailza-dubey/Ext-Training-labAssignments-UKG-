package q1;

import java.io.*;

public class FileHandlingByteFormat {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream(new File("data.txt"))) {
			StringBuilder sb = new StringBuilder();
			int val;
			System.out.println("Byte Format Output: ");
			while((val = fis.read()) != -1) {
				System.out.print(val + " ");
				sb.append((char) val);
				
			}
			System.out.println();
			System.out.println("Formatted Output...");
			System.out.println(sb.toString());
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
