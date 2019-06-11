package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Subsets_With_Unique_Sum {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			
			int i =0;
			int j =0;
			int set[] = new int[n1];
			int subset[] = new int[n2];
			
			while(n1!=0){
				set[i] = Integer.parseInt(br.readLine());
				n1--;
				i++;
			}
			
			/*while(n2 !=0){
				subset[j] = Integer.parseInt(br.readLine());
				n2--;
				j++;
			}*/
			
			int n3 = Integer.parseInt(br.readLine());
			int count=1;
			 
			int l =0;
			while(l<=set.length){
				int m=0;
				
				while(n2!=0){
					subset[m] = set[l];
					l++;
					n2--;
					
					m++;
				}
			}
				
			System.out.println(Arrays.toString(subset));
	

			
		}catch(IOException e){
			
		}

	}

}
