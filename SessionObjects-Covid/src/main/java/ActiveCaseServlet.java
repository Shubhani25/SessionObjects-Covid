

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class ActiveCaseServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//reading data from context object 
		//fetch the context object
		ServletContext context = getServletContext();
		//read the data;
		String app = (String) context.getAttribute("AppName");
		
		
		
		//reading the userid from session
		//step1- fetch the session object
		HttpSession session = request.getSession();
		
		//step2- read the data
		String uid = (String) session.getAttribute("userid"); 
		
		if(uid==null) {
			response.sendRedirect("index.jsp");
		}
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>Welcome "+uid+"</h3>");
		out.println("<h3>"+app+"</hr><br>");
		out.println("<h3>Active Cases: 324567</h3>");
		out.println("<h4><a href = dashboard.jsp>dashboard</a></h4>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
