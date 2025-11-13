package org.ycpait.studentManagementpp.entity;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class Student implements Serializable ,Comparable<Student>{
	//static variable
	private static int count;
	
	//instance variable
	//attributes
	private int rollNumber;
	private String name;
	private float marks;
	private List<String> subjects;
	
	//parameterized constructor 
		public Student(String name,float marks,List<String> subjects) {
			count++;
//			System.out.println("inside parameterized constructor ");
				this.rollNumber=count;
				this.name=name;
				this.marks=marks;
				this.subjects=subjects;
		}
		

	public List<String> getSubjects(){
		return this.subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects=subjects;
	}
	public static int getCount() {
		return count;
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
		System.out.print(this.rollNumber+"	\t"+this.name+"\t"+this.marks +"\t"+this.subjects.toString());
	}
	//overloaded display method
	void display(String format) {
		
		System.out.println("RollNumber\tName\tMarks");
		
		for(int i=1;i<=40;i++) {
			System.out.print(format);
			
		}
		System.out.println();
		
		System.out.print(this.rollNumber+"	\t"+this.name+"\t"+this.marks +"\t"+this.subjects.toString());
	}
	public String toString(){
		return this.rollNumber+"	\t"+this.name+"\t"+this.marks +"\t"+this.subjects.toString();
	}
	
	@Override 
	public int compareTo(Student o) {
		return (int) (marks-o.marks);
		
	}
	
	//HashCode
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
