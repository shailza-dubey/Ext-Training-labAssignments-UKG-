package q2;
import java.io.*;

public class FileHandlingCharacterBuffer {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File("data2.txt")))) {
			System.out.println("Write anything..");
			String line = null;
			while(!(line = br.readLine()).equals("")) {
					bw.write(line + "\n");
					bw.flush();
		}
				

	}catch(IOException e) {
		e.printStackTrace();
	}
  
  }
}
