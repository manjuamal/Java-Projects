<%-- 
    Document   : vote
    Created on : Oct 26, 2018, 4:05:41 PM
    Author     : Manjuvijay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ElectionBean.CandidateInfo" %>
<%@page import="java.util.ArrayList"%>
<%--This page displays candidate information that allow the user to cast vote for a candidate--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Election </title>
    </head>
    <body align="center">
        
         <h1>Choose any one of the Candidates</h1>
        <%
            String [] fname = new String[10];
            String [] lname = new String[10];
            int [] canid = new int[10];
            int i=0;
        ArrayList<CandidateInfo> vote =  (ArrayList<CandidateInfo>) request.getAttribute("vote") ;
        
       for(CandidateInfo cad : vote)
       {
       fname[i] =cad.getFirstName();
       lname[i] = cad.getLastName();
       canid[i] =cad.getCandid();
       i++;
               }
       %>
<form method="POST" action="ElectionServlet.do">
<input type="radio" name="candidate" value="<%= canid[0]%>" checked> <%= fname[0]%> <%= lname[0]%><br>
<input type="radio" name="candidate" value="<%= canid[1]%>" ><%= fname[1]%> <%= lname[1]%><br>
<input type="radio" name="candidate" value="<%= canid[2]%>" ><%= fname[2] %> <%= lname[2]%><br>
<input type="radio" name="candidate" value="<%= canid[3]%>" ><%= fname[3]%> <%= lname[3] %>  <br>
<input type="Submit" value="Caste Ballot">
<br>
<a href="index.html">Back Home</a>
</form>
</body>
</html>
