package newInt;

public class Factorial_Using_Recusion {

	public static void main(String[] args) {
		System.out.println(fact(6));
	}
	
	static int fact(int n){
		if(n==0)
			return 1;
		else
			return (n*fact(n-1));

		}

}
