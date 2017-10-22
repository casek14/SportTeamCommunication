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
  <h1>Register Customer</h1>
  <table>
  <s:form  commandName="memberData"
  action="${pageContext.request.contextPath }/member/register" method="post">
  
  <tr>
  <td>Jmeno:</td>
  <td><s:input path="firstName"/></td>
  <td><s:errors path="firstName" cssStyle="color:red;" /></td>
  </tr>
  
  <tr>
  <td>Prijmeni:</td>
  <td><s:input path="lastName"/></td>
  <td><s:errors path="lastName" cssStyle="color:red;" /></td>
  </tr>
  
  <tr>
  <td>Email:</td>
  <td><s:input path="email"/></td>
  <td><s:errors path="email" cssStyle="color:red;" /></td>
  </tr>

  <tr>
  <td>Datum narozeni:</td>
  <td><s:input path="dateOfBirth"/></td>
  <td><s:errors path="dateOfBirth" cssStyle="color:red;" /></td>
  </tr>
  
  
  <tr>
  <td>Telefoni cislo:</td>
  <td><s:input path="phoneNumber"/></td>
  <td><s:errors path="phoneNumber" cssStyle="color:red;" /></td>
  </tr>
  
  
  
   <tr>
  <td>Oblibene sporty:</td>
  <td><s:input path="favouriteSports"/></td>
  <td><s:errors path="favouriteSports" cssStyle="color:red;" /></td>
  </tr>
  
  
    <tr>
  <td>Password:</td>
  <td><s:input path="password"/></td>
  <td><s:errors path="password" cssStyle="color:red;" /></td>
  </tr>
  
  <tr></tr>
  
  <tr><td style="background-color: orange">Adresa:</td></tr>
    <tr>
    
    <td>Ulice:</td>
  <td><s:input path="Address.street"/></td>
  <td><s:errors path="Address.street" cssStyle="color:red;" /></td>
  </tr>
  
  <td>Cislo popisne:</td>
  <td><s:input path="Address.cp"/></td>
  <td><s:errors path="Address.cp" cssStyle="color:red;" /></td>
  </tr>
    
  <td>Mesto:</td>
  <td><s:input path="Address.city"/></td>
  <td><s:errors path="Address.city" cssStyle="color:red;" /></td>
  </tr>
  
  <td>PSC:</td>
  <td><s:input path="Address.postCode"/></td>
  <td><s:errors path="Address.postCode" cssStyle="color:red;" /></td>
  </tr>
  
  <td></td>
  <td><input type="submit" value="Register"/></td>
  
  </s:form>
  
  
  
  </table>














</body>
</html>