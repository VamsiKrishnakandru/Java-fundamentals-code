<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP WEB APP</title>
</head>
<body>
<h1>JSP Web App to generate Dynamic Response</h1>

<!-- imports are implicit in JSP -->
<!-- Directive tag - to import other libraries -->
<%@ page import="java.util.Date"
 %>

<!-- Declaration tag - to declare any variables or method -->
<%!
int age = 18;
%>

<!-- scriplet tag - anything written here will be considered as body of service method -->
<!-- behind the scenes this code is converted to servlet -->
<%
/* httpRequest and httpResponse are implicit objects*/
String name = request.getParameter("uname");
String ucity = request.getParameter("ucity");

Date date = new Date();

/* out - JSP reference variable for printWriter 
implicit objects - behind the scenes it will be converted to printWriter */
out.println("Hello " + name);
out.println(" I know you're from " + ucity);
%>

<!-- Expression tag -  -->
<h1><%= date %></h1>
<h2><%= ucity %></h2>

</body>
</html>