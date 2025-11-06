package org.ycpait.wrapper;

public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PRIMITIVE 
		int i=10;
		
		//primitive to wrapper
//		Integer iobj=new Integer(i); --> Depricated
		Integer iobj=i;//Alternated  -->Auto-Boxing
		
		//wrapper to primitive
		int j =iobj.intValue();
		
		//string to wrapper
		Integer o=Integer.valueOf("77");
		
		
		//wrapper to string
		String str=o.toString();

		
		//String to primitive
		int p=Integer.parseInt("77");
		
		//wrapper to string
		String st=o.toString();
		
	}

}
