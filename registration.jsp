<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registration</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    <link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/registration.css">
    <link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/navigation.css">
</head>
<body>
    <section class="head">
        <!-- header  -->
            <header>
                <h2> THE ONE </h2>
                <p id="tag">where your first step starts</p>
                <ul>
                    <li><a href="#home">Home</a></li>
                    <li><a href="#about">About</a></li>
                     <li><a href="#contact">Profile</a></li>
                    <li><a href="#contact">Contact</a></li>
                    <li style="float:right"><a class="active" href="/employeeduplicate/">LOGIN</a></li>
                  </ul>
                  
            </header>
        </section>
        <!--section 2  -->
            <section id="feilds">
              
                <div class="feilds1"> 
                <!-- <form action="create" method="post" modelAttribute="employee"> -->
                <form action="create" name="myForm" method="post" modelAttribute="employee">
                     
                        <p> please enter following blanks </p><br>
                <label for="firstname"><b>First Name:</b></label>  &nbsp;&nbsp; &nbsp; &nbsp;
                 <input type="text" name="firstname" id="firstname" placeholder="FirstName"  maxlength="25"> &nbsp;&nbsp; &nbsp;&nbsp;
                  &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; 
                 
                 
                  <label for="lastname"><b>Last Name:</b></label>&nbsp;	
                 <input type="text" name="lastname" id="lastname" placeholder="lastName" maxlength="25"><br><br>
                
                <label for="dateofbirth"><b>Date Of Birth:</b></label>	 &nbsp;
                <input type="date" name ="dateofbirth" id="dateofbirth" placeholder="yyyy-mm-dd"> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
                
                <label for="mobile"><b> Contact:</b></label> &nbsp;&nbsp; &nbsp;&nbsp; 
                <input type="number" pattern="^\d{10}$" name="contact" id="contact" placeholder="contact" maxlength="10"><br><br>
                
                <label for="email"><b>	Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
                <input type="email" name="email"  id="email" placeholder="email" >	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                
                <label for="address"><b> Address:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="text" name="address" id="address" placeholder="address">
                <br><br>
                
                <button type="submit" class="registerbtn">Register</button>

                 <input type="button" class="registerbtn" onclick="location.href('home.html');" value="Back">
                 </form>
                </div>
                
                </section>
                
                
                
                
<footer class="container-fluid text-center">
  <p>persistent sytems ltd.</p>
</footer>

<!-- 
<script>

function FormRegistration(){

    var firstname = document.getElementById("firstname");
    var lastname = document.getElementById("lastname");
    var dateofbirth = document.getElementById("dateofbirth");
    var contact = document.getElementById("contact");
    var email = document.getElementById("email");
    var address = document.getElementById("address");
    
}
</script>
 -->             
</body>
</html>