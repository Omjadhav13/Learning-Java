package rest_impl;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestImpl {
	//This class is meant for exposing REST end point
	@GetMapping("/doGreet")
	public String getGreeting() {
		return "Welcome";
	}
	
	@GetMapping("/doGreetAgain")
	public Greeting getGreetingObject() {
		Greeting gr=new Greeting("Hello",LocalDate.of(2026, 1, 1));
		return gr;
	}
	
	@GetMapping("/doGreetsAgain")
	public Collection<Greeting>getGreetingObjects() {
		Greeting gr2=new Greeting("Hello",LocalDate.of(2026, 1, 1));
		Greeting gr3=new Greeting("Spring",LocalDate.of(2026, 3, 13));
		 List<Greeting> ls=java.util.List.of(gr2,gr3);
		 return ls;
	}
}
