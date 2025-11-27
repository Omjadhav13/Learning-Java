package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configFilePath="./src/main/resources/Spring-Config.xml";
		
		ApplicationContext context=new FileSystemXmlApplicationContext(configFilePath);
		
		Object obj= context.getBean("myBean");
		
		GreetingService gs=(GreetingService)obj;//Managed Component object is created by spring 
		
		String reply =gs.sayGreeting();
		
		System.out.println(reply);
		System.out.println("====================================================");
	
		obj=context.getBean("userBean");
		
		gs=(GreetingService)obj;
		
		reply=gs.sayGreeting();
		
		System.out.println(reply);
		
		System.out.println("=====================================================");
		
		obj=context.getBean("userBean2");
		gs=(GreetingService)obj;
		reply=gs.sayGreeting();
		System.out.println(reply);
		
	}

}
