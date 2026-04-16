<%@ page pageEncoding="UTF-8" %>

<%
    String message = (String) request.getAttribute("message");
    java.util.Date currentDate = (java.util.Date) request.getAttribute("currentDate");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Главная страница</title>
    </head>
    <body>
        <h1>Информация из контекста запроса:</h1>
        <hr>
        <p>
            Сообщение из сервлета:
            <%= message %>
        </p>
        <hr>
        <p>
            Текущая дата:
            <%= currentDate %>
        </p>
    </body>
</html>