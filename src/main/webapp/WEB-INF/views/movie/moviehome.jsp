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
  width: 50%;
}
a:hover{
color:white;
}

th, td {
  text-align: center;
  padding: 8px;
  font-size:20px;
  border-bottom: 1px solid #ddd;

}

tr td:nth-child(1n+2)
{padding-left:35px;
}


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
.button1 {
  background-color: #99bbff;
  border: none;
  color: black;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
  margin: 4px 2px;
  cursor: pointer;

}

.button2 {
  background-color: #b9bdc6;
  border: none;
  color: black;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
  margin: 4px 2px;
  cursor: pointer;
}

.button3{
 background-color: #99bbff;
 size="25%";
  border: none;
  color: black;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  font-size: 20px;
  margin:auto;
  display:block;
  width:155px;
}
</style>




<meta charset="ISO-8859-1">
<title>BookYourShow</title>
</head>
<body>
<input type="button" value="Go Back" onclick="location.href='/'">
<h3 align="center">MOVIES LIST</h3>
<br/>
<br/>
<div>

<a href="${pageContext.request.contextPath}/movie/moviedetails" class="button3" >Add Movie Details</a><br>

</div>
<br/>
<br/>
<br/>
<table align="center" >
	<tr>
	<th style="background-color: #1f7a1f;">Movie Name</th>
	<th style="background-color: #1f7a1f;">Action</th>
	</tr>
	<c:forEach var="movie" items="${movies}">
	<tr>
	<td>${movie.name}

	<td>
<a href="${pageContext.request.contextPath}/movie/castdetails/${movie.id}"class="button1" >Add cast</a>
		<a href="${pageContext.request.contextPath}/movie/delete/${movie.id}"class="button2" onClick="return confirm('Are you sure?')">Delete</a>

	</td>


	</tr>
	</c:forEach>
</table>


</body>
</html>