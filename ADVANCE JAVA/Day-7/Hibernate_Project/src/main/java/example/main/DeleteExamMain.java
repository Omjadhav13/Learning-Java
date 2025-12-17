package example.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Exam;
import example.utils.HibernateUtils;

public class DeleteExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionObj=factory.openSession();
			){
			Class<Exam> examClass=Exam.class;
			Object examCode="E03";
			Exam foundExam=sessionObj.find(examClass, examCode);
			if(foundExam!=null)
			{
				Transaction tx=sessionObj.beginTransaction();
				sessionObj.remove(foundExam);
				tx.commit();
				System.out.println("Exam record deleted successfully");
			}else
				System.out.println("Exam with given Id Does not exist");
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
