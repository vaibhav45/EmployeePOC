<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Employee Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/home.css">
  <style>
  #EmpID{
  color:yellow;
  }
  </style>
</head>
<body id="homepage">


    <nav class="navbar navbar-inverse">
  
        <!-- header  -->
            <div  id="main">
                <h2> THE ONE </h2>
                <p>where your first step starts</p>
                            </div>
 
 
  <div class="container-fluid">
  
    <div class="navbar-header">
    
       
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
	    <li class="active"><a href="home">Home</a></li>
        <li><a href="#About">About</a></li>
        <li><a href="profile">Profile</a></li>
        <li><a href="#contact">Contact</a></li>
        <li ><a href="#id" id="EmpID"> Employee_ID ${empi.emp_ID}</a></li>
        
	 </ul>
	 
	
      <ul class="nav navbar-nav navbar-right">
   
       <%-- <li><p id='EmpID'>HI.${ID}
       <%  out.println("welcome " +firstname); %>
      --%>
        <li><a href="/employeeduplicate/"><span class="glyphicon glyphicon-log-in"></span> LOGOUT</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
      
      <ul>
        <li><p><a href="#leaveapply">Leave Apply</a></p></li>
        <li><p><a href="#payroll">PayRoll</a></p></li>
        
        <li><p><a href="#onboard">On Board</a></p></li>
      </ul>
   </div>
    <div class="col-sm-8 text-left" >
    <div class="a"> 
      <h1 id="about2">Welcome</h1>
      <p id="para1">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
      <hr>
     </div>
    <div id="About" class="a">
<h2 id="about2"> About </h2>
<p id="para1">What is payroll composed of on a micro-level? In this section, I’ll break down employee information, hours worked, salaries and wages, deductions, and net and gross pay.
</p>
<p>Hours worked
If you have hourly employees, you have to keep track of the hours they work. This will ensure you pay your employees the proper amount.

If you have salary employees, you may want to track the hours they work to make sure they are putting in all of their time.

Time off
You may also want to track the time your employees take off work for vacation, sick time, and holidays. What is sick pay like at your company? This is important if you have a policy that says how much time employees are allowed to take off.
</p>
<p>Salaries and wages
A salary is a fixed amount that you can pay an employee. Typically, an employee is given a yearly salary, which is then divided by the number of pay periods in the year.

For example, you give an employee a yearly salary of $28,600. You pay the employee every week, which means the weekly paycheck will be $550 before deductions ($28,600 / 52 weeks).

A wage is what you pay an employee based on the hours worked. You will set a specific rate of pay for each hourly employee. To calculate an employee’s total wages, you will multiply the rate of pay by the number of hours the employee works.

For example, you pay an employee $12 per hour. The employee worked 34 hours this week. You will owe the employee $408 before deductions ($12 x 34 hours).
</p>
</div>
<div id="contact" class="a">

<h2 id="about2">Contact</h2>
<span>Address:</span><br>
<span>Waverock Building; SEZ Unit II (Hyderabad),</span><br>
<span> Eleventh and Twelve Floor (Part B) South tower of Tower 1 of Phase 2, Survey No.115 (part) TSIIC IT / ITES SEZ,</span><br>
<span> Nanakramguda Village, Serilingampally Mandal, Hyderabad – 500008</span><br>
<span>Phone no. - 040-66060000</span>
</div>

    </div>
    <div class="col-sm-2 sidenav">
      <div class="well">
        <a href="#email">Email</a>
      </div>
      <div class="well">
        <a href="profile">Profile</a>
      </div>
    </div>
  </div>
</div>
<footer class="container-fluid text-center">
  <p>persistent systems ltd.</p>
</footer>
<!-- <script type="text/javascript">
window.localStorage.setItem('name',  $({empi.emp_ID}) );
document.getElementById("EmpID").innerHTML=window.localStorage.getItem('name');

</script> -->
</body>
</html>