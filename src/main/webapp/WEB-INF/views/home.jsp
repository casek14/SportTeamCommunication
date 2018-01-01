<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<html>
<head>
	<title>Home</title>
	 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/member/hovno.css">
</head>
<body>

  <div align="center">
  <h1>TEST</h1>
  
  <table>
    <tr><td><a href="${pageContext.request.contextPath }/member/register">Register member</a></td></tr>
    <tr><td><a href="${pageContext.request.contextPath }/member/login">Login member</a></td></tr>
    <tr><td><a href="${pageContext.request.contextPath }/team/register ">Create team</a></td></tr>
    <tr><td><a href="${pageContext.request.contextPath }/team/list ">List all teams</a></td></tr>
    <tr><td><a href="${pageContext.request.contextPath }/team/list/admin ">List all teams of the logged user</a></td></tr>
  
      <tr><td><a href="${pageContext.request.contextPath }/home/faq ">Lisfdafasfsadft all teams</a></td></tr>
  
  </table>
  
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  </div>

</body>
</html>
