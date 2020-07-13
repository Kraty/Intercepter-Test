<%--
  Created by IntelliJ IDEA.
  User: 14576
  Date: 2020/7/13
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
${msg}
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<label>
    <input type="text" name="username">
</label><br/>
    密&nbsp;&nbsp;&nbsp;码:<label>
    <input type="text" name="password">
</label><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>
