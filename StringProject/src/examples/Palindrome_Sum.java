package examples;

public class Palindrome_Sum {

	public static void main(String[] args) {
		
			
		String input = "My Name Is Ekta Sharma";
		
		String[] split = input.split(" ");
		char temp ;
		String revStr="";
		for(int i=0;i<split.length;i++){
			if(i%2!=0){
				String[] str = split[i].split("");
				char[] strArr = str[i].toCharArray();
				
				for(int j=strArr.length-1;j>=0;j--){
					revStr+=strArr[j];
				}
			
				split[i]=revStr;
			}
			
		}
		for(int i=0;i<split.length;i++){
			System.out.println(split[i]);	
		}
		
				

	}

}
