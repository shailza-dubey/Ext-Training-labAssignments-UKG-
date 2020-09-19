package q7;

import java.io.IOException;

class InputException extends RuntimeException{


	public InputException(int max) {
		super("Number can't be greater than " + max);
		
	}
     
}

public class ThrowExceptionMeth {
	

	public static void throwException() throws InputException, IOException {

	}
	//We have to surround main with try-catch or throws declaration to call the throwException method
	public static void main(String[] args) {
		
		try {
			throwException();
		
		} catch (InputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
