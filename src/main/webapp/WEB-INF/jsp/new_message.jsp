<%--
  Created by IntelliJ IDEA.
  User: Slipeer
  Date: 21.02.2022
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>New Sale</title>
</head>
<body>
<div>
    <form:form action="save" modelAttribute="message">
        <p>Сообщение:</p>
        <p><form:textarea path="message" rows="7" cols="30"/></p>
        <p colspan="2"><input type="submit" value="Отправить"></p>
    </form:form>
</div>
<p> Сообщения ${name}</p>
<table>
    <tr>
        <th>
            id
        </th>
        <th>
            Сообщение
        </th>
    </tr>
    <c:forEach var="emp" items="${allMessage}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.message}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
