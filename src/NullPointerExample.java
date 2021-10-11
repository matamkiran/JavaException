
public class NullPointerExample {
	
	public static void main(String args[]) {
		
		String str=null;
		try {
			str.charAt(0);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

}
