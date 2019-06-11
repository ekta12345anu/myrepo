package examples;

import java.util.HashSet;
import java.util.TreeSet;

public class Set_Ex_01 {

	public static void main(String[] args) {

		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(15);
		hashSet.add(5);
		hashSet.add(25);
		hashSet.add(10);
		hashSet.add(0);
		
		
		System.out.println(hashSet);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
			treeSet.add(15);
			treeSet.add(5);
			treeSet.add(25);
			treeSet.add(10);
			treeSet.add(0);
			
		
		
		
		System.out.println(treeSet);
	}

}
