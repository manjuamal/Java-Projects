<%-- 
    Document   : index.jsp
    Created on : Oct 30, 2018, 10:46:54 AM
    Author     : Manjuvijay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ElectionBean.CandidateInfo" %>
<!DOCTYPE html>
<%--This page displays message once the user cast his 
vote for the candidate if the voting was successful also allows to vote and view the election results--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Election</title>
    </head>
    <body align="center">
        
        <h1>Welcome To Municipal Election</h1>
        <h2>What do you want to do ?</h2>
        <form method="GET" action="ElectionServlet.do">
            <input type="Submit" value="Vote">
            </form>
         <form method="GET" action="ElectionResult.do">
            <input type="Submit" value="Election Results">
            </form>
       <h2><font color="blue"> <%= request.getAttribute("out")%></blue></h2>
    </body>
</html>
