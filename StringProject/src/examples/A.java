package examples;

public class A {


	private  String name;

	public A(String name) {
		this.name = name;
	}
	
	public static synchronized void method1(){
		System.out.println("SM1");
		System.out.println("SM2");
		
	}


	public  synchronized void method2(){
		System.out.println(name +"M1");
		System.out.println(name +"M2");
		
	} 	
	
}
