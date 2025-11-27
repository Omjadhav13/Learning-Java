package example.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.utils.HibernateUtils;

public class SelectClauseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionObj=factory.openSession();
				
		){
			String hqlQuery="SELECT ex.name,ex.duration from Exam ex";
			Query<Object[]> queryRef= sessionObj.createQuery(hqlQuery, Object[].class);
			
			List<Object[]> dataList=queryRef.getResultList();
			
			for(Object[] data:dataList) {
				Object examName=data[0];
				Object examDuration=data[1];
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
