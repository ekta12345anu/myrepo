package examples;

public class Print_1_to_100 {

	public static void main(String[] args) {
		
		funct(1); 

	}
	
	static void  funct(int i){
		if(i<=100){
			System.out.print(i + " ");
			i++;
			
		funct(i);
	}
		else
//			System.gc();
			System.out.println(System.getenv("JAVA_HOME"));
			 System.exit(0);
	}
	
}
