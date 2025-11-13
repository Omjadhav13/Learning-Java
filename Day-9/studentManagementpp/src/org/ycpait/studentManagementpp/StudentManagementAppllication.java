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
import org.ycpait.studentmanagementapp.dao.impl.StudentDaoImpl;
public class StudentManagementAppllication {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Number of Students registered are :"+Student.getCount());
		Student s=null;
		int index=0;
		//		Student[] students=new Student[2];
//		List<Student> students=new ArrayList<Student>();
		StudentDaoImpl dao=new StudentDaoImpl();
		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("1. Register new Employee");
			System.out.println("2. Display Details");
			System.out.println("3. Search student by rollnumber");
			System.out.println("4. Delete student by rollnumber");
			System.out.println("5. sort student by marks");
			System.out.println("6. Sort student by Name");
			System.out.println("7. Students more than 90");
			System.out.println("8. Name of student who scored more than 90");
			System.out.println("9. Name of student who scored more than ");
			System.out.println("10. Find name of students who has selected java");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter student name");
				String name = sc.next();
				System.out.println("Enter student marks");
				float marks= sc.nextFloat();
				System.out.println("Enter number of students");
				int numSub=sc.nextInt();
				List<String> subjects=new ArrayList<String>();
				for(int i=0;i<numSub;i++) {
					System.out.println("Enter name of Subject");
					String sub=sc.next();
					subjects.add(sub);
				}
				
				s=new Student(name,marks,subjects);
			
				index++;
				dao.save(s);
				break;
			}
			case 2: {
				for(Student stu :dao.findAll()) {
					if(dao!=null)
						System.out.println(stu);
				}


				break;
			}
			case 3:
				System.out.println("Enter roll number");
				int roll=sc.nextInt();
				try {
					Student searchStudent=dao.findOne(roll);
					System.out.println(searchStudent);
				} catch (StudentNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Enter the student roll number you want to delete");
				int rollNumber =sc.nextInt();
				dao.delete(rollNumber);
				break;
			case 5:
				Collections.sort(dao.findAll());

				for(Student stu :dao.findAll()) {
					if(dao.findAll()!=null)
						System.out.println(stu);
				}
				break;
//			case 6: {
//				Collections.sort(dao.findAll(), (e1, e2) -> e1.getName().compareTo(e2.getName()));
//
//				System.out.println("\nEmployees sorted by name:");
//				System.out.println("============================");
//				for (Employee emp : employees) {
//					System.out.println(emp);
//				}
//				break;
			case 6:
				Collections.sort(dao.findAll(),(s1,s2)->s1.getName().compareTo(s2.getName()));
				System.out.println("Sorted Students by names");
				
				for(Student sort:dao.findAll()) {
					if (sort!=null) {
						System.out.println(sort);
					}
				}
				break;
			case 11:
				Collections.sort(null);
				break;
			case 7:
				dao.findAll().stream().filter(f->f.getMarks()>90)
				.toList()
				.forEach(st->System.out.println(st));


				break;
			case 8:
				List<String>liststudent= dao.findAll().stream()
				.filter(f->f.getMarks()>90)
				.map(c->c.getName())
				.toList();

				liststudent.forEach(c->System.out.println(c));
				break;
			case 9:
				System.out.println("Enter marks ");
				int m=sc.nextInt();
				dao.findAll().stream().map(p->p.getMarks()>m).toList().forEach(c->System.out.println(c));
				
				
				break;
			case 10:
				dao.findAll().stream().filter(p->p.getSubjects()
									.contains("Java"))
									.toList()
									.forEach(c->System.out.println(c));
				break;
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
