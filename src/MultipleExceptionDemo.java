import java.io.IOException;

public class MultipleExceptionDemo {
	
	public static void main(String args[]) {
		
		try {
			int k=10/0;
			
		}catch(NullPointerException | ArithmeticException ex) {
			ex.printStackTrace();
		}
	}

}
