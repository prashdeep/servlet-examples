<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
   String username = request.getParameter("username");
   String password = request.getParameter("password");

   if (username.equalsIgnoreCase("pradeep")&& password.equalsIgnoreCase("1234")){%>
	   Welcome: <%= username %>
<% 
	   session.setAttribute("username",username);

   }else{
	   response.sendRedirect("http://www.google.com");
   }
%>
<span style="padding:10px; background-color:red">Today is:<%= java.util.Calendar.getInstance().getTime() %></span>
</body>
</html>


