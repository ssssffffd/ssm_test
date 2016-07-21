<%@page import="com.aaa.bbb.entity.User"%>
<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>

<html>
<body>

<%User user=(User)request.getAttribute("user");%>

<h2>你好， <%=user.getUsername()%> ！</h2>

<a href="/index.jsp">退出</a>

</body>
</html>
