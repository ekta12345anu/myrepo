package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Ex_03 {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String string = br.readLine();
			char[] stringArr = string.toLowerCase().toCharArray();
			int i=0;
			
			while(i<stringArr.length){
				
				if(stringArr[i]>=0 && stringArr[i]<=9){
					i++;
					continue;
				}else{
					break;
				}
			}
			if(i==stringArr.length)
				System.out.println(string +" contains only digits");
			else
				System.out.println(string +" contains digits or characters");
			
		}catch(IOException e){
			System.out.println("Exception occurred");
		}

	}

}
