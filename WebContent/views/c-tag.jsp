<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h2>Hi, <c:out value="${param.name}" default="User"/></h2>

<c:forEach var="number" begin="1" end="10">
	<c:out value="${number}"/>
</c:forEach>