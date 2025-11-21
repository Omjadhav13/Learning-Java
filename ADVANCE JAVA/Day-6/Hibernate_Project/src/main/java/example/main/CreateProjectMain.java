package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.entity.Project;

public class CreateProjectMain {

	public static void main(String[] args) {
		//Configure hibernate 
		Configuration cfg=new Configuration();
		cfg=cfg.configure();
		
		//obtain session factory
		SessionFactory factory=null;
		
		Session sessionObj=null;
		try {
		factory=cfg.buildSessionFactory();
		sessionObj=factory.openSession();
		
		//Instantiate the Entity class (create an object of the entity class
		Project myProject=new Project(101,"Banking System","Java",15);
		
		//Obtain transaction 
		Transaction tx= sessionObj.beginTransaction();
		
		//Store data into database
		sessionObj.persist(myProject);//persist-> store
		
		
		//Commit the transcation to save changes
		tx.commit();

		//clpse the session
		sessionObj.close();
		
		//close the sessionfactory
		factory.close();
		
		System.out.println("Record inserted successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
