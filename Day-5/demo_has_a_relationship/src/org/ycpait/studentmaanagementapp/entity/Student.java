package org.ycpait.studentmaanagementapp.entity;

public class Student {
	private int rollNumber;
	//has-a relationship
	private Address postalAddress;
	private Trainer instructor;
	public Student(int rollNumber, Address postalAddress) {
		super();
		this.rollNumber = rollNumber;
		this.postalAddress = postalAddress;
	}

	public void  setInstructor(Trainer instructor) {
		this.instructor=instructor;
	}
	public Trainer getInstructor() {
		return this.instructor;
	}
	
	public void setAddress(Address postalAddress) {
		this.postalAddress=postalAddress;
	}
	public Address getAddress() {
		return this.postalAddress;
	}
	
}
