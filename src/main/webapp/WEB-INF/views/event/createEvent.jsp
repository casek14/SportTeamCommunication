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
  <h1>Create Event</h1>
  <table>
  <s:form  commandName="eventData"
  action="${pageContext.request.contextPath }/event/create" method="post">
  
  <tr>
  <td>Nazev udalosti:</td>
  <td><s:input path="name"/></td>
  <td><s:errors path="name" cssStyle="color:red;" /></td>
  </tr>
  
  <tr>
  <td>Popis udalosti:</td>
  <td><s:textarea path="description"/></td>
  <td><s:errors path="description" cssStyle="color:red;" /></td>
  </tr>
  
  <tr>
  <td>Cas konani:</td>
  <td><s:input path="time"/></td>
  <td><s:errors path="time" cssStyle="color:red;" /></td>
  </tr>
  
  <tr>
  <td>Datum konani:</td>
  <td><s:input path="date"/></td>
  <td><s:errors path="date" cssStyle="color:red;" /></td>
  </tr>
  
  
  <td></td>
  <td><input type="submit" value="Create"/></td>
  
  </s:form>  
  </table>

</div>


</body>
</html>