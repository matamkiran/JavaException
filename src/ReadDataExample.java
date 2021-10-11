import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataExample {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str =br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			br.close();
			System.out.println(111);
		}
	}

}
