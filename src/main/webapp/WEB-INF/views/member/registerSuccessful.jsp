<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Creation of user successful !!!</h1>

Jmeno je: ${member.firstName }           <br />
Prijmeni je: ${member.lastName }           <br />
Email je: ${member.email }           <br />
Datum narozeni je: ${member.dateOfBirth }           <br />
Telefoni cislo je: ${member.phoneNumber }           <br />
Heslo je: ${member.password }           <br />
Oblibene sporty jsou: ${member.favouriteSports }           <br />

Adresa je: Ulice ${member.address.street } - ${member.address.cp }   <br />

Mesto je: ${member.address.city } - PSC: ${member.address.postCode }
</body>
</html>