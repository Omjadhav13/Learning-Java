package org.ycpait.studentManagementpp.entity;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Serializable ,Comparable<Student>{
	//static variable
	private static int count;
	
	//instance variable
	//attributes
	private int rollNumber;
	private String name;
	private float marks;
	void setDetails(int rollNumber,String name,float marks) {
		this.rollNumber=count;
		this.name=name;
		this.marks=marks;
	}

	public static int getCount() {
		return count;
	}

	
	//parameterized constructor 
	public Student(String name,float marks) {
		count++;
//		System.out.println("inside parameterized constructor ");
			this.rollNumber=count;
			this.name=name;
			this.marks=marks;
	}
	
	public void setMarks(float marks) {
		this.marks=marks;
	}
	public float getMarks() {
		return marks;
	}
	
	public void setName(String name)
	{
		this.name =name;
	}
	public String getName() {
		return name;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	
	
	//instance method
	void display() {
		System.out.print(this.rollNumber+"	\t"+this.name+"\t"+this.marks);
	}
	//overloaded display method
	void display(String format) {
		
		System.out.println("RollNumber\tName\tMarks");
		
		for(int i=1;i<=40;i++) {
			System.out.print(format);
			
		}
		System.out.println();
		
		System.out.print(this.rollNumber+"	\t"+this.name+"\t"+this.marks);
	}
	public String toString(){
		return this.rollNumber+"	\t"+this.name+"\t"+this.marks;
	}
	
	@Override 
	public int compareTo(Student o) {
		return (int) (marks-o.marks);
		
	}
	
	@Override
	public int hashCode() {
		
		System.out.println("in hashCode of Student");
		return this.name.length();
	}

	@Override
	public boolean equals(Object o) {
		Student s=(Student)o;//downcasting
		return this.name.equals(s.name);
	}

}
