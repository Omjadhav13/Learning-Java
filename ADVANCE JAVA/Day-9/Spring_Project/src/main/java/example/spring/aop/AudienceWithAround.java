package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // Marks this class as aspect specific class
@Component
public class AudienceWithAround {
	
	//Defining a PointCut method	
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {}
	
	
	
	private void takeSeats() {
		System.out.println("Please take seat........[Around]");
	}
	
	
	private void turnOffMobile() {
		System.out.println("Turn off mobile........[Around]");
	}
	
	public void clap() {
		System.out.println("clappppppppppp........[Around]");
	}
	

	private void demandForRefund() {
		System.out.println("We need refunddddd........[Around]");
	}
	
	
	private void leave() {
		System.out.println("Audience leaving,Bye........[Around]");
	}
	
	@Around("myPointCut()")
	public void monitorPerformance(ProceedingJoinPoint joinPoint) {
		try {
			takeSeats();
			turnOffMobile();
			joinPoint.proceed();
			joinPoint.proceed();
			clap();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			demandForRefund();
		}		
		leave();
	}
}
