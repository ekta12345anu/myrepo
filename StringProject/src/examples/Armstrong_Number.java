package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int testcases = Integer.parseInt(br.readLine());
			
			for(int l =0;l<testcases;l++){
			String input = br.readLine();
			String[] array = input.split("");
			int num = Integer.parseInt(input);
			int origNum=num;
			int sum=0;
			int i=array.length-1;
			while(num!=0){
				int j = (int) (num/Math.pow(10, i));
				num = (int) (num%Math.pow(10, i));
				sum = sum +(j*j*j);
				i--;
			}
			if(origNum==sum){
				System.out.println("Armstrong");
			}else{
				System.out.println("not Armstrong");
			}
			
			}
			
		}catch(IOException e){
			
		}

	}

}
