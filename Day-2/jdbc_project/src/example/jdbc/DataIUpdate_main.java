package example.jdbc;

public class DataIUpdate_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoInterface<Student, Integer> daoRef=new StudentDao();
		Student foundStudent=daoRef.getOne(102);
		
		if(foundStudent !=null) {
			foundStudent.setName("amaan");
			foundStudent.setCity("Mumbai");
			daoRef.update(foundStudent);
		}
		else
			System.out.println("Student not found");
	
	
	}
	

}
