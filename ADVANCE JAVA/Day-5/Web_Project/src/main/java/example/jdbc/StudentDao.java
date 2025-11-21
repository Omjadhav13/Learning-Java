package example.jdbc;

import java.sql.Connection;
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
		Collection <Student> allStudent = new ArrayList<Student>();
//		this method retrieves all the records from students Table 
//		class converts them into java object of student class and returns all those
		String sqlQuery = "select name, city, id from students";
		try(
				Connection dbConnection = JdbcUtils.getConnection();
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery)
				
				)
		{
			//perform navigation of the result set.
			while (rs.next())
			{
				String name = rs.getString(1);
				String city = rs.getString(2);
				int id = rs.getInt(3);
				//creating an object of student
				
				
				Student studObj = new Student(id,name,city);
				//adding student obj in allStudents  in collections.
				allStudent.add(studObj);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
		return allStudent;
	}

	@Override
	public Student getOne(Integer studentId) {
		// Accepts an integer value indicating student ID and 
		//returns the student obj matching with that ID
		//IF id is non existing it returns null.
		Student foundStudent = null;
		String sqlQuery = "SELECT id, name, city FROM students WHERE id = ?";
		try(	
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				
				
			)
		{
			pstmt.setInt(1, studentId);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				int id = rs.getInt(1);//id
				String name = rs.getString(2);//Name
				String city = rs.getString(3);//city
				
				foundStudent = new Student(id, name, city);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return foundStudent;
	}

	@Override
	public void create(Student studentObj) {
		
		Student foundStudent = null;
		String sqlQuery = "insert into students values(?,?,?)";
		
		try(	
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				
				
			)
		{
//			fetching values
			int id = studentObj.getStudentId();
			String name = studentObj.getName();
			String city = studentObj.getCity();
			
			//substituting these values in placeholder
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, city);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " record inserted");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	//updating the obj values in database.
	@Override
	public void update(Student modifiedStudentObj) {
		//receives modified state of student obj and reflects it back to db
		String sqlQuery = 
				"update students set student_name = ?, student_city = ? where student_id = ? ";
		try(	
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				
				
			)
		{
//			fetching values
			int id = modifiedStudentObj.getStudentId();
			String name = modifiedStudentObj.getName();
			String city = modifiedStudentObj.getCity();
			
			   // substituting values in correct order
	        pstmt.setString(1, name);   // student_name
	        pstmt.setString(2, city);   // student_city
	        pstmt.setInt(3, id);        // student_id in WHERE clause
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " record updated");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteOne(Integer studentId) {
		// accepts id of students and delete the relevant record.
		String sqlQuery = 
				"delete from students where student_id = ? ";
		try(	
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				
				
			)
		{

			pstmt.setInt(1, studentId);
			int count = pstmt.executeUpdate();
			if(count != 0)
			{
				System.out.println(count + "record deleted.");
			}
			else
			{
				System.out.println("Student with given id does not exist");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}	
}