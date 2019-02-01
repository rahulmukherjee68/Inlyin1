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
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img 
  {
   	width: 70%;
   	margin: auto;
  }
  </style>
</head>
<body background="globsyn images\backgroundnew.jpg">

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="HomePage.jsp"><font size="100">INLYIN</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="HomePage.jsp"><font size="5">HOME</font></a></li>
      <li><a href="Login.jsp"><font size="5">LOGIN</font></a></li>
      <li><a href="BuyProperty.jsp"><font size="5">BUY A PROPERTY</font></a></li>
      <li><a href="SellProperty.jsp"><font size="5">SELL A PROPERTY</font></a></li>
      <li><a href="Enquiry.jsp"><font size="5">ENQUIRY</font></a></li>
      <li><a href="ContactUs.jsp"><font size="5">CONTACT US</font></a></li>
    </ul>
  </div>
</nav>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="globsyn images\image2.jpg" alt="Chania" width="460" height="345">
        <div class="carousel-caption">
          <h3><font color="WHITE">MUMBAI</font></h3>
        </div>
      </div>

      <div class="item">
        <img src="globsyn images\images3.jpg" alt="Chania" width="460" height="345">
        <div class="carousel-caption">
          <h3><font color="white"><b>DELHI</b></font></h3>
        </div>
      </div>
    
      <div class="item">
        <img src="globsyn images\image4.jpg" alt="Flower" width="460" height="345">
        <div class="carousel-caption">
          <h3><font color="black"><b>KOLKATA</b></font></h3>
        </div>
      </div>

      <div class="item">
        <img src="globsyn images\image5.jpg" alt="Flower" width="460" height="345">
        <div class="carousel-caption">
          <h3><font color="black"><b>BANGALORE</b></font></h3>
        </div>
      </div>
      
      <div class="item">
        <img src="globsyn images\image6.jpg" alt="Flower" width="460" height="150">
        <div class="carousel-caption">
          <h3><font color="white"><b>PATNA</b></font></h3>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>


	
	
	
	
	
  
<div class="container">
  <h3>INLYIN</h3>
  <b>
  <font><b>
  <p>Being a metropolitan COUNTRY, INDIA has seen a dramatic positive change in real estate development.</P>
  <P>As IN INDIA is a corporate hub and many people are shifting here, the demand for residential and commercial spaces are rising every day.</P>
  <p> With a wide range of new suburbs and numerous residential project in INDOIA, which is known for its renowned real estate developers that are attracting investors from all over the countries.</P>
  <P>Right from centrally located areas to some new localities, there are a variety of houses for sale in different states of INDIA.</P>
  <P> Many renowned companies like Wipro, IBM, TATA Consultancy Services and Cognizant that are employment generators in differnt states of INDIA are also giving rise to the demand of real estate industry where corporate are looking for their office spaces and on the other hand the workers in these firms are seeking 2bhk flats for rent in KOLKATA, 3bhk apartments for sale MUMBAI.</P>
  <P>There are many traditional yet liberal cities which are expanding every day and therefore you will find many upcoming projects in different states, new real estate companies and a huge variety of living option in the shape of land for sale, flats for sale and corporate spaces. </P>
  <P>From bandra - the pride of mumbai where you will find a number of residential developments with fancy tags and price starting at Rs. 80 Lakhs to Saltlake in kolkata where flats comes in abundance at a very affordable price range, there are a lot of new gate communities that offers contemporary designed homes in the various cities.</p>
  </b>
  </font>
  </b>
</div>




<a href="www.facebook.com">
<img alt="" src="globsyn images/icon-facebook.png" height="42" width="42" align="bottom"></a>
</body>


<script>
    $(document).ready(function() {
        function disableBack() { window.history.forward() }

        window.onload = disableBack();
        window.onpageshow = function(evt) { if (evt.persisted) disableBack() }
    });
</script>

</html>