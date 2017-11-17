<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login Successful:</h1>
Member: <c:out value="${sessionScope.member.email}" /> <br />
Password: <c:out value="${sessionScope.member.password}" />

<br /> <br />

 <a href="${ pageContext.request.contextPath }/member/logout">LOGOUT</a>
 
 <br /> <br />
 
  <a href="${ pageContext.request.contextPath }/team/register">CREATE TEAM</a>
  <br /> <br />
  <a href="${pageContext.request.contextPath }/team/list/admin" >Tymy ktere muzu spravovat</a>
</body>
</html>