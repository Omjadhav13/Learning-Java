package org.yccair.demo_project;

import java.io.IOException;

public class DemoThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IOException e=new IOException();
		
		//handling exception
//		try {
//			throw e;
//		}
//		catch(IOException ex) {
//			
//		}
//		throw e;
		
		//Handling the exception
		try {
			readFile();
		}catch(IOException ex) {
			
		}
		
		
	}
	static void readFile() throws IOException{
		IOException e=new IOException();
		throw e;
	}

}
