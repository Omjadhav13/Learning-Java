import java.util.Scanner;

public class EmployeeCreationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double basicSalary;
		TestEmployee emp=null;
		TestEmployee []te=new TestEmployee[50];
		int i=0;
		System.out.println("Welcome to Employee Management System");
		System.out.println("==========================================");
		System.out.println("Number of employee are : "+ TestEmployee.getCount());
		System.out.println("==========================================");
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Register new Employee");
			System.out.println("2. Display details");
			System.out.println("-1. Exit");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter Employee Name");
					name=sc.next();
					System.out.println("Enter Employee Basic Salary");
					basicSalary=sc.nextDouble();
					
					te[i] = new TestEmployee(name,basicSalary);
					if(te[i]==null) {
						System.out.println("Object not created1");
					}
					
					i++;
					break;
				case 2:
					if(i>0) {
						System.out.println("Employee Id \tEmploye Name \tEmployee Salary");
						for(int j=0;j<i;j++) {
							te[j].showDetails("=");
						}
						
					}else{
						System.out.println("No Employees in the record");
					}
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
