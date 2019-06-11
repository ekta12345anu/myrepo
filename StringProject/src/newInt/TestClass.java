package newInt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class TestClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add(new Object());
		/*arrayList.add(1);
		arrayList.add(1);*/
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(null);
		hashSet.add(1);
		/*while(hashSet.iterator().hasNext()){
		System.out.println(hashSet.iterator().next());
		}*/
		LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
		TreeSet<Object> treeSet = new TreeSet<Object>();
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		/*hashMap.put(null, new Object());*/
		Integer y= new Integer(1);
		while(y<=13){
			hashMap.put(y.toString(), new Object());	
			y++;
		}
		
		TreeMap<String, String> treeMap = new TreeMap<String,String>();
		ConcurrentHashMap<String,Object> conhashMap = new ConcurrentHashMap<String,Object>();
		conhashMap.put("1", new Object());
		LinkedHashMap<Object,Object> linkedHashMap = new LinkedHashMap<Object,Object>();
		System.out.println(arrayList.size());
		System.out.println(linkedList.size());
		System.out.println(hashSet.size());
		System.out.println(linkedHashSet.size());
		System.out.println(hashMap.size());
		
		System.out.println(treeSet.size());
		System.out.println(treeMap.size());
		System.out.println(conhashMap.size());
		System.out.println(linkedHashMap.size());
		
		System.out.println("------");
		String string = new String("");
		
		System.out.println(string.hashCode());
		
		
		System.out.println(hashMap.get(null));
		Employee emp5 = (Employee) Class.forName("Employee").newInstance();
		
		
		
		

	}

}
