package example.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Department;
import example.entity.Employee;
import example.utils.HibernateUtils;

public class LinkEmployeesToDepartment {

	public static void main(String[] args) {
		//this class loads all the employees,departments and links them
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionObj=factory.openSession();
		){
			//Loading all the employees which are to e linked
			Employee emp1=sessionObj.find(Employee.class,101);
			Employee emp2=sessionObj.find(Employee.class,102);
			Employee emp3=sessionObj.find(Employee.class,103);
			Employee emp4=sessionObj.find(Employee.class,104);
			
			//loading all the departments to which employees are to be linked
			Department dept1=sessionObj.find(Department.class, 11);
			Department dept2=sessionObj.find(Department.class, 13);
			
			
			Transaction tx=sessionObj.beginTransaction();
			//populating a list of employees: emp1,emp2
			 List <Employee> empList=List.of(emp1,emp2);
			 dept1.setEmployeeList(empList);
			 
			 //Adding remaining employees one by one to 2nd dept
			 
			 dept2.addEmployee(emp3);
			 dept2.addEmployee(emp4);
			 
			
			
			tx.commit();
			System.out.println("Records added successfully");
			
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
