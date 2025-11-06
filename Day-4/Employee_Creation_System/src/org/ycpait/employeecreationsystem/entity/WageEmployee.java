package org.ycpait.employeecreationsystem.entity;

public class WageEmployee extends Employee {

	private int hours;
	private int rate;
	public WageEmployee(String name, double basicSalary, int hours, int rate) {
		super(name, basicSalary);
		this.hours = hours;
		this.rate = rate;
	}
	@Override
	public double calculateSalary() {
		return this.basicSalary+this.hours*this.rate;
	}
	@Override
	public void showDetails() {
		System.out.println(this.id+"	\t"+this.name+"	\t"+calculateSalary());
	}
}
