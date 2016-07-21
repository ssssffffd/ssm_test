<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
<h2>登录</h2>

<%-- ***/jsp/login --%>
<form action="login" method="post">
    <font color="red"><%=(request.getAttribute("error")==null?"":request.getAttribute("error"))%></font><br/>

    name <input type="text" id="username" name="username"/><br/><br/>
    pw   <input type="password" id="password" name="password"/><br/><br/>
    <input type="submit" value="登录" id="login" />

</form>

</body>
</html>
