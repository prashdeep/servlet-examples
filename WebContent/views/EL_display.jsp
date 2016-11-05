<html>
<head>
<title>Demonstrating Expression language</title>
</head>
<body>
<%
  String name = request.getParameter("name");
  String rollNo = request.getParameter("rollno");
  if (name != null && !name.trim().equalsIgnoreCase("")){
	  out.println(" Hello "+name);
  }
%>
   
 Student name is ${ param.name } <br>
 Student Roll No is ${ param.rollno }
</body>
</html>