package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class String_Ex_07 {

	public static void main(String[] args) {

		String input ="My name is Ekta";
		
		HashMap<String, Integer> occurence = new HashMap<String,Integer>();
		
		char[] str = input.replace(" ", "").toLowerCase().toCharArray();
		int count=0;
		occurence.put(String.valueOf(str[0]), count);
		for(int i=0;i<str.length;i++){
			
			
			if(occurence.containsKey(String.valueOf(str[i]))){
				count=occurence.get(String.valueOf(str[i]));
				count++;
				occurence.put(String.valueOf(str[i]), count);
			}else{
				count=1;
				occurence.put(String.valueOf(str[i]), count);
			}	
		}
		
		
		
		//System.out.println(occurence);
		Iterator<Integer> set = occurence.values().iterator();
		
		while(set.hasNext()){
			System.out.println(set.next());	
		}
		
		
	}

}
