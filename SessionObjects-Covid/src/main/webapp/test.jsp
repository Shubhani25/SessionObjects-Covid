<%@page import="java.util.Enumeration"%>
<%
	Enumeration<String> en = session.getAttributeNames();
	while(en.hasMoreElements()){
		String name = en.nextElement();
		
		out.println(name+"<==>"+session.getAttribute(name) +"<br>");
				
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>