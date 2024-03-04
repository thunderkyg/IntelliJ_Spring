<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%!
String str1 = "JSP";
String str2 = "안녕하세요";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HelloJSP</title>
</head>
<body>
<h2>처음 만들어보는 <%= str1 %></h2>
<p>
    <%
        System.out.println(str2 + str1 + "입니다.");
    %>
</p>
</body>
</html>