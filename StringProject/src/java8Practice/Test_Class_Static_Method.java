package java8Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Test_Class_Static_Method {

	public static void main(String[] args) {
		
		Static_Method_Impl smi = new Static_Method_Impl();
		Static_Method_In_Interface.show();
		smi.display();
		smi.divide();
		
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		Iterator<String> itr = list.iterator();	
		while(itr.hasNext()){
			System.out.println(itr.next()); 
		}
		
		
		Stream<String> listStream = list.stream();
		
		Spliterator<String> split = listStream.spliterator();
		
		System.out.println(split.getExactSizeIfKnown());
		
		
		HashMap<String	,String> employeeHm = new HashMap<String,String>();
		employeeHm.put("1", "Employee1");
		employeeHm.put("2", "Employee2");
		employeeHm.put("3", "Employee3");
		employeeHm.put("4", "Employee_null");
		employeeHm.put("5", null);
		
		
		
		
		
		
				
	}

}
