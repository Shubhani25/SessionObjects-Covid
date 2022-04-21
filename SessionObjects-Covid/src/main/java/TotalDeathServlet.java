

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class TotalDeathServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String uid = (String) session.getAttribute("userid");
		if(uid==null) {
			response.sendRedirect("index.jsp");
		}
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3>Welcome "+uid+"</h3>");
		out.println("<h3>Total Deaths: 654</h3>");
		out.println("<h4><a href = dashboard.jsp>dashboard</a></h4>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
