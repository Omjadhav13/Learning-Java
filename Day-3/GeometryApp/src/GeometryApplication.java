import java.util.Scanner;
public class GeometryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter radius of circle: ");
//		float radius=sc.nextFloat();
//		
//		System.out.println("Enter colour of circle: ");
//		String color=sc.next();
		
//		Circle c=new Circle(radius,color);
		Circle c=new Circle(2,"red");
	
		System.out.println("Area of a circle: "+c.calculateArea());
		c.draw();
		
//		System.out.println("Enter length of rectangle: ");
//		float length=sc.nextFloat();
//		
//		System.out.println("Enter breadth of rectangle: ");
//		float breadth=sc.nextFloat();
//		
//		System.out.println("Enter colour of rectangle: ");
//		String rec_Color=sc.next();
		
//		Rectangle rec=new Rectangle(length,breadth,rec_Color);
		Rectangle rec=new Rectangle(2,3,"blue");
		System.out.println("Area of rectangle :"+rec.calculateArea());
		rec.draw();
	}

}
