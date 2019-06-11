package newInt;

public class InitializationBlock_Ex_01 {
	
	static {
		System.out.println("It is a static Initialization Block");
	}

	{
		System.out.println("It is a Initialization Block");
	}
	
	int a;
	int b;
	public void InitializationBlock(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	public int add(int a,int b){
		return a+b;
	}
	
	
}
