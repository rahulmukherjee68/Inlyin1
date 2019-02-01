<%@page import="com.proj.models.*"%>
<%@page import="java.util.*"%>
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
      <a class="navbar-brand" href="HomePage.jsp"><font size="100">INLYIN</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="AdminAfterLogin.jsp"><font size="5">ADMIN HOME</font></a></li>
      <li><a href="ManageBuyer"><font size="5">MANAGE BUYERS</font></a></li>
       <li class="active"><a href="ManageSeller"><font size="5">MANAGE SELLERS</font></a></li>
      <li><a href="ManageProperty"><font size="5">MANAGE PROPERTY</font></a></li>
      <li><a href="AdminIncome"><font size="5">INLYIN INCOME</font></a></li>
      <li><a href="HomePage.jsp"><font size="5">LOGOUT</font></a></li>
    </ul>
  </div>
</nav>


<h2 align="center"><font color="red">NO SELLERS ARE PRESENT</font></h2>
</body>
</html>