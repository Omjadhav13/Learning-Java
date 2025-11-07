package studentManagementpp;

import java.util.Scanner;

public class StudentManagementAppllication {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Number of Students registered are :"+Student.getCount());
		Student s=null;
		int index=0;
		Student[] students=new Student[2];
		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("1. Register new Employee");
			System.out.println("2. Display Details");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				if(index<students.length) {
					System.out.println("Enter student name");
					String name = sc.next();
					System.out.println("Enter student marks");
					float marks= sc.nextFloat();
					students[index]=new Student(name,marks);
					index++;
				}
				else
					System.err.println("Limit exceeded");
				
				break;
			}
			case 2: {
				for(Student stu :students) {
					if(students!=null)
						System.out.println(stu);
				}
				break;
			}
			case -1: {
				System.out.println("Thank you");
				break;
			}
			default:
				System.out.println("Select valid choice");
				break;
			}
			System.out.println("Number of Students registered are :"+Student.getCount());
		}while(choice!=-1);
		
		System.out.println("Program Exit Successful");

	}

}
