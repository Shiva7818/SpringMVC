<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is index.jsp file</h1>
<h1>Fired by controller</h1>
<%
String name = (String)request.getAttribute("name");
Integer id = (Integer)request.getAttribute("id");
List<String> friends = (List<String>) request.getAttribute("f");
%>
<h1>Name is <%=name%></br><br>
    Id = <%=id%></br><br>
    Friends = <%=friends%></h1>
</body>
</html>