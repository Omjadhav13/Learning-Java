package org.yccair.demo_project;

public class DemoFinally {

	public static void main(String[] args) {

		try{
			System.out.println(1/0);
		}
		catch(ArithmeticException e){
			System.err.println("CANNOT DIVIDE BY ZERO");
		}
		finally {
			System.out.println("in finally");
		}		

	}

}
