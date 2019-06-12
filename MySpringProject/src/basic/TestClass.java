package basic;

public class TestClass {

	public static void main(String[] args) {
		Immutable immutableObj = new Immutable("Ram",20);
//		immutableObj.id=20;
		System.out.println(immutableObj.getId());
		System.out.println(immutableObj.getName());
		
		String string = new String("Shyam");
		
		
		System.out.println(string.hashCode());
		string += "Ram";
		System.out.println(string.hashCode());
		System.out.println(string);
		
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2); 
		
	}
}
