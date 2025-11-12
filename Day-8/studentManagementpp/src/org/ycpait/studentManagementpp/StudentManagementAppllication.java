package org.ycpait.studentManagementpp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.ycpait.studentManagementpp.entity.Student;
import org.ycpait.studentManagementpp.exception.StudentNotFoundException;
public class StudentManagementAppllication {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Number of Students registered are :"+Student.getCount());
		Student s=null;
		int index=0;
//		Student[] students=new Student[2];
		Set<Student> students=new HashSet<Student>();
		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("1. Register new Employee");
			System.out.println("2. Display Details");
			System.out.println("3. Search student by rollnumber");
			System.out.println("4. Delete student by rollnumber");
			System.out.println("5. sort student by marks");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
//				if(index<students.size()) {
					System.out.println("Enter student name");
					String name = sc.next();
					System.out.println("Enter student marks");
					float marks= sc.nextFloat();
					s=new Student(name,marks);
					students.add(s);
					index++;
//				}
//				else
//					System.err.println("Limit exceeded");

				break;
			}
			case 2: {
				for(Student stu :students) {
					if(students!=null)
						System.out.println(stu);
				}
				break;
			}
			case 3:
				System.out.println("Ener roll number");
				int roll=sc.nextInt();
				boolean isFound=false;
					for(Student foundStudent : students) {
						if(foundStudent!=null) {
							if(foundStudent.getRollNumber()==roll) {
								System.out.println(foundStudent);
								isFound=true;
								break;
							}
						}
					}
					
					if(!isFound) {
						StudentNotFoundException ex=new StudentNotFoundException("Student with "+roll+" not found");
						try {
						throw ex;
					
					}catch(StudentNotFoundException ex1) {
						ex1.printStackTrace();
					}
					}
				break;
			case 4:
				System.out.println("Enter the student roll number you eant to delete");
				int del =sc.nextInt();
				Iterator<Student> list =students.iterator();
				
				while(list.hasNext()) {
					Student rol=list.next();
					if(del==rol.getRollNumber()) {
						list.remove();
						System.out.println("Student deleted ");
					}
				}
			break;
//			case 5:
//				Collections.sort(students);
//				
//				for(Student stu :students) {
//					if(students!=null)
//						System.out.println(stu);
//				}
//				break;
//			case 6: {
//                Collections.sort(, (e1, e2) -> e1.getName().compareTo(e2.getName()));
//
//                System.out.println("\nEmployees sorted by name:");
//                System.out.println("============================");
//                for (Employee emp : employees) {
//                    System.out.println(emp);
//                }
//                break;
			case 6:
				students.hashCode();
				String as="Amit";
				as.equals(students);
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
