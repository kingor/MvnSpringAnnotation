<%-- 
    Document   : actorspage
    Created on : 02.01.2016, 14:47:35
    Author     : asup
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Persons</h1>
 
<c:url var="addUrl" value="/krams/main/persons/add" />
<table style="border: 1px solid; width: 500px; text-align:center">
 <thead style="background:#fcf">
  <tr>
   <th>First Name</th>
   <th>Last Name</th>
   <th>ID</th>
   <th colspan="3"></th>
  </tr>
 </thead>
 <tbody>
 <c:forEach items="${actors}" var="actor">
  
  <tr>
   <td><c:out value="${actor.firstName}" /></td>
   <td><c:out value="${actor.lastName}" /></td>
   <td><c:out value="${actor.actorId}" /></td>
   <td>Edit</td>
   <td>Delete</td>
   <td>Add</td>
  </tr>
 </c:forEach>
 </tbody>
</table>
 
<c:if test="${empty actors}">
 There are currently no persons in the list. a person.
</c:if>
 
</body>
</html>