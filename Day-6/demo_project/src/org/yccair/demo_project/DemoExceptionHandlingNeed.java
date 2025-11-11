package org.yccair.demo_project;

public class DemoExceptionHandlingNeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=2;
		int num2=0;
		try{
			int result=num1/num2;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.err.println("CANNOT DIVIDE BY ZERO");
			e.printStackTrace();// this prints complete stack trace on console needed for debugging
		}
	}		

}
