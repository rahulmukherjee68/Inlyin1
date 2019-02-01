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
      <a class="navbar-brand" href="HomePage.jsp"><font size="100">INSIDE INLYIN</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="SellerAfterLoginPage.jsp"><font size="2">SELLER'S HOME</font></a></li>
       <li ><a href="SellerAddPropertyRegistration.jsp"><font size="2">ADD A PROPERTY</font></a></li>
      <li class="active"><a href="DeleteProperty"><font size="2">DELETE YOUR PROPERTY</font></a></li>
      <li><a href="SellerUpdateProperty.jsp"><font size="2">UPDATE PROPERTY DETAILS</font></a></li>
      <li><a href="SellerUpdateDetails.jsp"><font size="2">UPDATE PERSONAL DETAILS</font></a></li>
      <li><a href="SellerPropertyStatus"><font size="2">SHOW PROPERTY STATUS</font></a></li>
      <li><a href="HomePage.jsp"><font size="2">LOGOUT</font></a></li>
    </ul>
  </div>
</nav>

<br>
<br>
<br>
<br>
<br>

<div class="container" style="background-color: Bisque">

<%! SellerDetails sellobj;   %>
  
  
   <%
 sellobj =(SellerDetails)session.getAttribute("sellerinfo"); 
   %>
   
   <h2><font color="BROWN" >WELCOME  &nbsp;&nbsp;<b> <%=sellobj.getSellname()%></b></font></h2>


<%List<PropertyDetails> userlist=(List<PropertyDetails>)request.getAttribute("ulist");%>
	<div align="center">
	<h2>All Property details</h2>
	<table border=4>
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
				<td><a href="DeleteTableProperty?propertyid=<%=uobj.getPropertyid()%>"><font color="red"><b><button type="SUBMIT" class="btn btn-danger">DELETE</button></b></font></a></td>
			</tr>
			<%
			}
			%>	
</table>
	
	
	
</div>
</div>

</body>
</html>