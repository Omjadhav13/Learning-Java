package org.ycpait.geometryapp.entity;

public abstract class Shape {
	protected String color;
	public Shape(String color) {
		System.out.println("in super class");
		this.color=color;
	}
	public abstract void getInfo();
	public abstract float calculateArea();
	public void draw() {
		System.out.println("Shape drawn using color: "+this.color);
	}
}
