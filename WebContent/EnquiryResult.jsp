<%@page import="com.proj.models.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>INLYIN SEARCH</title>
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
      <a class="navbar-brand" href="#"><font size="100">INLYIN</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="HomePage.jsp"><font size="5">HOME</font></a></li>
      <li><a href="Login.jsp"><font size="5">LOGIN</font></a></li>
	  <li><a href="BuyProperty.jsp"><font size="5">BUY A PROPERTY</font></a></li>
      <li><a href="SellProperty.jsp"><font size="5">SELL A PROPERTY</font></a></li>
      <li class="active"><a href="Enquiry.jsp"><font size="5">ENQUIRY</font></a></li>
      <li><a href="ContactUs.jsp"><font size="5">CONTACT US</font></a></li>
    </ul>
  </div>
</nav>


<br>
<br>
<br>
<br>
<br>

<div class="container" style="background-color: Bisque">


<% List<PropertyDetails> userlist=(List<PropertyDetails>)request.getAttribute("ulist");%>
	<div align="center">
	<h2>SEARCH RESULT </h2>
	<table border=4 class="table table-hover table-bordered">
		<tr>
		<th> &nbsp;&nbsp;PROPERTY ID &nbsp;&nbsp;</th>
		<th> &nbsp;&nbsp;SELLER EMAIL &nbsp;&nbsp;</th>
		<th> &nbsp;&nbsp;PROPERTY STATE &nbsp;&nbsp;</th>
		<th> &nbsp;&nbsp;PROPERTY TYPE &nbsp;&nbsp;</th>
		<th> &nbsp;&nbsp;PROPERTY PRICE &nbsp;&nbsp;</th>
		<th> &nbsp;&nbsp;PROPERTY ADDRESS &nbsp;&nbsp;</th>
		</tr>
		
			<%
			for(PropertyDetails uobj:userlist)
			{
			%>
			<tr>
				<td> &nbsp;&nbsp;<%=uobj.getPropertyid() %> &nbsp;&nbsp;</td>
				<td> &nbsp;&nbsp;<%=uobj.getSelleremail() %> &nbsp;&nbsp;</td>
				<td> &nbsp;&nbsp;<%=uobj.getPropertystate() %> &nbsp;&nbsp;</td>
				<td> &nbsp;&nbsp;<%=uobj.getPropertytype() %> &nbsp;&nbsp;</td>
				<td> &nbsp;&nbsp;<%=uobj.getPropertyprice() %> &nbsp;&nbsp;</td>
				<td> &nbsp;&nbsp;<%=uobj.getPropertyaddress() %> &nbsp;&nbsp;</td>
				<td> &nbsp;&nbsp;<a href="BuyProperty.jsp"><font color="red"><b><button type="button" class="btn btn-success">BUY</button></b></font></a> &nbsp;&nbsp;</td>
			</tr>
			<%
			}
			%>	
		
	
	</table>
</div>
</div>
</body>
</html>