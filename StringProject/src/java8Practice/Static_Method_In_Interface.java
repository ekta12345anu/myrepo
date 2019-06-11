package java8Practice;

@FunctionalInterface
public interface Static_Method_In_Interface {
	
 int count=0;
	
	static void show(){
		System.out.println("In Show method");
	}
	
	default void display(){
		System.out.println("In display method");
	}
	
	
	public static void main(String args[]){
		show();
	}
	
	//abstract int add();
	
	abstract float divide();

}
