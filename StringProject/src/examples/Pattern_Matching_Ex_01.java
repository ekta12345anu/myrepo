package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern_Matching_Ex_01 {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int input = Integer.parseInt(br.readLine());
			int i=0;
			String[] inputString = new String[input];
			while(i<input){
				 inputString[i] = br.readLine();
				i++;
			}
			
			int j=0;
			boolean flag=false;
			while(j<inputString.length){
				char[] inputStringArray = inputString[j].toCharArray();
				for(int k=0;k<inputStringArray.length;k++){
					
					switch(inputStringArray[k]){
					case 40: if(inputStringArray[k+1] == 41)
							System.out.println("balenced");
					flag=true;
							break;
							
					case 91: if(inputStringArray[k+1] == 93)
						System.out.println("balenced");
					flag=true;
						break;
						
					case 123: if(inputStringArray[k+1] == 125)
						System.out.println("balenced");
					flag=true;
						break;
					default: 		
						System.out.println("not balenced");
						flag=false;
					}
					
					if(flag==false){
						break;
					}else{
						continue;
					}
				}
				
				j++;
			}
			
		}catch(IOException e){
			
		}

	}
	
	
	/*static int nextChar(int ch){
		
		if(ch)
		return 1;
	}*/

}
