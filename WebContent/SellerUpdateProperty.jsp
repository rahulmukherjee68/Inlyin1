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
      <li class="active"><a href="SellerUpdateProperty.jsp"><font size="2">UPDATE PROPERTY DETAILS</font></a></li>
      <li><a href="SellerUpdateDetails.jsp"><font size="2">UPDATE PERSONAL DETAILS</font></a></li>
      <li><a href="SellerPropertyStatus"><font size="2">SHOW PROPERTY STATUS</font></a></li>
      <li><a href="HomePage.jsp"><font size="2">LOGOUT</font></a></li>
    </ul>
  </div>
</nav>
    <br>
    <br>
    
    
    <%! SellerDetails sellobj;   %>
  
  
   <%
 sellobj =(SellerDetails)session.getAttribute("sellerinfo"); 
   %>
<div class="container" ALIGN="center">
  <h3>UPDATE PROPERTY DETAILS </h3><BR>
  <BR>
  <form action="PropertyUpdate" class="form-inline" method="post">
  
  <div class="form-group" >
      <label for="text">PROPERTY ID:</label>
      <input type="text" class="form-control" placeholder="Enter ID" name="propertyid" required >
    </div>
  
  
    <div class="form-group" >
      <label for="text">SELLER EMAIL:</label>
      <input type="email" class="form-control" value="<%=sellobj.getSellemail()%>" readonly="readonly" name="selleremail" required>
    </div>
  
  
  <label for="type"><b>STATE:</b></label>
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
      <label for="email">PROPERTY PRICE:</label>
      <input type="text" class="form-control" placeholder="Enter price" name="propertyprice">LAKHS
    </div>
			<BR>
			<BR>
			<BR>
	<div class="form-group" >
      <label for="email">PROPERTY ADDRESS:</label>
      <input type="text" class="form-control" placeholder="Enter Address" name="propertyaddress">
    </div>
    <br>
    <br>
		<button type="submit" class="btn btn-default">SUBMIT</button>
			
			</form>
			
       <div style="color: rgb(0, 0, 0);font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("recordupdated") != null){%>
         <h3>
    	     <% out.print(request.getAttribute("recordupdated"));%></h3><%} 
       
       if(request.getAttribute("recordnotupdated") != null){%>
        <h3>
 	     <% out.print(request.getAttribute("recordnotupdated"));%></h3><%} %>
       
     </div>
</div>


</body>
</html>