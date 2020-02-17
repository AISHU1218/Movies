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
#movies
{
  margin-left:23px;
}
.cast
{
margin-right:25px;
}
#desc
{
  margin-left:45px;
}
.h2{
align:"center":
}
#descs
{
   margin-left:13px;
}

</style>

<meta charset="ISO-8859-1">
<title>Movie Detail</title>
</head>
<body>
<h2 align="center"> Enter movie details</h2>

    <br/>
    <div align="center">
    <s:form  method="POST" modelAttribute="movie" action="${pageContext.request.contextPath}/movie/moviedetails">
    <label class="cast">Movie Name</label><input type="text" name="name" class="movie">
    <br/>
    <br/>

   <label class="cast">Language</label><input type="text" name="language" id="movies">
    <br/>
    <br/>
   <label class="cast">Genre</label><input type="text" name="genre" id="desc">
    <br/>
    <br/>
    <label class="cast">Description</label><input type="text" name="description" id="descs">
    <br/>
    <br/>
    <label class="cast">Rating</label><input type="text" name="rating" id="desc">
    <br/>
    <br/>
    <label class="cast">Review</label><input type="text" name="review" id="desc">
     <br/>
    <br/>
      <label class="cast">Release Date</label><input type="text" name="dateOfRelease">
     <br/>
    <br/>

      <input type="submit" value="Save">
      <input type="button" value="Go Back" onclick="location.href='/movie/moviehome'">


    </s:form>
      </div>
</body>
</html>