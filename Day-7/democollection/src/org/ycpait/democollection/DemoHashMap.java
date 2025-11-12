package org.ycpait.democollection;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		Map<Integer,String> cities=new HashMap<Integer,String> ();
		cities.put(22,"Mumbai");
		cities.put(11, "Delhi");
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println(cities.get(11));
		System.out.println(cities.containsKey(11)+" " +cities.containsValue("Mumbai"));

	}

}
