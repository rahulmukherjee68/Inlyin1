<%@page import="com.proj.models.*"%>
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
       <li><a href="BuyerSearchProperty.jsp"><font size="2">SEARCH A PROPERTY</font></a></li>
      <li><a href="BuyerPropertyConfirmationStatus"><font size="2">SHOW PROPERTY STATUS</font></a></li>
      <li class="active"><a href="BuyerUpdateDetails.jsp"><font size="2">UPDATE PERSONAL DETAILS</font></a></li>
      <li><a href="HomePage.jsp"><font size="2">LOGOUT</font></a></li>
    </ul>
  </div>
</nav>



<%! BuyerDetails buyerobj;   %>
  
  
   <%
 buyerobj =(BuyerDetails)session.getAttribute("buyerinfo"); 
   %>

<div  class="container"align="center">
  <form class="form-inline" action="BuyerUpdateDetails" method="get">
 	
 	<div class="form-group" >
      <label for="email">NAME:</label>
      <input type="text" class="form-control" placeholder="Enter name" name="buyname">
    </div>
     <br>
    <br>
    <div class="form-group">
      <label for="email">EMAIL:</label>
      <input type="email" class="form-control" name="buyemail" value="<%=buyerobj.getBuyemail()%>" readonly="readonly" required>
    </div>
    <br>
    <br>
    
      <div class="form-group">
      <label for="email">ADDRESS:</label>
      <input type="text" class="form-control"  placeholder="Enter address" name="buyaddress">
    </div>
    <br>
    <br>
    
    
     <div class="form-group">
      <label for="email">MOBILE:</label>
      <input type="number" class="form-control"  placeholder="Enter mobile" name="buymob">
    </div>
    <br>
    <br>
    
    
    <div class="form-group">
      <label for="pwd">SET PASSWORD:</label>
      <input type="password" class="form-control" placeholder="Enter password" name="buypass">
    </div>
	<br>
	<br>`
    <button type="submit" class="btn btn-default">SUBMIT</button>
  </form>
  
  <div style="color: red;font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("recordinserted") != null)
    	      out.print(request.getAttribute("recordinserted"));
       %>
     </div>
  </div>
  



</body>
</html>

