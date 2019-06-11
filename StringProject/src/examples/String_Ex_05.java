package examples;

public class String_Ex_05 {

	public static void main(String[] args) {

		String input = "Today is Thursday and Tommorrow is Friday";
		// Output - yadoT is yadsruhT and worroommoT is Friday
		
		String[] arr = input.split(" ");
		String[] revStr = new String[arr.length];
		String revStr2="";
		
		for(int i=0;i<arr.length;i++){
			char[] charr = arr[i].toCharArray();
			if(charr[0] == 'T'){
				revStr2="";
				char[] chArr = arr[i].toCharArray();
				for(int k=arr[i].length()-1;k>=0;k--){
					revStr2+=chArr[k];
				}
				revStr[i]=revStr2;
			}else{
				revStr[i]=arr[i];
				continue;
			}
		}
		
		for(int i=0;i<revStr.length;i++){
			System.out.print(revStr[i] +" ");
		}

	}

}
