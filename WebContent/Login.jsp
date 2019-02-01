<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
  <title>INLYIN LOGIN</title>
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
            <li class="active"><a href="Login.jsp"><font size="5">LOGIN</font></a></li>
      <li><a href="BuyProperty.jsp"><font size="5">BUY A PROPERTY</font></a></li>
      <li><a href="SellProperty.jsp"><font size="5">SELL A PROPERTY</font></a></li>
      <li><a href="Enquiry.jsp"><font size="5">ENQUIRY</font></a></li>
      <li><a href="ContactUs.jsp"><font size="5">CONTACT US</font></a></li>
    </ul>
  </div>
</nav>
<div class="container">

<h2>INLYIN LOGIN </h2>
<form action="Login">
<div class="alert alert-info">
  <strong>Info!</strong>  <p>FIRST YOU HAVE TO REGISTER EITHER IN IF U WANT TO BUY OR IF U WANT TO SELL A PROPERTY</p>
</div>
<div class="container" style="background-color: AliceBlue" >
<div align="center">
	<table>
		<tr>
			
			<td><img alt="" src="globsyn images/seller1.png" height="35%" width="35%"></td>
			
			<td><img alt="" src="globsyn images/buyer1.png"></td>
		</tr>
	</table>
</div>
<div align="center">
	<table>
		
		<tr>
      		<td><label for="email">EMAIL:</label></td>
      		<td>&nbsp;&nbsp;</td>
      		<td><input type="email" class="form-control" id="email" placeholder="Enter email" name="useremail"></td>
    	</tr>
    	<tr>
      		<td><label for="pwd">PASSWORD:</label></td>
      		<td>&nbsp;&nbsp;</td>
      		<td><input type="password" class="form-control" id="pwd" placeholder="Enter password" name="userpass"></td>
      	</tr>
		<tr>
      		<td><label for="type">USER TYPE:</label></td>
      		<td>&nbsp;&nbsp;</td>
      		<td><select name="usertype" class="form-control">
					<option>BUYER</option>
					<option>SELLER</option>
				</select>
			</td>
		</tr>
    	<tr>
    		<td></td>
    		<td><button type="submit" class="btn btn-default">LOGIN</button></td>
    	</tr>
    </table><br>
	</div>
</div>
</form>

       <div style="color: rgb(0, 0, 0);font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("errormsg") != null)
    	      out.print(request.getAttribute("errormsg"));
       %>
     </div>
</div>

</body>
</html>
<a href="www.facebook.com">
<img alt="" src="globsyn images/icon-facebook.png" height="42" width="42" align="bottom"></a>
</body>
</html>