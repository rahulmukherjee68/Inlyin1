<%@page import="com.proj.models.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>INSIDE INLYIN</title>
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
      <li><a href="BuyerAfterLoginPage.jsp"><font size="2">BUYER'S HOME</font></a></li>
       <li class="active"><a href="BuyerSearchProperty.jsp"><font size="2">SEARCH A PROPERTY</font></a></li>
      <li><a href="DeleteProperty"><font size="2">SHOW PROPERTY STATUS</font></a></li>
            <li><a href="BuyerUpdateDetails.jsp"><font size="2">UPDATE PERSONAL DETAILS</font></a></li>
      <li><a href="HomePage.jsp"><font size="2">LOGOUT</font></a></li>
    </ul>
  </div>
</nav>

<div class="container" style="background-color: Bisque">

<% List<PropertyDetails> userlist=(List<PropertyDetails>)request.getAttribute("ulist");%>
	<div align="center">
	<h2><font color="white">PROPERTY OUTCOMES</font></h2>
	<table border=1  class="table table-hover table-bordered">
		<tr>
		<th>PROPERTY ID</th>
		<th>SELLER EMAIL</th>
		<th>PROPERTY STATE</th>
		<th>PROPERTY TYPE</th>
		<th>PROPERTY PRICE</th>
		<th>PROPERTY ADDRESS</th>
		</tr>
		
			<%
			for(PropertyDetails uobj:userlist)
			{
			%>
			<tr>
				<td><%=uobj.getPropertyid() %></td>
				<td><%=uobj.getSelleremail() %></td>
				<td><%=uobj.getPropertystate() %></td>
				<td><%=uobj.getPropertytype() %></td>
				<td><%=uobj.getPropertyprice() %></td>
				<td><%=uobj.getPropertyaddress() %></td>
				<td><a href="BuyerRequestPropertyUpdate?propertyid=<%=uobj.getPropertyid()%>"><button type="button" class="btn btn-success">APPLY</button></a></td>
			</tr>
			<%
			}
			%>	
		
	
	</table>
</div>
</body>
</html>