
public class DemoInterface implements Printable,Startable {
	public void display() {
		System.out.println("display");
	}
	public void again() {
		System.out.println("again");
	}
	void of() {
		
	}
	public void draw() {
		
	}
	
	public static void main(String[] ags) {
		Printable di=new DemoInterface();
		
		di.display();
		di.show();
	}
}
