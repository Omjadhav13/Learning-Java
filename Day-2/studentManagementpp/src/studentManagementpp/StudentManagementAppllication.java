package studentManagementpp;

public class StudentManagementAppllication {

	public static void main(String[] args) {
		System.out.println("Number of students register" +  Student.getCount()) ;

		//1.create a reference of Student type
		Student student;
		//2. create object and assign to reference object
		student=new Student("test",234.54f);
		student.display("*");
//		student.rollNumber= -1;//to stop this we make sure rolNumber is not accessible outside the class 
//		student.name="om";
//		student.marks=93.36f;
		System.out.println();
//		
//		student.setDetails(1, "Amit", 63.63f);
//		student.display();	//invoking display(0 method
		
//		System.out.println();
		Student student1=new Student("cbv",56.36f);
		student1.display();
//		
//		System.out.println();
//		
//		student1.setDetails(33, "om", 98.65f);
//		student1.display("*");
//		
//		System.out.println();
//		
//		Student students =new Student(65,"desv",51.44f) ;
//		students.display("*");
		System.out.println();
		System.out.println("Number of students register 	" +  Student.getCount()) ;
	}

}
