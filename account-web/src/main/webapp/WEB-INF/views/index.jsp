<%--
  Created by IntelliJ IDEA.
  User: zhenglian
  Date: 2017/6/25
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<base href="<%=basePath%>">
<head>
    <title>$Title$</title>
    <link href="app/images/favicon.ico" rel="shortcut icon" type="image/x-icon" />
</head>
<body>
$END$
</body>
</html>
