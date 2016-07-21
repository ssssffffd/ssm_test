<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
<h2>注册</h2>

<%-- ***/jsp/register --%>
<form action="register" method="post">
  <font color="red"><%=(request.getAttribute("error")==null?"":request.getAttribute("error"))%></font><br/>

  name <input type="text" id="username" name="username"/><br/><br/>
  pw   <input type="password" id="password" name="passwor  d"/><br/><br/>
  <input type="submit" value="注册" />

</form>

</body>
</html>
