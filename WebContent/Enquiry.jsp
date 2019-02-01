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
  
<div class="container" ALIGN="center">
  <h3><font color="white">INLYIN SEARCH</font></h3><BR>
  <BR>
  <form action="Enquiry" class="form-inline" METHOD="GET">
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
</div>

<div style="color: red;font-weight: bold;" align="center">
       <% //SCRIPLET TAG
         if(request.getAttribute("errormsg") != null)
    	      out.print(request.getAttribute("errormsg"));
       %>
     </div>



<a href="www.facebook.com">
<img alt="" src="globsyn images/icon-facebook.png" height="42" width="42" align="bottom"></a>
</body>
</html>