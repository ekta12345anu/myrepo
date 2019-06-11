package examples;


public class test {

	public static void main(String[] args) throws InterruptedException {

		A a = new A("o1");
		 /*Thread t1 = new Thread(){
			 public void run(){
				 a.method2();
			 }
		 
		 };*/
		 
		 
		 Thread t2 = new Thread(){
			 public void run(){
				 A.method1();
			 }
		 
		 };
		 
		 Thread t3 = new Thread(){
			 public void run(){
				A.method1();
			 }
		 
		 };
		 
//		 t1.start();
		 t2.start();
		 t3.start();
//		 t1.join();
		 t2.join();
		 t3.join();
		

	}

}
