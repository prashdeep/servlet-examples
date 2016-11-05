<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<% 

String name=request.getParameter("uname");
out.print("Welcome... "+name);

pageContext.setAttribute("user",name,PageContext.PAGE_SCOPE);

%>

</br>

<%-- The comments will not be rendered by the jsp engine..--%>
<!-- This is a HTML comment. -->
<a href="pageContext_ImplicitObject_Second.jsp">Second JSP Page</a>

<h3>Hi, <%= (String)pageContext.getAttribute("user",PageContext.PAGE_SCOPE) %></h3>
</body>
</html>