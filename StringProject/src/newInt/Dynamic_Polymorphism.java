package newInt;

public class Dynamic_Polymorphism {

	public static void main(String[] args) {
		
		
		Car c = new Audi(); // upcasting
		c.run();
		//Audi a = (Audi) new Car();// downcasting not allowed
		Audi a = new Audi();
		a.run();
		
		Car c1 = new Car();
		c1.run();
		
	a.m.run();
	
	
	System.out.println("BMW in interface variable a: "+a.m.a);
	System.out.println("Vehicle interface variable b : " + a.b);
	}

}
