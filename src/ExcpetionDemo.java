
public class ExcpetionDemo {
	
	
	public static void main(String args[]) {
		
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
