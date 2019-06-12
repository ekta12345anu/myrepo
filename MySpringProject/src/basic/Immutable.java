package basic;

public final class Immutable {

	private final String name ;
	private final int id ;
	
	public Immutable(String name, int id) {
		this.name = name;
		 this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	String str3="Hello";
	
	public void test(){
		System.out.println(str3);
	}
	
}
