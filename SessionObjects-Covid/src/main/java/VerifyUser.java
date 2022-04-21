

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class VerifyUser extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//we store the app name to context object
		//fetch the context object
		ServletContext context = getServletContext();
		
		//to store something to this;
		context.setAttribute("AppName", "Information");
		
		
		String id = request.getParameter("t1");
		
		if(id.equalsIgnoreCase("abc") || id.equalsIgnoreCase("qwe") || id.equalsIgnoreCase("rty")) {
			
			//storing the userID to session so that it will be available for other servlets also.
			
			//step1- fetch the session object created for this user:
			HttpSession session = request.getSession();
			
			//step2- store the data to this session object by using a method called setAttribute
			session.setAttribute("userid", id); 
			session.setAttribute("logintime", new java.util.Date());
			
			response.sendRedirect("dashboard.jsp");
		}
		else {
			PrintWriter out= response.getWriter();
			out.println("Invalid account");		
		}
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
