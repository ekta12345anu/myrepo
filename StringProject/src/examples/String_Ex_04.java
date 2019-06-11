package examples;

public class String_Ex_04 {

	public static void main(String[] args) {
		
		
		
		String input = "Today is Thursday and Tommorrow is Friday";
		// Output - Thursday is Today
		
		String[] arr = input.split(" ");
		String[] revstr= new String[arr.length];
		
		
		for(int i=arr.length-1,j=0;i>=0;i--,j++){
			revstr[j] = arr[i];
		}
			
		for(int i=0;i<arr.length;i++){
		System.out.print(revstr[i]+" ");
		}

	}

}
