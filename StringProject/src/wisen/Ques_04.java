package wisen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ques_04 {

	public static void main(String[] args) {
		
		List<Integer> n = new ArrayList<>(Arrays.asList(1,24,-1,8,-3,0));
		System.out.println(n);
		Iterator<Integer> itr = n.iterator();
	while( itr.hasNext()){
			if(itr.next()<0){
				n.remove(itr.next());
			}
		}
	System.out.println(n);
	
		}
		
		
	

}
