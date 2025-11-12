package org.ycpait.employeecreationsystem;
import org.ycpait.employeecreationsystem.entity.*;
import org.ycpait.employeecreationsystem.entity.Manager;
import org.ycpait.employeecreationsystem.entity.WageEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double basicSalary;
		WageEmployee wg=null;
		Manager mg=null;
		List<Employee > te=new ArrayList<Employee>();
		Employee emp=null;
		int i=0;
		System.out.println("Welcome to Employee Management System");
		System.out.println("==========================================");
		System.out.println("Number of employee are : "+ Employee.getCount());
		System.out.println("==========================================");
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Register new Employee");
			System.out.println("2. Display details");
			System.out.println("3. Search Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Sort employee by name");
			System.out.println("6. Sort Employee by salary");
			System.out.println("-1. Exit");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
//					 wg=new WageEmployee("om",6520.00,4,30) ;
//					 mg=new Manager(300,"Sumit",7000);
					System.out.println("Enter Employee Name");
					name=sc.next();
					System.out.println("Enter Employee Basic Salary");
					basicSalary=sc.nextDouble();
					emp=new Employee(name,basicSalary);
					te.add(emp);
					i++;
					break;
				case 2:
						System.out.println("Employee Id \tEmploye Name \tEmployee Salary");
						for(Employee employee:te) {
							if(te!=null) {
							System.out.println(employee);
							}
						}
					break;
				case 3:
					System.out.println("Enter employee id to search");
					int Id=sc.nextInt();
					boolean flag=false;
					for(Employee searchById : te ) {
						if(searchById!=null) {
							if(Id==searchById.getId()) {
								System.out.println(searchById);
								flag=true;
								break;
							}
						}
					}
					if(!flag) {
						EmployeeNotFoundException ex=new EmployeeNotFoundException();
					}
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 6:
					break;
					
				case -1:
					System.out.println("Thankyou");
					break;
				default:
					System.out.println("Invalid Choice");
				}
		}while(choice!=-1);
		
		
			
			
//			
//		
//		TestEmployee Emp1=new TestEmployee("om",6520.00);
//		TestEmployee Emp2=new TestEmployee("sumit",7046.00);
//		TestEmployee Emp3=new TestEmployee("amaan",5630.00);
//		TestEmployee Emp4=new TestEmployee("Shreyas",8680.00);
//		Emp1.showDetails("=");
//		Emp2.showDetails();
//		Emp3.showDetails();
//		Emp4.showDetails();
//		String name;
//		double basicSalary;
//		TestEmployee emp=null;
//		System.out.println("Welcome to Employee Management System");
//		System.out.println("==========================================");
//		System.out.println("Number of employee are : "+ TestEmployee.getCount());
//		System.out.println("==========================================");
//		Scanner sc= new Scanner(System.in);
//		int choice;
//		do {
//			System.out.println("1. Register new Employee");
//			System.out.println("2. Display details");
//			System.out.println("-1. Exit");
//			choice=sc.nextInt();
//			switch(choice) {
//				case 1:
//					System.out.println("Enter Employee Name");
//					name=sc.next();
//					System.out.println("Enter Employee Basic Salary");
//					basicSalary=sc.nextDouble();
//					emp=new TestEmployee(name,basicSalary);
//					break;
//				case 2:
//					if(emp!=null) {
//						System.out.println("Employee Id \tEmploye Name \tEmployee Salary");
//						emp.showDetails("=");
//					}else{
//						System.out.println("No Employees in the record");
//					}
//					break;
//				case -1:
//					System.out.println("Thankyou");
//					break;
//				default:
//					System.out.println("Invalid Choice");
//				}
//		}while(choice!=-1);
		
	}

}
