package org.yccair.demo_project;

public class DemoManyCatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
			System.out.println(s.length());
			System.out.println(args[0]);
			System.out.println(1/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrya index out of range");
			
		}
		catch(NullPointerException e) {
			System.out.println("Cannot invoke method of null reference");
		}
		catch(Exception e) {
			System.out.println("Generic");
		}
		System.out.println("After");
	}

}
