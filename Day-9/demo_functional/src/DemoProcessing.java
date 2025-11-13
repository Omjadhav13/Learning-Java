import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class DemoProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities=new ArrayList<String> ();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Mysore");
		cities.add("Manglore");
		
		System.out.println(cities);
		System.out.println();
		List<String> Mcities=new ArrayList<String>();
		
		cities.forEach(str->System.out.println(str));
		
		for(String city:cities) {
			if(city.startsWith("M")) {
				Mcities.add(city);
				
			}
		}
		
		System.out.println(Mcities);
		
		
		List<Integer> cityLength =new ArrayList<Integer> ();
		
		for(String city:cities) {
			cityLength.add(city.length());
			
		}
		System.out.println(cityLength);
		
		
		
		
		
		///Stream 
		Stream <String> streamCities=cities.stream();
		
		Stream <String>filteredStream= streamCities.filter(c->c.startsWith("M"));
		List<String> newCities=filteredStream.toList();
		
		
		System.out.println(newCities);
		
		streamCities=cities.stream();
		Stream<String> filteredStreamLength=streamCities.filter(P->P.length()>5);
		List<String> cities5 = filteredStreamLength.toList();
		System.out.println(cities5);
		
		streamCities=cities.stream();
		Stream<Integer> length=streamCities.map(s->s.length());
		List<Integer> citiesLength=length.toList();
		System.out.println(citiesLength);
		
		
		
		//
		List<Integer> city=cities.stream().map(c->c.length()).toList();
		System.out.println("using Declarative programming for function: "+city);
		
		
		List<String> newcity=cities.stream().filter(c->c.startsWith("M")).toList();
		System.out.println("using declarative programming for predicate: "+newcity);
		
		
	}

}
