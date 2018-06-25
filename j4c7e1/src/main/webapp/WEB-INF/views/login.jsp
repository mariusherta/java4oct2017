<%-- 
    Document   : login
    Created on : Dec 8, 2017, 8:08:34 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login:</h1>
        
        <form method="post">
            <p>USERNAME: <input type="text" name="username" /></p>
            <p>PASSWORD: <input type="password" name="password" /></p>
            <p><input type="submit" value="Login" /></p>
        </form>
        
        <p>${mesaj}</p>
</html>
