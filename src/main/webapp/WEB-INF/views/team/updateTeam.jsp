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
  <h1>Update Team</h1>
   ${id}
  <table>
  <s:form  commandName="teamData"
  action="${pageContext.request.contextPath }/team/manage/${id}" method="post">
   <input id="team_id" name="team_id" path="team_id" type="hidden" value="${id }"/>
  
  <tr>
  <td>Nazev tymu:</td>
  <td><s:input path="name"/></td>
  <td><s:errors path="name" cssStyle="color:red;" /></td>
  </tr>
  
  <tr>
  <td>Popis tymu:</td>
  <td><s:input path="description"/></td>
  <td><s:errors path="description" cssStyle="color:red;" /></td>
  </tr>
    
  <td></td>
  <td><input type="submit" value="Update"/></td>
  
  </s:form>
  
  
  
  </table>


</div>




</body>
</html>