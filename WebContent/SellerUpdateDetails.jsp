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
      <li><a href="SellerAfterLoginPage.jsp"><font size="2">SELLER'S HOME</font></a></li>
       <li><a href="SellerAddPropertyRegistration.jsp"><font size="2">ADD A PROPERTY</font></a></li>
      <li><a href="DeleteProperty"><font size="2">DELETE YOUR PROPERTY</font></a></li>
      <li><a href="SellerUpdateProperty.jsp"><font size="2">UPDATE PROPERTY DETAILS</font></a></li>
      <li class="active"><a href="SellerUpdateDetails.jsp"><font size="2">UPDATE PERSONAL DETAILS</font></a></li>
      <li><a href="SellerPropertyStatus"><font size="2">SHOW PROPERTY STATUS</font></a></li>
      <li><a href="HomePage.jsp"><font size="2">LOGOUT</font></a></li>
    </ul>
  </div>
</nav>

<%! SellerDetails sellobj;   %>
  
  
   <%
 sellobj =(SellerDetails)session.getAttribute("sellerinfo"); 
   %>

<div  class="container"align="center">
  <form class="form-inline" action="SellerUpdateDetails" method="get">
 	
 	<div class="form-group" >
      <label for="email">NAME:</label>
      <input type="text" class="form-control" placeholder="Enter name" name="sellname">
    </div>
     <br>
    <br>
    <div class="form-group">
      <label for="email">EMAIL:</label>
      <input type="email" class="form-control" name="sellemail" value="<%=sellobj.getSellemail()%>" readonly="readonly" required>
    </div>
    <br>
    <br>
    
      <div class="form-group">
      <label for="email">ADDRESS:</label>
      <input type="text" class="form-control"  placeholder="Enter address" name="selladdress">
    </div>
    <br>
    <br>
    
    
     <div class="form-group">
      <label for="email">MOBILE:</label>
      <input type="number" class="form-control"  placeholder="Enter mobile" name="sellmob">
    </div>
    <br>
    <br>
    
    
    <div class="form-group">
      <label for="pwd">SET PASSWORD:</label>
      <input type="password" class="form-control" placeholder="Enter password" name="sellpass">
    </div>
	<br>
	<br>`
    <button type="submit" class="btn btn-default">SUBMIT</button>
  </form>
  
  <div style="color: rgb(0, 0, 0);font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("recordinserted") != null){%>
         <h3>
    	     <%  out.print(request.getAttribute("recordinserted"));}%></h3>
       
     </div>
  </div>
  



</body>
</html>