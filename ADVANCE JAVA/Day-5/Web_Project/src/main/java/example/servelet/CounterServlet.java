package example.servelet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/doCount")
public class CounterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		//Obtaining a session for the current client(User)
		HttpSession session = request.getSession();
		
		int count=0;
		//Checking whether the session is newly created or not
		if(session.isNew()) {
			count=1;
		}else {
			//Obtaining previous count value from existing session
			Object obj=session.getAttribute("CurrentCount");
			Integer previousCount =(Integer) obj;
			
			//Incrementing the count by 1 and storing it into session
			count =previousCount+1;
		}
		//Attaching the count to the session
		session.setAttribute("CurrentCount", count);
		
		//Displaying the count using the response 
		out.println("<h2>Hit Count: "+ count + "</h2>");
		
		//Redirecting control to html page
		RequestDispatcher dispatcher=request.getRequestDispatcher("Counter.html");
		dispatcher.include(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
