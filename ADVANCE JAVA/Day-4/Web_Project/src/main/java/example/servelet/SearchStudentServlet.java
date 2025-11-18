package example.servelet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

import example.jdbc.DaoInterface;
import example.jdbc.Student;
import example.jdbc.Student;
import example.jdbc.*;

/**
 * Servlet implementation class SearchStudentServlet
 */
@WebServlet("/doSearch")
public class SearchStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String student_id = request.getParameter("studentId");
	       int studentId = Integer.parseInt(student_id);
	       //searching stu id agaianst the Id using dao layer
	       DaoInterface<Student, Integer> daoref = new StudentDao();
	       Student foundStudent =  daoref.getOne(studentId);
	       
	       response.setContentType("text/html");
	       PrintWriter out = response.getWriter();
	       RequestDispatcher dispatcher=null;
	       if(foundStudent != null) {
	    	   //send this student to next servlet
	    	   out.println("<h2>Student Found<h2>"); request.setAttribute("currentStudent", foundStudent);
	    	   dispatcher=request.getRequestDispatcher("doDisplay");
	    	   dispatcher.forward(request, response);
	    	   
	       }else {
	    	   out.println("<h2>Student Not Found<h2>");
	    	  // redirect the controlled to serach_student.htm
	    	   dispatcher=request.getRequestDispatcher("searchStudent.html");
	    	   dispatcher.include(request, response);
	       }
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
