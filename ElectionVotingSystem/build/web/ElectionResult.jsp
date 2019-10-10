
<%-- 
    Document   : ElectionResult
    Created on : Oct 26, 2018, 10:38:29 PM
    Author     : Manjuvijay
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ElectionBean.Election" %>
<%@page import="java.util.ArrayList" %>
<%--This page diaplays the results of the election --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Election Results:</title>
    </head>
    <body>
        <% ArrayList<Election> el = (ArrayList<Election>) request.getAttribute("electionresult"); 
        %>
        <h1>Election Results:</h1>
       <table  style="border:1px solid;">
            <tr>
                <th>Candidate Name</th>
                <th>Number of Votes</th>
                </tr>
                <tr>
                    <% for(Election elec : el)
        {
        %>
         <td><%=elec.getFirstName()%> <%=elec.getLastName()%></td>
                <td align="center" ><%=elec.getCount()%></td>    
                </tr><br>
                <%}
%>
 </table>
<a align="center" href="index.html">Back Home</a>
    </body>
</html>
