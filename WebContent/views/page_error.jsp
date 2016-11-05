<%@ page errorPage="customErrorPage.jsp"%>
<html>
<head>
<title>Jsp page to display error page scenario</title>
</head>
<body>
<%
  int a = Integer.parseInt(request.getParameter("a"));
  int b = Integer.parseInt(request.getParameter("b"));
   out.println("The value of division is "+a/b);
%>   
</body>
</html>