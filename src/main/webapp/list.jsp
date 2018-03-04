<%--
  Created by IntelliJ IDEA.
  User: AaronFae
  Date: 2018/3/5
  Time: 4:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <title>文件列表</title>
</head>
<body>
<div class="container-fluid">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>^-^文件列表Up</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6">
            <table class="table table-condensed">
                <thead>
                <tr>
                    <th>
                        上传者
                    </th>
                    <th>
                        文件列表
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${HomeworkList}" var="homework">
                    <tr>
                        <td>${homework.uper}</td>
                        <td><a href="download?fileName=${homework.filename}">${homework.filename}</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>