package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataRetrivalMain {

	public static void main(String[] args) {
		// Program to retrieve data from database using select query and display it
		
		//step 1: load the driver
		String driverClass="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverClass);
			System.out.println("Driver lodaed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Step 2: Establish connection
		String connectionurl="jdbc:mysql://localhost:3306/cdac?useSSL=false";
		String userId="om";
		String password="13323";
		//Step 2
		Connection dbConnection=null;
		//Step 3
		Statement stmt=null;
		//Step 5 : Obtain ResultSet
		ResultSet rs=null;
		try {
			//Step 2:Establish Connection
			dbConnection= DriverManager.getConnection(connectionurl,userId,password);
			System.out.println("Connected to Database");
			
			//Step 3: Obtain some STatement
			stmt=dbConnection.createStatement() ;
			
			//Step 4: Execute SQL Query
			String query="Select student_name,student_city,student_id from students";
			
			//Step 5
			rs=stmt.executeQuery(query);
			
			//Step 5: Perform navigation on ResultSet
			System.out.println("Id\tName\tCity");
			while(rs.next()) {
				String name=rs.getString(1);//Name
				String city=rs.getString(2);//City
				int id=rs.getInt(3);//Id
				System.out.println(id+"\t"+name+"\t"+city);
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				dbConnection.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
