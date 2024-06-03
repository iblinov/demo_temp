<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1> "Hello World!"
</h1>
<!--
<form action="hello-servlet" method="get">
-->
    <form action="login.do" method="get">
    Login <br/>
        <!--
           <input type="hidden" name="command" value="login">
       -->
           <br/>
           <input type="text" name="login"/>
           <br/>
           Password
           <br/>
           <input type="password" name="pass"/>
           <br/>
           <input type="submit" name="Submit" value="Login"/>
       </form>
       <br/>

       </body>
       </html>