package org.ycpait.democollection;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DemoVector {
	public static void main(String[] args) {
		List<String> cities =new Vector<String>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.addFirst("Pune");
		cities.addLast("Delhi");
		System.out.println(cities);
		System.out.println(cities.size());
		Collections.sort(cities);
		System.out.println(cities);
		cities.remove(0);
		System.out.println(cities);
		System.out.println(cities.size());
	}
}
