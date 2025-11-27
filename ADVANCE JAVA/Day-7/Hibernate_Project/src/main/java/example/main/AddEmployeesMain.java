package example.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Employee;
import example.utils.HibernateUtils;

public class AddEmployeesMain {

	public static void main(String[] args) {
		try(
			SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionObj=factory.openSession();
			){
			Employee e1=new Employee(101,"Om",70000);
			Employee e2=new Employee(102,"Amaan",60000);
			Employee e3=new Employee(103,"Shreya",70000);
			Employee e4=new Employee(104,"Sumit",65000);
			
			Transaction tx=sessionObj.beginTransaction();
			sessionObj.persist(e1);
			sessionObj.persist(e2);
			sessionObj.persist(e3);
			sessionObj.persist(e4);
			
			tx.commit();
			System.out.println("Employees added successfully");
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
