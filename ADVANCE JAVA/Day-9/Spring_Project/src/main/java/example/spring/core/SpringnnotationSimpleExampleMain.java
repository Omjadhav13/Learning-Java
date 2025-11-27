package example.spring.core;import javax.swing.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;


// This class loads the bean configuration using annotation
public class SpringnnotationSimpleExampleMain {

	public static void main(String[] args) {
		Class<SpringConfig> configClass = SpringConfig.class;
		ApplicationContext context=new AnnotationConfigApplicationContext(configClass);
		
		Object obj=context.getBean("doWelcome");
		GreetingService gs=(GreetingService)obj;
		String reply=gs.sayGreeting();
		System.out.println(reply);
	
		System.out.println("============================================");
		
		obj=context.getBean("helloBean");
		gs=(GreetingService)obj;
		reply=gs.sayGreeting();
		System.out.println(reply);
	
	
	}

}
