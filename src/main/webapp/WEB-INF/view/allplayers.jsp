<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1> List Of Players</h1>
<table class="table table-striped">
  <thead class="thead-dark">
        <tr>
            <th>Jersey Number</th>
            <th>Player Name</th>
            <th>Runs Scored</th>
            <th>Matches Played</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="p" items="${khiladis}">
            <tr>
               <td>${p.jno}</td>
               <td>${p.pname}</td>
               <td>${p.mp}</td>
               <td>${p.rs}</td>
            </tr>
        </c:forEach>
    </tbody>
</table> 
</body>
</html>