  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
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
	  <div  id="main">
                <h2> THE ONE </h2>
                <p>where your first step starts</p>
                           

                        <ul>
                            <li><a href="home">Home</a></li>
                            <li><a href="/employeeduplicate/home#About">About</a></li>
                            <li class="active"><a href="profile">Profile</a></li>
                            <li><a href="/employeeduplicate/home#contact">Contact</a></li>
                            <%--  <li><a href="#id" id="EmpID">Emploee_ID ${empi.emp_ID} </a></li> --%>
                            
                            <li style="float:right"><a class="active" href="/employeeduplicate/"> LOGOUT</a></li>
                          </ul>
                          </div> 
                    
<!--section 2  -->
	<section id="feilds">
		<div class="feilds1"> 

		<form:form id="mainform" action="/employeeduplicate/updateeducation" method="post" modelAttribute="education" name="eduform">
                <p> please enter following blanks </p><br>
		<label for="Emp_ID"><b>Employee ID*:</b></label>  &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; 
		 <input type="text" name="emp_ID" placeholder="Emp_ID" Required> <br><br>
        
        <label for="Emp_Edu_ID"><b>Employee ID*:</b></label>  &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; 
		 <input type="number" name="emp_Edu_ID" placeholder="Emp_ID" Required> <br><br>
        
         <fieldset>

            <legend>SSC Details:</legend>
        
		<label for="ssc_schoolname"><b>SSC_SchoolName *:</b></label>   &nbsp;
		 <input type="text" name="ssc_SchoolName" Required> <br><br>
		 
		 <label for="ssc_grade"><b>SSC_Grade * :</b></label>  &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;
		 <input type="number" name="ssc_grade" Required> <span id="numloc"></span><br/><br>
		
		<label for="ssc_yearOfPass"><b>SSC_YearOfPass *:</b></label>	 &nbsp;&nbsp; &nbsp;
		<input type="number" name="ssc_YearOfPass" Required><br><br>
    </fieldset>
    <fieldset>
        <legend>InterMediate Details:</legend>
    
		<label for="inter_collegeName"><b>Inter_CollegeName *:</b></label>   &nbsp;&nbsp;
		 <input type="text" name="inter_CollegeName" Required> <br><br>
		
		 <label for="inter_grade"><b>Inter_Grade *:</b></label> &nbsp;	 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
		 <input type="number" name="inter_grade" Required><span id="numloc"></span><br/><br>
		
		<label for="inter_yearOfPass"><b>Inter_YearOfPass *:</b></label>	 &nbsp;&nbsp; &nbsp;
		<input type="number" name="inter_YearOfPass" Required><br><br> 
    </fieldset>
    <fieldset>
        <legend>UG Details:</legend>

		<label for="ug_collegeName"><b>UG_CollegeName *:</b></label>   &nbsp;&nbsp; &nbsp;
		 <input type="text" name="ug_CollegeName" Required><br><br> 
	
		 <label for="ug_grade"><b>UG_Grade *:</b></label> &nbsp;	 &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
		 <input type="number" name="ug_grade" Required><br><br><span id="numloc"></span><br/>
		
		<label for="ug_yearOfPass"><b>UG_YearOfPass *:</b></label>	 &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;
		<input type="number" name="ug_YearOfPass" Required><br><br> 
    </fieldset>		
    <fieldset>
        <legend>PG Details:</legend>
    
         <label for="pg_collegeName"><b>PG_CollegeName *:</b></label>  &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
		 <input type="text" name="pg_CollegeName" Required><br><br> 
		
		 <label for="pg_grade"><b>PG_Grade *:</b></label>&nbsp;	 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
		 <input type="number" name="pg_grade" Required> <span id="numloc"></span><br/><br>
		
		<label for="pg_yearOfPass"><b>PG_YearOfPass *:</b></label>	 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;  &nbsp;&nbsp;
		<input type="number" name="pg_YearOfPass" Required><br><br>
    </fieldset>	
		 <button type="submit" class="registerbtn" id="save" onclick="return validateForm()">Save</button> &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;
		 <!-- <button type="submit" onclick="location.href'='" class="registerbtn">Back</button> &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;  -->
		 <input type="button" class="registerbtn" value="Back" onclick="openPage('profile')">

		</form:form>
		</div>
		
		</section>
		<script type="text/javascript">
		 function myFunction(){
		
		 document.getElementById("mainform").onclick=function(){
		 document.getElementById("mainform").style.diplay="none";
		 document.getElementByID("edutable").style.display="block";
		 }
		 document.getElementByID("update").onClick=function(){
		 document.getElementByID("update").style.display="none";
		 document.getElementById("mainform").style.diplay="block";
		 }
		
		}
		</script>
		<script> 
function validateForm()                                    
{ 
    var sscschool = document.forms["eduform"]["sscschool"];               
    var sscgrade = document.forms["eduform"]["sscgrade"];    
    var sscyearofpass = document.forms["eduform"]["sscyearofpass"];  
     var intercollege = document.forms["eduform"]["intercollege"];               
    var intergrade = document.forms["eduform"]["intergrade"];    
    var interyearofpass = document.forms["eduform"]["interyearofpass"];  
     var ugcollege = document.forms["eduform"]["ugcollege"];               
    var uggrade = document.forms["eduform"]["uggrade"];    
    var ugyearofpass = document.forms["eduform"]["ugyearofpass"];  
     var pgcollege = document.forms["eduform"]["pgcollege"];               
    var pggrade = document.forms["eduform"]["pggrade"];    
    var pgyearofpass = document.forms["eduform"]["pgyearofpass"];  
    
     if (sscschool.value == "")                                  
    { 
        window.alert("Please enter your sscschool."); 
        sscschool.focus(); 
        return false; 
    } 
   
    if (sscgrade.value == "" || (isNaN(num)))                               
    { 
 		 document.getElementById("numloc").innerHTML="Enter Numeric value only";
 		 return false;
		}else{
 		 return true;
  		}
        window.alert("Please enter your sscgrade"); 
        sscgrade.focus(); 
        return false; 
    } 
       
    if (sscyearofpass.value == "" ||  schoolyearofpass.length!=4)                                   
    { 
        window.alert("Please enter ssc yearofpass and enter valid year"); 
        sscyearofpass.focus(); 
        return false; 
    } 
     if (intercollege.value == "")                                  
    { 
        window.alert("Please enter your intercollege."); 
        intercollege.focus(); 
        return false; 
    } 
   
    if (intergrade.value == "" || (isNaN(num)))                               
    { 
     document.getElementById("numloc").innerHTML="Enter Numeric value only";
     window.alert("Please enter your intergrade"); 
        intergrade.focus(); 
        return false; 
		}else{
 		 return true;
  		}
        
       
    if (interyearofpass.value == "" || interyearofpass.length!=4)          
    { 
        window.alert("Please enter inter yearofpass and enter valid year"); 
        interyearofpass.focus(); 
        return false; 
    } 
    if (ugcollege.value == "")                                  
    { 
        window.alert("Please enter your ugcollege."); 
        ugcollege.focus(); 
        return false; 
    } 
   
    if (uggrade.value == "" || (isNaN(num)))                               
    { 
     document.getElementById("numloc").innerHTML="Enter Numeric value only";
       window.alert("Please enter your uggrade"); 
        uggrade.focus(); 
 		 return false;
		}else{
 		 return true;
  		}
      
      
  
       
    if (ugyearofpass.value == "" || ugyearofpass.length!=4)                                   
    { 
        window.alert("Please enter ug yearofpass and enter valid year"); 
        ugyearofpass.focus(); 
        return false; 
    } 
    if (pgcollege.value == "")                                  
    { 
        window.alert("Please enter your pgcollege./n If not applcatble put 'NA'"); 
        pgcollege.focus(); 
        return false; 
    } 
   
    if (pggrade.value == "" || (isNaN(num)))                               
    { 
     document.getElementById("numloc").innerHTML="Enter Numeric value only";
     window.alert("Please enter your pggrade /n If not applcatble put '0' "); 
        pggrade.focus(); 
 		 return false;
		}else{
 		 return true;
  		}
       
       
    if (pgyearofpass.value == "" ||  pgyearofpass.length!=4)                                   
    { 
        window.alert("Please enter pg yearofpass /n If not applcatble put '0' and enter valid year")
        pgyearofpass.focus(); 
        return false; 
    } 
    }
    </script>
		
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