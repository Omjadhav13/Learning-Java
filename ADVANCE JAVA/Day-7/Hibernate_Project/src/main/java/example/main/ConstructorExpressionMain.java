package example.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.bean.ExamNameAndDuration;
import example.utils.HibernateUtils;

public class ConstructorExpressionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionObj=factory.openSession();
				
		){
			String hqlQuery="SELECT new example.bean.ExamNameAndDuration ( ex.name,ex.duration ) from Exam ex";
			Query<ExamNameAndDuration> queryRef= sessionObj.createQuery(hqlQuery, ExamNameAndDuration.class);
			
			List<ExamNameAndDuration> dataList=queryRef.getResultList();
			
			for(ExamNameAndDuration data:dataList) {
				String examName=data.getExamName();	
				int examDuration=data.getExamDuration();
				System.out.println("Name : "+examName+" | "+"Duration : "+examDuration);
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
