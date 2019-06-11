package examples;

import java.util.Collections;
import java.util.LinkedList;

public class reverseLinedlist {

	public static void main(String[] args) {

		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for (int i = list.size();i>0;i--){
			System.out.println(list.get(i));
		}
	/*	
		ListIterator<Integer> itr = list.listIterator();
//		for(Iterator<Integer> it : itr){
		while(itr.hasNext())
			System.out.println(itr.next());
//		}
*/		
		
		
		

	}

}
