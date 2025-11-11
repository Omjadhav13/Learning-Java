package org.yccair.demo_project;

import java.util.Scanner;

public class test {

	public static  int nameLength(String name) {
		return name.length();
	}
	public static void displayMatrix(int length) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		String res=sc.next();
		String name;
	
		int choice=0;
		do {
			System.out.println("Word Puzzle");
			System.out.println("============");
			System.out.println("Enter your name");
			name=sc.next();
			displayMatrix(nameLength(name));
			
		}while(choice!= -1);
		
		
		
		
		if(res.equalsIgnoreCase(s)) {
			System.out.println("won");
		}
	}

}
