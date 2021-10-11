import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in));) {
			String str =br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
