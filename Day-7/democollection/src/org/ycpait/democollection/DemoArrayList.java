package org.ycpait.democollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities;
		cities = new ArrayList<String>();
		System.out.println(cities.size());
		
		cities.add("Mumbai");//adding elements
		cities.add("Delhi");//adding elements
//		cities.add(12);//boxing (primitive to wrapper) ->this line gives error ad me made list generic by <String>
		
		System.out.println(cities);
		System.out.println(cities.size());//number of elements
		
		cities.add(1,"Pune");//adding at given index
		
		System.out.println(cities);
		System.out.println(cities.size());
		
		
		System.out.println("Before "+cities);
		
		Collections.sort(cities);
		
		System.out.println("After "+cities);
		
		System.out.println(cities.get(1));//returns element at index
		
		cities.remove(2);//remove element at index
		System.out.println(cities);
		System.out.println(cities.size());
	}

}
