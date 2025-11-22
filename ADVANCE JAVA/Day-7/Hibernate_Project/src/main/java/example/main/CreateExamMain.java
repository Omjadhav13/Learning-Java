package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Exam;
import example.utils.HibernateUtils;

public class CreateExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionObj=factory.openSession();
				){
			Exam examObj=new Exam("E03","DBT","Practical",45);
			Transaction tx=sessionObj.beginTransaction();
			sessionObj.persist(examObj);
			tx.commit();
			System.out.println("Exam Created successfully");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
