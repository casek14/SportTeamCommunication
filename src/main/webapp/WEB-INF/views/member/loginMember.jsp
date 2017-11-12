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

<div align="center">
<h1>Login Member</h1>

 <table>
  <s:form  commandName="memberData"
  action="${pageContext.request.contextPath }/member/login" method="post">
  
  <tr>
  <td>E-mail:</td>
  <td><s:input path="email"/></td>
  <td><s:errors path="email" cssStyle="color:red;" /></td>
  </tr>
  
  <tr>
  <td>Password:</td>
  <td><s:input path="password"/></td>
  <td><s:errors path="password" cssStyle="color:red;" /></td>
  </tr>

  <td></td>
  <td><input type="submit" value="Register"/></td>
  
  </s:form>
  
 
  
  </table>



</div>

</body>
</html>