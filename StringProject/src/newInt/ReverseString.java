package newInt;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Sharma";
		char[] inp = str.toCharArray();
		String revStr = "";
		for(int i=inp.length-1;i>=0;i--){
			revStr+=inp[i];
		}
		
		System.out.println(revStr);
		

	}

}
