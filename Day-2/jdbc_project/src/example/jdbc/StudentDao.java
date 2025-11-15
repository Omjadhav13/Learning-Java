package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

	@Override
	public Student getOne(Integer studentId) {
		//This methods accepts an integer value indicating student id and returns the
		//student object matching with that ID
		
		//If ID does not exists ,it returns null
		
		Student foundStudent=null;
		String sqlQuery="Select student_name,student_city,student_id from students where student_id=?";
		
		try (
			Connection dbConnection=JdbcUtils.getConnection();
			PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
			){
				//Substituting student ID in place of '?'
				pstmt.setInt(1, studentId);
				ResultSet rs=pstmt.executeQuery();
				
				
				if(rs.next()) {
					String name=rs.getString(1);
					String city =rs.getString(2);
					int id=rs.getInt(3);
					foundStudent=new Student(id,name,city);
				}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return foundStudent;
	}

	@Override
	public void create(Student students) {
		// TODO Auto-generated method stub

		String query="Insert into students values(?,?,?)";
		try(
				Connection dbConnection=JdbcUtils.getConnection();
				PreparedStatement ptsmt=dbConnection.prepareStatement(query);
			)
		{
			//fetching the values from students object
			String name=students.getName();
			int id=students.getStudentId();
			String city=students.getCity(); 
			
			//Substituting these values in place of '?'
			ptsmt.setInt(1, id);
			ptsmt.setString(2, name);
			ptsmt.setString(3, city);
			
			int count=ptsmt.executeUpdate();
			System.out.println(count+" recored inserted");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	//This method receives modified state of the Student object and reflects that state back to DB 
	//to complete the update operation
	@Override
	public void update(Student modifiedStudent) {
		
		String query="update students set student_name=?,student_city=? where student_id=?";
		try(
				Connection dbConnection=JdbcUtils.getConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(query);
			)
		{
			//fetching the values from Student object
			int id=modifiedStudent.getStudentId();
			String name=modifiedStudent.getName();
			String city = modifiedStudent.getCity();
			
			//substituting values
			pstmt.setInt(3, id);
			pstmt.setString(2, city);
			pstmt.setString(1, name);
			
			int count=pstmt.executeUpdate();
			System.out.println(count + " record updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	//this methods accepts ID and delete that particular record
	@Override
	public void deleteOne(Integer studentId) {
		String Query = "Delete from students where student_id =?";
	
		try(
				Connection dbConnection=JdbcUtils.getConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(Query);
			){
			pstmt.setInt(1, studentId);
			int count =pstmt.executeUpdate();
			if(count !=0)
				System.out.println(count +" Record Deleted");
			else
				System.out.println("Student not found");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}




















