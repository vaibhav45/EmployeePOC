<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Professional</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet"
     integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
    <link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/professional.css">
    <!-- <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous"> -->
    <link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/navigation.css">
</head>
<body>
       <div  id="main">
                <h2> THE ONE </h2>
                <p>where your first step starts</p>
                           
 						 <ul>
                            <li><a href="home">Home</a></li>
                            <li><a href="#About">About</a></li>
                            <li class="active"><a href="profile">Profile</a></li>
                            <li><a href="#contact">Contact</a></li>
                            <li style="float:right"><a class="active" href="/employeeduplicate/"> LOGOUT</a></li>
                          </ul>
                          
                    </div>
           
    <form action="insertprofessional" method="post">
        <fieldset>
            <legend>Enter Professional details (if available) : </legend><br><br>
        
            <label for="prevoius_company">Emp_ID:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" name="empid"/><br><br>
        
        <label for="prevoius_company">Prevoius_Company:</label>&nbsp;&nbsp;
        <input type="text" name="previouscompany" Required/><br><br>
        
        <label for="salary">Salary:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" name="salary"/><br><br>
        
        <label for="role">Role: </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" name="role"/><br><br>
        
        <label for="yearsofexp">YearsOfExp:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;
        <input type="text" name="yearsofexp"/><br><br>

        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;
        <input type="submit" name="saveprof" value="SAVE" class="saveprof"/>
        <input type="button" class="saveprof"  value="Back" onclick="openPage('profile')">
        
        </fieldset>
    </form>

    <footer class="container-fluid text-center">
            <p>persistent systems ltd.</p>
          </footer>
          <script type="text/javascript">
 			function openPage(pageURL)
 			{
 			window.location.href = pageURL;
			}
			</script>
</body>
</html>