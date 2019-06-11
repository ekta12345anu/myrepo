package newInt;

public class Singleton_Class {

	private static Singleton_Class object;
	
	private Singleton_Class(){
		
	}
	
	public static  Singleton_Class getSingletonInstance(){
		
		if(object == null){
			object=new Singleton_Class();
		}
		return object;
	}
	
}
