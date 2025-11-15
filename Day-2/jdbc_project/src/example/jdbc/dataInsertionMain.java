package example.jdbc;

public class dataInsertionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoInterface<Student,Integer> daoRef=new StudentDao();
		
		Student std=new Student(106,"King","Goa");
		daoRef.create(std);
	}

}
