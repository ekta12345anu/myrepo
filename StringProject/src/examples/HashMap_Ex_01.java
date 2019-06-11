package examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import newInt.Interface_I1;

public class HashMap_Ex_01 implements Interface_I1 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<10;i++){
			map.put("Key"+String.valueOf(i), new Integer(i));	
		}

		// way #1
		for(int i=0;i<10;i++){
			System.out.println("Key"+String.valueOf(i) +" : " + map.get("Key"+String.valueOf(i)) );
		}
		
		// way #2
		Set<String> keys = map.keySet();
		for(String key : keys){
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		// way #3
		Set<Entry<String,Integer>> mappings = map.entrySet();
		for(Entry<String, Integer> mapping : mappings){
			System.out.println(mapping);
		}
		
		Set<Entry<String,Integer>> set =map.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<10;i++){
			hs.add(String.valueOf(i));
		}
		for(int i=0;i<10;i++){
			hs.add(String.valueOf(i));
		}
		System.out.println(hs.size());
		
		/*hs.iterator().forEachRemaining();
		
		Consumer<? extends Action>*/
		
		Iterator<String> itrerator = hs.iterator();
		while(itrerator.hasNext()){
			System.out.println("Hashset value : " +itrerator.next() );
		}
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
