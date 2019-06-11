package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparable_Ex_01 {

	public static void main(String[] args) {
	
		
		City city1 = null;
		System.out.println(city1==null);
		
		
		ArrayList<City> list = new ArrayList<City>();	
		list.add(new City(011, "Delhi", 10000));
		list.add(new City(022, "Mumbai", 20000));
		list.add(new City(033, "Chennai", 30000));
		list.add(new City(044, "Kolkata", 20000));
		
		
		Collections.sort(list);
		for(City city : list)
			System.out.println(city.code);

	}

}
