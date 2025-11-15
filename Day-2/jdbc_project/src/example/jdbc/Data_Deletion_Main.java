package example.jdbc;

public class Data_Deletion_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoInterface<Student, Integer> daoRef=new StudentDao();
	
			daoRef.deleteOne(101);
		
	}

}
