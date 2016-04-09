<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach var="number" begin="1" end="10">
<c:out value="${number}"></c:out>
</c:forEach>

<c:set var="x"  value="25"></c:set>

<c:if test="${x == 25}" >
  Hi
</c:if>


