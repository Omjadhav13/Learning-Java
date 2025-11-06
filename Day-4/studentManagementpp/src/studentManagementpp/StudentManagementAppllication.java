package studentManagementpp;

import java.util.Scanner;

public class StudentManagementAppllication {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Number of Students registered are :"+Student.getCount());
		Student s=null;
			
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
				s = new Student("om",89.7f);
				break;
			}
			case 2: {
				if(s!=null)
//					s.display();
					System.out.println(s);
				break;
			}
			case -1: {
				
				break;
			}
			default:
				System.out.println("Select correct choice");
				break;
			}
		}while(choice!=-1);
		System.out.println("Program Exit Successful");

	}

}
