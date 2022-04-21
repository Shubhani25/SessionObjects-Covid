<%@page import="java.util.Date"%>
<%
String uid = (String) session.getAttribute("userid");
if(uid==null){
	response.sendRedirect("index.jsp");
}

long val = session.getCreationTime();
Date dt = new Date(val);
out.println("Session was created at: "+dt);
out.println("<br>");
int n = session.getMaxInactiveInterval();
out.println("Session will expire in "+n+" seconds");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<h3>Dashboard</h3>
	<hr>
	<pre>
	<a href="ActiveCaseServlet">Active cases</a>
	<a href="RecoveredCaseServlet">Recovered Cases</a>
	<a href="TotalDeathServlet">Total-Deaths</a>
	<a href="index.jsp">Logout</a>
	<hr>
	</pre>
</body>
</html>