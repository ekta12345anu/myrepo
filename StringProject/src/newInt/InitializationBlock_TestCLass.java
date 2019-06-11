package newInt;

public class InitializationBlock_TestCLass {

	public static void main(String[] args) {
		
		InitializationBlock_Ex_01 ib = new InitializationBlock_Ex_01();
		InitializationBlock_Ex_01 ib2 = null;
		ib2=new InitializationBlock_Ex_01();
		System.out.println(ib.add(10,20));

	}

}
