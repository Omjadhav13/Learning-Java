package example.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.entity.Exam;
import example.utils.HibernateUtils;

public class FromClauseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionObj=factory.openSession();
				
		){
			String hqlQuery="FROM Exam ex";
			
			Query<Exam> queryRef=sessionObj.createQuery(hqlQuery, Exam.class);
			
			List<Exam> examList=queryRef.getResultList();
			
			for(Exam currentExam:examList) {
				System.out.println(currentExam );
			}
			
			
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
