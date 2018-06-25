<%-- 
    Document   : nume
    Created on : Dec 8, 2017, 7:53:42 PM
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
        <form action="hello" method="post">
            <input type="text" name="nume" />
            <input type="submit" name="submit" value="Say hello" />
        </form>
        <br />
        ${mesaj}
    </body>
</html>
