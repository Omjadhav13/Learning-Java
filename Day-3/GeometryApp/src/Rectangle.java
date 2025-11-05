
public class Rectangle extends Shape {
	private float length;
	private float breadth;
	
	public Rectangle(float length, float breadth,String color) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	
	public float calculateArea() {
		return length*breadth;
	}
	//METHOD OVERIDDING
	@Override
	public void draw() {
		super.draw();
		System.out.println("using : "+this.length+" "+this.breadth);
		}
}
