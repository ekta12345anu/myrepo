package Inheritance;

public class TestClass {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Ram";
		
		String string = "aaabcdeab";
		char[] charArr = string.toCharArray();
		int count=0;
		for(int i=0;i<charArr.length;i++){
			for(int j=0;j<charArr.length;j++){
				if(charArr[i]==charArr[j]){
					count++;
				}
				break;
			}
		}
		
		
		
	}

}
