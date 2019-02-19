<%--
  Created by IntelliJ IDEA.
  User: Sicarius
  Date: 2/19/2019
  Time: 3:47 PM
--%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>NASS Engine</title>
</head>
<body>
<h3> NASS Engine </h3>
<form method="get">
    <input type="text" name = "query" /> <br>
    <input type="radio" name ="searchType" value = "And" checked>And <br>
    <input type="radio" name ="searchType" value = "Or" >Or <br>
    <input type="radio" name ="searchType" value = "Not">Not <br>
    <input type="submit" value="Search">

</form>

<%
    String queryAsString = request.getParameter("query");

    if(queryAsString != null)
    { %>
<h3> Searching for:</h3>
<ul>
    <li><%= queryAsString %> </li>

    <br> No Results Found
</ul>
<%
    } %>


</body>
</html>>
