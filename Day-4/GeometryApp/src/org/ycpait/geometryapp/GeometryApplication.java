package org.ycpait.geometryapp;

import org.ycpait.geometryapp.entity.*;

public class GeometryApplication {

	public static void main(String[] args) {
		
		Shape s = new Circle(2,"red");
//		Shape s=new Shape(2,"red"); object of abstract class cannot be created
		System.out.println(s.calculateArea());
		s.draw();
		s.getInfo();
		
		Circle c = new Circle(2,"red");
		s=c;//upcasting
		c.getPi();
		
		c=(Circle)s; //downcasting
		c.getPi();
		
	}

}
