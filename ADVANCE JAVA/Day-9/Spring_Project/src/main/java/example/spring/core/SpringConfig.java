package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //marks this class as a configuration unit
public class SpringConfig {
	//This is class is meant for declaring beans or configurations beans
	
	//Defining a bean of type welcomeService
	@Bean //Marks this method as a bean declaration method
	public  GreetingService doWelcome() {
		GreetingService ws=new WelcomeService();
		return ws;
	}
	
	@Bean("helloBean")//overriding the default Id and making it as helloBean
	public  GreetingService doHello() {
		GreetingService ws=new HelloService();
		return ws;
	}
}