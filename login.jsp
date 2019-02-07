<!DOCTYPE html>
<html lang="en">
 
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>login</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/login.css">
    <link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/navigation.css">
   
</head>

<body>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script> -->
        <!-- <section class="head">
                header 
                    <header>
                        <h2> THE ONE </h2>
                        <p id="tag">where your first step starts</p>
                        <ul>
                            <li><a href="#home">Home</a></li>
                            <li><a href="#about">About</a></li>
                            <li><a href="#contact">Contact</a></li>
                            <li style="float:right"><a class="active" href="#Login">LOGIN</a></li>
                          </ul>
                          
                    </header>
                </section> -->
      	<form action="login">
                    <div class="imgcontainer">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            
                            <img src="C:/Users/vaibhav_chakothi/Desktop/download.jpeg" alt="Avatar" class="avatar" height="200"><br>
                      <br>
                    </div>
                  
                    <div class="container">
                      <label for="uname"><b>UserName</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      <input type="email" id="uname" placeholder="Enter Username" name="uname" required><br><br>
                  
                      <label for="psw"><b>Password</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      <input type="password" placeholder="Enter Password" name="psw" id="psw"required><br><br>
                         
                      <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="checkbox" checked="checked" name="remember"> Remember me
                          </label><br><br>

                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                      <button type="submit" id="login" class="button1">Login</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      <input type="reset" class="button1"  value="Reset">
                    <br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      <span class="psw">Forgot <a href="#">password?</a></span>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      <span class="newreg">New<a href=reg> Register </a> </span>
                    </div>
                  </form>
                  <script type="text/javascript">
                 document.getElementById('login').onclick=function(){
                   window.alert( "welcome please note employee Id for further use");
                  
                  }
                  </script>
                  <!-- <script>
                  function getEmpid(){
                  onClick="getEmpid()"
				/* $("#search").click(function() { */
				var username= $('#uname').val();
				var password=$('#psw').val();
				Emp_ID.value = EmpID;
				$.ajax({
				url: "home.html",
				type: 'POST',
				data: {username:username}
				success: function(data) {
				$('EmpID').val(data);
				alert(data);
				var EmpID = data;
}		
});
}); -->
                  
                  }
                  
                  </script>-->
       
</body>
</html>