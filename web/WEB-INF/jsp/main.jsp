<%--
  Created by IntelliJ IDEA.
  User: 14576
  Date: 2020/7/13
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>系统主页</title>
</head>
<body>
当前用户：${User_Session.username}
<a href="${pageContext.request.contextPath}/logout">退出</a>
</body>
</html>
