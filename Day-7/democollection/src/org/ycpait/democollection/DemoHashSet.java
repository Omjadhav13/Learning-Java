package org.ycpait.democollection;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities =new HashSet<String>();
		cities.add("Delhi");
		cities.add("Mumbai");
		
		System.out.println(cities);
		System.out.println(cities.size());
		
		cities.add("Mumbai");
		
		System.out.println(cities);// no duplicates allowed
		System.out.println(cities.size());
		
//		System.out.println(cities.get(0)); it has no index
//		cities.add(1,"Delhi");
		System.out.println(cities.contains("Mumbai")); // return true
		cities.clear();
		System.out.println(cities);
	}

}
