<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>


<style>
input[type=text], select {
  width: 20%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 10%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
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
.movie
{
  margin-left:25px;
}
.cast
{
margin-right:25px;
}
.casts
{
margin-right:20px;
}
.h2{
align:"center":
}

</style>

<meta charset="ISO-8859-1">
<title>Movie Details</title>

</head>
<body>
  <i class="fa fa-home" onclick="location.href='http://localhost:9008/movie'"></i>

   <h2 class="h2" align="center"> Enter cast details</h2>

 	<br/>
    <br/>
    <div align="center">
    <s:form  method="POST" modelAttribute="cast" action="${pageContext.request.contextPath}/movie/castdetails/${id}">
  
    <label class="cast">Movie Id</label><input type="text" name="movieId" class="movie" value=${id}>
    <br/>
    <br/>

   <label class="casts">Cast Name</label><input type="text" name="name" class="movie">
    <br/>
    <br/>
   <label class="cast">Cast Role</label><input type="text" name="role" class="movie">
    <br/>
    <br/>
       
      <input type="submit" value="Save" class="button">
<input type="button" value="Go Back" onclick="location.href='/movie/moviehome'">
    </s:form>
    </div>
</body>
</html>