<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Education</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" ><!-- integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous"> -->
<link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/navigation.css">
<link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/education.css">
</head>
<body>
	 <section class="head">
                <!-- header  -->
                    <header>
                        <h2> THE ONE </h2>
                        <p id="tag">where your first step starts</p>
                        <ul>
                            <li><a href="home">Home</a></li>
                            <li><a href="/employeeduplicate/home#About">About</a></li>
                            <li class="active"><a href="profile">Profile</a></li>
                            <li><a href="/employeeduplicate/home#contact">Contact</a></li>
                            
                            <li style="float:right"><a class="active" href="/employeeduplicate/"> LOGOUT</a></li>
                          </ul>
                          
                    </header>
                </section>

<!--section 2  -->
	<section id="feilds">
		<div class="feilds1"> 

		<form id="mainform" action="updateeducation" method="post" modelAttribute="education">
                <p> please enter following blanks </p><br>
		<label for="Emp_ID"><b>Employee ID*:</b></label>  &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; 
		 <input type="text" name="empid" placeholder="Emp_ID"> <br><br>
        
         <fieldset>

            <legend>SSC Details:</legend>
        
		<label for="ssc_schoolname"><b>SSC_SchoolName *:</b></label>   &nbsp;
		 <input type="text" name="sscschool" > <br><br>
		 
		 <label for="ssc_grade"><b>SSC_Grade * :</b></label>   &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;
		 <input type="text" name="sscgrade"><br><br>
		
		<label for="ssc_yearOfPass"><b>SSC_YearOfPass *:</b></label>	 &nbsp;&nbsp; &nbsp;
		<input type="text" name="sscyearofpass"><br><br>
    </fieldset>
    <fieldset>
        <legend>InterMediate Details:</legend>
    
		<label for="inter_collegeName"><b>Inter_CollegeName *:</b></label>   &nbsp;&nbsp;
		 <input type="text" name="intercollege" > <br><br>
		
		 <label for="inter_grade"><b>Inter_Grade *:</b></label>&nbsp;	 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
		 <input type="text" name="intergrade"><br><br>
		
		<label for="inter_yearOfPass"><b>Inter_YearOfPass *:</b></label>	 &nbsp;&nbsp; &nbsp;
		<input type="text" name="interyearofpass"><br><br> 
    </fieldset>
    <fieldset>
        <legend>UG Details:</legend>

		<label for="ug_collegeName"><b>UG_CollegeName *:</b></label>   &nbsp;&nbsp; &nbsp;
		 <input type="text" name="ugcollege" ><br><br> 
	
		 <label for="ug_grade"><b>UG_Grade *:</b></label>&nbsp;	 &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
		 <input type="text" name="uggrade"><br><br>
		
		<label for="ug_yearOfPass"><b>UG_YearOfPass *:</b></label>	 &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;
		<input type="text" name="ugyearofpass"><br><br> 
    </fieldset>		
    <fieldset>
        <legend>PG Details:</legend>
    
         <label for="pg_collegeName"><b>PG_CollegeName *:</b></label>  &nbsp;&nbsp; &nbsp; &nbsp;
		 <input type="text" name="pgcollege" ><br><br> 
		
		 <label for="pg_grade"><b>PG_Grade *:</b></label>&nbsp;	 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
		 <input type="text" name="pggrade"><br><br>
		
		<label for="pg_yearOfPass"><b>PG_YearOfPass *:</b></label>	 &nbsp;&nbsp;  &nbsp;&nbsp;
		<input type="text" name="pgyearofpass"><br><br>
    </fieldset>	
		 <button type="submit" class="registerbtn" >Save</button> &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;
		 <!-- <button type="submit" onclick="location.href'='" class="registerbtn">Back</button> &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;  -->
		 <input type="button" class="registerbtn" value="Back" onclick="openPage('profile')">

		</form>
		</div>
		
		</section>
		
<footer class="container-fluid text-center">
		<p>persistent systems ltd.</p>
	  </footer>
	<!--  <script>
	 onclick="myFunction()"
function myFunction() {
  alert("success");
}
</script> -->
<script type="text/javascript">
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>
	</body>
	<!-- <a href=/Assignment-1/employees>LIST ALL EMPLOYEES</a>  -->
</html>