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
  width: 30%;
}
a:hover{
color:red;
}

th, td {
  text-align: center;
  padding: 8px;
 

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
  align:center;
}
.button {
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
.dropbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
  size:20%;
  padding: 14px 70px;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
  padding: 14px 70px;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  padding: 14px 70px;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
  display: block;
}

.dropdown:hover .dropbtn {
  background-color: #3e8e41;
}
.s{
align:left;
}
</style>




<meta charset="ISO-8859-1">
<title>BookYourShow</title>
</head>
<body>
<div class="dropdown">
  <button class="dropbtn">Filter</button>
  <div class="dropdown-content">
 
  	<div class="dropdown"></div>
   	  <button class="dropbtn">Language</button>
  	 <div class="dropdown-content">
 	 <a href="/movies/filterbylanguage/Tamil">Tamil</a>
  	 <a href="/movies/filterbylanguage/Hindi">Hindi</a>
 	 
 	 
   	  <button class="dropbtn">Genre</button>
  	 <div class="dropdown-content">
 	 <a href="/movies/filterbygenre/action">Action</a>
  	 <a href="/movies/filterbygenre/romantic">Romantic</a>
  	 
  	 <button class="dropbtn">Reset</button>
  	 <div class="dropdown-content">
 	 <a href="/">Reset</a>
  	 
 	 </div>
	</div>
	</div>
	</div>
	</div>
	
<div class="s">
<h3 align="center">MOVIES LIST</h3>
<a href="https://192.168.39.33:1996" class="button3" >Select Shows</a>   <br/>
<a href="${pageContext.request.contextPath}/movie/moviehome" class="button3" >Admin</a><br>

</div>
<br/>
<br/>
<br/>
<table align="center" >
	<tr>
	<th style="background-color: #1f7a1f;">Movie Name</th>
	
	</tr>
	<c:forEach var="movie" items="${movies}">
	<tr>
	<td><a href="<c:url value="/movies/search/${movie.name}/${movie.id}"/>" style="color:black;font-size:20px;">${movie.name}</a>


	</td>


	</tr>
	</c:forEach>
</table>


</body>
</html>