package example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect // Marks this class as aspect specific class
@Component
public class Audience {
	
	//Defining a PointCut method	
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {}
	
	
	@Before("myPointCut()")
	public void takeSeats() {
		System.out.println("Please take seat........");
	}
	
	@Before("myPointCut()")
	public void turnOffMobile() {
		System.out.println("Turn off mobile........");
	}
	
	@AfterReturning("myPointCut()")
	public void clap() {
		System.out.println("clappppppppppp........");
	}
	
	@AfterThrowing("myPointCut()")
	public void demandForRefund() {
		System.out.println("We need refunddddd........");
	}
	
	@After("myPointCut()")
	public void leave() {
		System.out.println("Audience leaving,Bye........");
	}
}
