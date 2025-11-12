package org.ycpait.democollection;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities = new TreeSet<String>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Pune");
		System.out.println(cities);
		cities.add("Pune");
		System.out.println(cities.contains("Pune"));
		System.out.println(cities);
		
		
		for(String city : cities) {
			System.out.println(city+" ");
		}
		System.out.println();
		Iterator<String> i;
		i = cities.iterator();
		while(i.hasNext()) {
			String city =i.next();
			System.out.print(city+" ");
			
			if(city.equals("Pune")) {
				cities.remove(city);
			}
		}
		
		System.out.println(cities);
	}

}
