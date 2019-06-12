package PrepDay1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If_Else_Ex_01 {

	public static void main(String[] args) {

		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int n = Integer.parseInt(br.readLine());
			
			if(n%2!=0)
				System.out.println("Weird");
			else
				if((n>=2 && n<=5) || (n>20))
					System.out.println("Not Weird");
				else
					System.out.println("Weird");
		} catch (NumberFormatException | IOException e) {
			System.out.println("Exception occurred");
			
		} 
		
		
	}

}
