
 interface Printable {
	 //by default methods is public as well as abstract and needed to be implemented
	void display();
	// static method
	static void of() {}
	//default methods ,no needed to implement its your choice
	default void show() {System.out.println("print");};
}
