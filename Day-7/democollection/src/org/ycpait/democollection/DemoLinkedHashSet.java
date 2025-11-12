package org.ycpait.democollection;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities = new LinkedHashSet<String>();
		cities.add("Mumbai");
		cities.add("delhi");
		cities.add("Pune");
		System.out.println(cities);
		cities.add("Pune");
		System.out.println(cities.contains("Pune"));
		System.out.println(cities);
//		Collections.sort(cities); sorting not works here
		
		

	}

}
