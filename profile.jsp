<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/home.css"> 
  <link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/navigation.css">
  <style>
  #profile{
  
  padding:20px;
  background-color: teal; ;
  height: 700px;
  
  }
  button{
  margin-left: 30px;
  }
* {
  box-sizing: border-box;
}

/* Create two equal columns that floats next to each other */
.column {
  float: left;
  width: 50%;
  padding: 10px;
  height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: block;
  clear: both;
}
</style>
  
  

</head>
<body>

<nav class="navbar navbar-inverse">
     <!-- header  -->
            <div  id="main">
                <h2> THE ONE </h2>
                <p>where your first step starts</p>
                            </div>
  <div class="container-fluid">
    <div class="navbar-header">
        
                  
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     <%--  <label for="EmpID">Hii ${empi.emp_ID}</label> --%>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="home">Home</a></li>
        <li><a href="/employeeduplicate/home#About">About</a></li>
        <li class="active"><a href="profile">Profile</a></li>
        <li><a href="/employeeduplicate/home#contact">Contact</a></li>
        <li><a href="#id" id="EmpID">Employee_ID ${empi.emp_ID} </a></li>
     <%--   <%request.getParameter("SUBFAMILY"); %> --%>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/employeeduplicate/"><span class="glyphicon glyphicon-log-in"></span> LOGOUT</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="row" id="profile">
	<div class="column">
		<button id="but1"><a href="formedu">Education Details</a></button><br><br>
		
	</div>
	

<!-- <table border="1" type="hidden" id="edutable">

	</table><br><br> -->
	<div class="column">
		<button id="but2"><a href="formprof">Professional Details</a></button>
	</div>
</div>
<!-- <script>

document.getElementById('but1').onClick=function(){
documentgetElementById('profile').style.display="none";
/* documentgetElementById('but1').style.display="none"; */
document.getElementById('mainform').style.display="block";


}
 -->

</script>

</body>
</html>