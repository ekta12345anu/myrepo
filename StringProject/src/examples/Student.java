package examples;

public class Student implements Cloneable {

	int id;
	String name;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	
	
}
