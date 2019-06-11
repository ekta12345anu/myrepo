package newInt;

public class Singleton_Ex_01 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//Singleton_Class s1 = new Singleton_Class(); - Throws compilation error
		Singleton_Class s2 = Singleton_Class.getSingletonInstance();
		Singleton_Class s3 =Singleton_Class.getSingletonInstance();;
		Singleton_Class s4 = (Singleton_Class) Class.forName("Singleton_Class").newInstance(); // It will throw runtime exception since it's internally uses constructor 
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
