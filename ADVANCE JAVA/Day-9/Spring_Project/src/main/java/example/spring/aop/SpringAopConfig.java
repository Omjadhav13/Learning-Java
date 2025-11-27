package example.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@ComponentScan
@EnableAspectJAutoProxy
@Configuration
public class SpringAopConfig {
	public void perform() {
		System.out.println("Playing guiter........");
	}
}
