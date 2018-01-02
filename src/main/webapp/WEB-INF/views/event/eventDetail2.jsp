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
<h1>Event: ${event.name} v ${event.time} - ${event.date}</h1>

<p align="center">
${event.description }
</p>

<h2><a href="${pageContext.request.contextPath }/event/attend/${event.event_id}" >Prihlasit se na udalost</a></h2>

Seznam prihlasenych sportovcu na danou udalost:
<ul>
	<c:forEach var="member" items="${event.loggedUsers }">
		<li>
			${member.firstName } ${member.lastName }  
		</li>
	</c:forEach>

</ul>

</body>
</html>