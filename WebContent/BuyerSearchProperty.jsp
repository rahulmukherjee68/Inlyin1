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
      <li><a href="BuyerPropertyConfirmationStatus"><font size="2">SHOW PROPERTY STATUS</font></a></li>
      <li><a href="BuyerUpdateDetails.jsp"><font size="2">UPDATE PERSONAL DETAILS</font></a></li>
      <li><a href="HomePage.jsp"><font size="2">LOGOUT</font></a></li>
    </ul>
  </div>
</nav>



<%! BuyerDetails buyobj;   %>
  
  
   <%
 buyobj =(BuyerDetails)session.getAttribute("buyerinfo"); 
   %>
   
   <h2 align="center"><font color="bisque" >WELCOME  &nbsp;&nbsp;<b> <%=buyobj.getBuyname().toUpperCase()%></b></font></h2>



<div class="container" ALIGN="center">
  <h3>INLYINE SEARCH</h3><BR>
  <BR>
  <form action="BuyerSearchProperty" class="form-inline" method="post">
  <label for="type"><b>LOCATION:</b></label>
  <select name="propertystate" class="form-control">
					<option>KOLKATA</option>
					<option>MUMBAI</option>
					<option>DELHI</option>
					<option>HYDERABAD</option>
					<option>PUNE</option>
					<option>CHENNAI</option>
			</select>
			<br>
			<br>
 <label for="type"><b>RESIDENCE TYPE:</b></label>
  <select name="propertytype" class="form-control">
					<option>FLAT</option>
					<option>LAND</option>
					<option>BUNGLOW</option>
					<option>HOUSE</option>
			</select>			
<br>
<br>
<div class="form-group" >
      <label for="email">MAXIMUM PROPERTY PRICE:</label>
      <input type="text" class="form-control" placeholder="Enter price" name="propertyprice">LAKHS
    </div>
			<BR>
			<BR>
			<BR>
		<button type="submit" class="btn btn-default">SUBMIT</button>
			
			</form>
			
			
<div style="color: red;font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("errormsg") != null)
    	      out.print(request.getAttribute("errormsg"));
       %>
     </div>
			
</div>
</body>
</html>
