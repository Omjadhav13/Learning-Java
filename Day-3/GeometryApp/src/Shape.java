
public class Shape {
	protected String color;
	public Shape(String color) {
		System.out.println("in super class");
		this.color=color;
	}
	
	public void draw() {
		System.out.println("Shape drawn using color: "+this.color);
	}
}
