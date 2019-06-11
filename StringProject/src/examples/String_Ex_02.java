package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class String_Ex_02 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			String string1 = br.readLine();
			String string2 = br.readLine();

			if (string1 != null && string2 != null) {
				if (sort(string1).equals(sort(string2)))
					System.out.println("Anagram");
				else
					System.out.println("Not an anagram");
			}else{
				System.out.println("Not a valid string");
			}
			
		}catch(IOException e){
			System.out.println("Exception occurred");
		}
	}
	
	
	public static String sort(String string){
		int i =0;
		char[] stringArr = string.toLowerCase().toCharArray();
		
		while(i<stringArr.length){
			int j=i;
			while(j<stringArr.length){
				if(stringArr[i]>stringArr[j]){
					char temp = stringArr[i];
					stringArr[i] = stringArr[j];
					stringArr[j] =  temp;
				}
				j++;
			}
			i++;
		}
		return String.copyValueOf(stringArr);
	}
	


}