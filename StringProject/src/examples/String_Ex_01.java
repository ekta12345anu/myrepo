package examples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class String_Ex_01 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String s = br.readLine();
			char[] sArray = s.toLowerCase().toCharArray();
			
			int count =1;
			for(int i = 0; i<sArray.length; i++){
				for(int j = i+1; j<sArray.length; j++){
					if(sArray[i] == sArray[j]){
						count++;
					}else{
						
					}
				}
				if(count>1){
					
				System.out.print(sArray[i] + " occurred ");
				System.out.println(count + " times");
				count = 1;
				}
			}
			
		}catch(IOException e){
			System.out.println("IOException occurred");
		}
		
		long stopTime = System.currentTimeMillis();
		System.out.println("program took " + (stopTime-startTime)/1000 + " seconds");

	}

}
