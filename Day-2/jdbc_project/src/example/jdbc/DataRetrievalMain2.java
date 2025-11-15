package example.jdbc;

import java.util.Collection;

public class DataRetrievalMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoInterface<Student,Integer> daoRef=new StudentDao();
		Collection<Student>allStudents=daoRef.getAll();
		
		for(Student s:allStudents) {
			System.out.println(s);
		}
		System.out.println();
		allStudents.stream().forEach(f->System.out.println(f));
		
		
		
		
		System.out.println("===============================================");
		
		Student std=daoRef.getOne(103);
		if(std!=null)
			System.out.println(std);
		else
			System.out.println("Student not found");
	}

}
