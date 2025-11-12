import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
	}

}
