package example.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Department;
import example.utils.HibernateUtils;

public class AddDepartmentsMain {

	public static void main(String[] args) {
		try(
			SessionFactory factory=HibernateUtils.getSessionFactory();
			Session sessionObj=factory.openSession();
				
			){
			
			
			Department d1=new Department(11,"SDE","Mumbai",null);
			Department d2=new Department(13,"QA","Pune",null);
			
			
			Transaction tx=sessionObj.beginTransaction();
			
			sessionObj.persist(d1);
			sessionObj.persist(d2);
			
			tx.commit();
			System.out.println("Departments added succesufully");
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
