package studentManagementpp;

public class Student {
	//static variable
	private static int count;
	
	//instance variable
	//attributes
	private int rollNumber;
	private String name;
	private float marks;
	void setDetails(int rollNumber,String name,float marks) {
		this.rollNumber=count;
		this.name=name;
		this.marks=marks;
	}
	//non-parameterized constructor
//	Student(){
//		System.out.println("inside non parameterized constructor ");
//		this.rollNumber=1;
//		this.name="abd";
//		this.marks=13.3f;
//		
//	}
	
	public static int getCount() {
		return count;
	}

	
	//parameterized constructor 
	public Student(String name,float marks) {
		count++;
//		System.out.println("inside parameterized constructor ");
			this.rollNumber=count;
			this.name=name;
			this.marks=marks;
			
		 
	}
	//instance method
	void display() {
		System.out.print(this.rollNumber+"	\t"+this.name+"\t"+this.marks);
	}
	//overloaded display method
	void display(String format) {
		
		System.out.println("RollNumber\tName\tMarks");
		
		for(int i=1;i<=40;i++) {
			System.out.print(format);
			
		}
		System.out.println();
		
		System.out.print(this.rollNumber+"	\t"+this.name+"\t"+this.marks);
	}

}
