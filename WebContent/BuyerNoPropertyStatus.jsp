<%@page import="com.proj.models.*"%>
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
      <li class="active"><a href="SellerAfterLoginPage.jsp"><font size="2">BUYER'S HOME</font></a></li>
       <li><a href="BuyerSearchProperty.jsp"><font size="2">SEARCH A PROPERTY</font></a></li>
      <li class="active"><a href="BuyerPropertyConfirmationStatus"><font size="2">SHOW PROPERTY STATUS</font></a></li>
      <li><a href="BuyerUpdateDetails.jsp"><font size="2">UPDATE PERSONAL DETAILS</font></a></li>
      <li><a href="HomePage.jsp"><font size="2">LOGOUT</font></a></li>
    </ul>
  </div>
</nav>
<h2><font color="red">YOU HAVE NOT APPLIED FOR ANY PROPERTY</font></h2>
</body>
</html>