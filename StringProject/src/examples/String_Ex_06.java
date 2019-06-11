package examples;

public class String_Ex_06 {

	public static void main(String[] args) {
		
		String input="Avul Pakir Jainulabdeen Abdul Kalam";
//		output - R. K. Iyer
		
		
		
		String[] arr = input.split(" ");
		
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i].toUpperCase().charAt(0) + ". ");
		}
		System.out.print(arr[arr.length-1]);
		

	}

}
