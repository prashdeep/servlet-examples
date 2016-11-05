<%@ page isErrorPage="true"%>
<html>
<head>
<title>Error Page</title>
</head>
<body>
	<h1>There is some error.</h1>
	<%
		if (exception instanceof RuntimeException) {
	%>
	<h2>Invalid input: Please pass in some valid input</h2>
	<%
		} else {
	%>
	<h2>Seems like the application is down. Please comeback after some
		time..</h2>
	<%
		}
	%>
</body>
</html>