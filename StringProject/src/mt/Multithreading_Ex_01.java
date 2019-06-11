package mt;

public class Multithreading_Ex_01 {

	public static void main(String[] args) {

		for(int i=1;i<=1000;i++){
		m1();
		m2();
		m1();
		m2();
		}
		
		

	}
	
	
	public static long fact(int n){
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	
	public static void m1(){
		m2();
		System.out.println(fact(2));
	}

	public static void m2(){
		m1();
		System.out.println(fact(3));
	}
}
