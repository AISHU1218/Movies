<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  border-collapse: collapse;
  padding-top:50%;
  width: 100%;
}
a:hover{
color:red;
}

th, td {
  text-align: center;
  padding: 8px;
  border-bottom: 1px solid #ddd;

}

tr td:nth-child(1n+2)
{padding-left:35px;
}
tr:hover {background-color: #f5f5f5;}

th {
  background-color: #4CAF50;
  color: white;
}
table, th, td {

}
input[type=button] {
  width: 10%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input type="button" value="Go Back" onclick="location.href='http://localhost:9008/'">
<h3>Movie List</h3> 
<table border="1">
	<tr>
	<th>Movie Name</th>
	<th>Rating</th>
	<th>Description</th>
	<th>Review</th>
	<th>Language</th>
	<th>Genre</th>
	<th>Release Date</th>
	<th>Cast Name</th>
	<th>Cast Role</th>
	
	</tr>
	<c:forEach var="movie" items="${movies}">
	<tr>
	<td>${movie.name}</td>
	<td>${movie.rating}</td>
	<td>${movie.description}</td>
	<td>${movie.review}</td>
	<td>${movie.language}</td>
	<td>${movie.genre}</td>
	<td>${movie.dateOfRelease}</td>
	</c:forEach>
	<td><c:forEach var="cast" items="${casts}">
	${cast.name} ,<br/>
	</c:forEach></td>
	<td><c:forEach var="cast" items="${casts}">
	${cast.role}<br/>
	</c:forEach>
</td>
	
</table>
</body>
</html>