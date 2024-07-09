<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.time.LocalDateTime" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is help page fired by ModelAndView object<br></h1>

<h1>Name = ${name}</h1>
<h1>Roll Number = ${roll_no}</h1>
<h1>Time = ${time}</h1>
<h1>Marks = ${marks}</h1>
<% %>

<%-- 
<% String name = (String)request.getAttribute("name");
   Integer no = (Integer)request.getAttribute("roll_no");
   LocalDateTime  now = (LocalDateTime)request.getAttribute("time");
   %>
  
<h1>Name = <%=name%></h1>
<h1>Roll No. = <%=no%></h1>
<h1>Time = <%=now%></h1> 
--%>

</body>
</html>