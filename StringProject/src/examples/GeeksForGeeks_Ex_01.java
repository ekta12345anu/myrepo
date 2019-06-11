package examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GeeksForGeeks_Ex_01 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int testCase = Integer.parseInt(br.readLine());
			int[] colsInput = null;
			int sum=0;
			String length=null;
			String[] lengthOfCols =null;
			
			int output[] = null;
			for(int t =0;t<testCase;t++){
				length = br.readLine();
				 lengthOfCols = length.split(" ");
				
				for(int i=0;i<lengthOfCols.length;i++){
					colsInput = new int[Integer.parseInt(lengthOfCols[i])];
				
					for(int j=0;j<Integer.parseInt(lengthOfCols[i]);j++){
						colsInput[j] =Integer.parseInt(br.readLine());	
					}
					
				}
				
			}
			
			for(int i=0;i<lengthOfCols.length;i++){
				for(int j=0;j<colsInput[i];j++){
				System.out.println(colsInput[j]);
						
				}
				
			}
			
		
			
			for (int i = 0; i < lengthOfCols.length; i++) {
				for (int j = 0; j < Integer.parseInt(lengthOfCols[i]); j++) {
					sum = sum + colsInput[j];
				}
				output[i] = sum;
			}
			
			for(int i = 0; i < lengthOfCols.length; i++){
				if(output[i]>output[i++]){
					System.out.println("C1");
				}else{
					System.out.println("C2");
				}
			}
			
		}catch(Exception e){
			
		}

	}

}
