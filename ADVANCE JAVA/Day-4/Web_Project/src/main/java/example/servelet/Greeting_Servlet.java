package example.servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "my_Greeting_Servlet", urlPatterns = { "/DoGreet" })
public class Greeting_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		System.out.println("Inside init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside destroy()");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//When a request is made to the server ,this doGet() method is invoked 
		//it provides logic for the handling the request.
		
		
		System.out.println("Request received");
		response.setContentType("text/html");//MIMIE : multi-puporse internet mail extension
		String responseText="<h1 style='color:red'> Welcome to servlets</h1>";
		
		PrintWriter out= response.getWriter();
		out.println(responseText);
	}
	
}
	