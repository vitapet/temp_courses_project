<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<header>
    <jsp:include page="../res/menu.jsp"/>
</header>
<a href="${pageContext.request.contextPath}/root">Return</a><br>
<c:if test="${not empty message}">
    <p><c:out value="${message}"/></p>
    <c:remove var="message" scope="session"/>
</c:if>
<br>
<p>Пользователи</p>
<form action="${pageContext.request.contextPath}/root/users" method="post">
    <c:forEach items="${users}" var="userObj">
        <input type="radio" name="id" value="${userObj.id}">
        <label>Логин:&nbsp;</label><c:out value="${userObj.login}"/><br>
        <label>Роль:&nbsp;</label><c:out value="${userObj.role}"/><br>
        <label>Статус:&nbsp;</label><c:out value="${userObj.status}"/><br>
        <a href="${pageContext.request.contextPath}/root/users/update?id=${userObj.id}">Изменить</a><br>
    </c:forEach>
    <button type="submit">Delete</button>
</form>
</body>
</html>
