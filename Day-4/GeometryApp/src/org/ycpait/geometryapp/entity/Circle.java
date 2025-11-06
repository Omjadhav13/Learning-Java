package org.ycpait.geometryapp.entity;
public class Circle extends Shape{
	private float radius;

	
	public Circle(float radius, String color) {
		super(color);
		this.radius = radius;
	}
	
	public float calculateArea() {
		return 3.14f*radius*radius;
	}
	public void getPi() {};
	//METHOD OVERIDDING
	@Override
	public void draw() {
		super.draw();
		System.out.println("With radius: "+this.radius);
	}
	
	@Override
	public void getInfo() {
		System.out.println("circle");
	};

}
