<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" ><!-- integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous"> -->
<link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/navigation.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<<style>
#edu1{
height:auto;
background-color: dimgray;
color: white;
text-align: center;
}
 #main {
    	text-align: center;
        background-color: darkslategray;
        color: white;
        padding: 20px;
        background-color: darkslategray;
        
    }
     body{
    height:auto;
background-color: dimgray;
    }
</style>
</head>
<body>


  <div  id="main">
                <h2> THE ONE </h2>
                <p>where your first step starts</p>
                           

                        <ul>
                            <li><a href="home">Home</a></li>
                            <li><a href="/employeeduplicate/home#About">About</a></li>
                            <li class="active"><a href="profile">Profile</a></li>
                            <li><a href="/employeeduplicate/home#contact">Contact</a></li>
                             <li><a href="#id" id="EmpID">Emploee_ID ${empi.emp_ID} </a></li>
                            
                            <li style="float:right"><a class="active" href="/employeeduplicate/"> LOGOUT</a></li>
                          </ul>
                          </div> 
<div id="edu1"><br>
<form action="profedetails">
		<label for="empid">EmpID</label>&nbsp;
		<input type="number" name="empid">
		<input type="submit" value="submit">
		</form>

</div>
</body>
</html>