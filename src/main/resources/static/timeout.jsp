    <%@ page import="java.io.PrintWriter" %>
    <%@ page import="java.io.IOException" %>
    <%@ page import="java.util.concurrent.TimeUnit" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <title>Delayed HTML Page</title>
    </head>
    <body>

    <%
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.println("<h2>This page loaded after a 10-second delay</h2>");
    %>

    </body>
    </html>