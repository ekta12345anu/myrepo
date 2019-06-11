package examples;

public class Performance_Ex_01 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		int sum=0;
		int i=0;
		
		// took 4seconds
		/*for( i=0; i<1000000;i++){
			sum+=i;
		}*/
		
		// took 3seconds
		/*while(i<1000000){
			sum+=i;
			i++;
		}*/
		
		// took 3.5seconds
		do{
			sum+=i;
			i++;
		}while(i<1000000);
		
		System.out.println(sum);
		long stopTime = System.currentTimeMillis();
		System.out.println("program took " + (stopTime-startTime) + " seconds");

	}

}
