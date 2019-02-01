<%@page import="com.proj.models.SellerDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>INLYIN</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body background="globsyn images\image1.jpg">

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="HomePage.jsp"><font size="100">INSIDE INLYIN</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="SellerAfterLoginPage.jsp"><font size="2">SELLER'S HOME</font></a></li>
       <li><a href="SellerAddPropertyRegistration.jsp"><font size="2">ADD A PROPERTY</font></a></li>
      <li><a href="DeleteProperty"><font size="2">DELETE YOUR PROPERTY</font></a></li>
      <li><a href="SellerUpdateProperty.jsp"><font size="2">UPDATE PROPERTY DETAILS</font></a></li>
      <li><a href="SellerUpdateDetails.jsp"><font size="2">UPDATE PERSONAL DETAILS</font></a></li>
      <li><a href="SellerPropertyStatus"><font size="2">SHOW PROPERTY STATUS</font></a></li>
      <li><a href="HomePage.jsp"><font size="2">LOGOUT</font></a></li>
    </ul>
  </div>
</nav>

<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
response.setHeader("Expires","0");
%>



<%! SellerDetails sellobj;   %>
  
  
   <%
 sellobj =(SellerDetails)session.getAttribute("sellerinfo"); 
   %>
   
   <h2 align="center"><font color="white" >WELCOME  &nbsp;&nbsp;<b> <%=sellobj.getSellname().toUpperCase()%></b></font></h2>


</body>
</html>