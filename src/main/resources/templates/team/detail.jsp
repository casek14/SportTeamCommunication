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

<h1>${team.name }</h1>
Popis
<p>${team.description}</p>

<c:out value="${admin}"></c:out>
<br />
<c:if test="${admin == true}">
<a href="${pageContext.request.contextPath }/team/manage/${team.team_id } ">Manage Team</a>
<a href="${pageContext.request.contextPath }/event/create">Create Event</a>
</c:if>
<br />
SEZNAM EVENTU:
<br />
<c:forEach var="event" items="${team.events }">
<a href="/event/list/${event.event_id }">${event.name } v case: ${event.date }</a>
<br />
</c:forEach>
</body>
</html>