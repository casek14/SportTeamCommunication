<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>LIST OF TEAMS WHICH USER --! ${member.email} !-- CAN MANAGE</h1>
<table style="border: 1px solid black">
<tr style="border: 1px solid black">
<th style="border: 1px solid black">Team name</th>
<th style="border: 1px solid black">Team description</th>
<th style="border: 1px solid black"></th>
</tr>
<c:forEach var="team" items="${teams}" >
<tr style="border: 1px solid black">
<td style="border: 1px solid black">
<a href="${pageContext.request.contextPath }/team/detail/${team.team_id}">
<c:out value="${team.name }"></c:out>
</a>
</td>
<td style="border: 1px solid black"><c:out value="${team.description }"></c:out></td>
<td style="border: 1px solid black">
<a href="${pageContext.request.contextPath }/team/manage/${team.team_id}">edit</a>
</td>

</tr>


</c:forEach>
<tr></tr>
<tr></tr><tr></tr>
</table>

</body>
</html>