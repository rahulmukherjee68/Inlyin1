<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Buyer Registration Page</title>
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
      <li class="active"><a href="BuyProperty.jsp"><font size="5">BUY A PROPERTY</font></a></li>
      <li><a href="SellProperty.jsp"><font size="5">SELL A PROPERTY</font></a></li>
      <li><a href="Enquiry.jsp"><font size="5">ENQUIRY</font></a></li>
      <li><a href="ContactUs.jsp"><font size="5">CONTACT US</font></a></li>
    </ul>
  </div>
</nav>

<div  class="container"align="center">
  <form class="form-inline" action="BuyerRegistration" method="get">
 	
 	<div class="form-group" >
      <label for="email">NAME:</label>
      <input type="text" class="form-control" placeholder="Enter name" name="buyname"required>
    </div>
     <br>
    <br>
    <div class="form-group">
      <label for="email">EMAIL:</label>
      <input type="email" class="form-control"  placeholder="Enter email" name="buyemail" required>
    </div>
    <br>
    <br>
    
      <div class="form-group">
      <label for="email">ADDRESS:</label>
      <input type="text" class="form-control"  placeholder="Enter address" name="buyaddress"required>
    </div>
    <br>
    <br>
    
    
     <div class="form-group">
      <label for="email">MOBILE:</label>
      <input type="number" class="form-control"  placeholder="Enter mobile" name="buymob"required>
    </div>
    <br>
    <br>
    
    
    <div class="form-group">
      <label for="pwd">SET PASSWORD:</label>
      <input type="password" class="form-control" placeholder="Enter password" name="buypass"required>
    </div>
	<br>
	<br>
	 <input type="checkbox" name="buyerterms" value="true"required><a href="Terms&Conditions.jsp"><font color="Black">AGGREED WITH TERMS & CONDITIONS</font></a>
	<br>`
	<br>
    <button type="submit" class="btn btn-default">SUBMIT</button>
  </form>
  </div>



</body>
</html>