package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetic_Progression {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			
			
			
			int testCases = Integer.parseInt(br.readLine());
			int temp[]=new int[testCases];
			for(int j=0;j<testCases;j++){
				String[] tokens = br.readLine().split(" ");
				int a = Integer.parseInt(tokens[0]);
				int b = Integer.parseInt(tokens[1]);
				int n = Integer.parseInt(br.readLine());
				int d = b-a;
				
				for(int i=2;i<n;i++){
					temp[j]=b;
					temp[j]+=d;
					b=temp[j];
				}
				
			}
			for(int j=0;j<testCases;j++){
				System.out.println(temp[j]);	
			}
			
			
		}catch(IOException | NumberFormatException e){
			System.out.println("Error: Please enter valid input");
		}

	}

}
