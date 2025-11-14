package example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//This method retrieves all the record from student table,
//converts them into java objects of student class and returns
//all those objects in the form of Collection

public class StudentDao implements DaoInterface<Student, Integer> {
	@Override
	public Collection<Student> getAll() {
		
		//Declaring and empty Collection meant for holding objects of type :Student
		Collection<Student> studentList=new ArrayList<Student>();
		
		String Query="Select student_name,student_city,student_id from students";
		
		
			try (
				Connection dbConnection = JdbcUtils.getConnection();
				Statement st=dbConnection.createStatement();
				ResultSet rs=st.executeQuery(Query);
			){
				while(rs.next()) {
					String name=rs.getString(1);
					String city=rs.getString(2);
					int id=rs.getInt(3);
					
					
					//Creating an object of class Student based upon the fields
					Student stduentObj=new Student(id,name,city);
					
					
					//Adding the Student Object in Collection
					studentList.add(stduentObj);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
		return studentList;
	}
}
