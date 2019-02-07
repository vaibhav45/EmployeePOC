<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
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

      <form:form method="post" action="/employeeduplicate/updateeducation" modelAttribute="education">
      
        <div class="table-responsive">
          <table class="table table-bordered" style="width: 300px">
            <tr>
            <td></td>
              <!-- <td>Emp_Id :</td> -->
              <td><form:hidden path="emp_ID" /></td>
            </tr>
            <tr>
            <!-- <td></td> -->
              <td>Emp_Edu_ID:</td>
              <td><form:input type="text" path="emp_Edu_ID" /></td>
            </tr>
            <tr>
              <td>SSC SchoolName:</td>
              <td><form:input type="text" path="ssc_SchoolName" /></td>
            </tr>
            <tr>
              <td>SSC grade</td>
              <td><form:input type="text" path="ssc_grade" /></td>
            </tr>
           
            <tr>
              <td>SSC yearofpass:</td>
              <td><form:input type="text" path="ssc_YearOfPass" /></td>
            </tr>
            <tr>
              <td>Inter College</td>
              <td><form:input type="text" path="inter_CollegeName" /></td>
            </tr>
          
            <tr>
              <td>Inter grade</td>
              <td><form:input type="text" path="inter_grade" /></td>
            </tr>
            <tr>
              <td>Inter yearofpass</td>
              <td><form:input type="text" path="inter_YearOfPass" /></td>
            </tr>
            <tr>
            <td>UG College</td>
            <td><form:input type="text" path="ug_CollegeName" />
            </tr>
           
            <tr>
              <td>UG grade</td>
              <td><form:input type="text" path="ug_grade" /></td>
            </tr>
            <tr>
              <td>UG yearofpass</td>
              <td><form:input type="text" path="ug_YearOfPass"/></td>
            </tr>
            <tr><td>PG College</td>
              <td><form:input type="text" path="pg_CollegeName"/></td>
            </tr>
           
            <tr>
              <td>PG grade</td>
              <td><form:input type="text" path="pg_grade" /></td>
            </tr>
            <tr>
              <td>PG yearofpass</td>
              <td><form:input type="text" path="pg_YearOfPass" /></td>
            </tr>
            <tr>
              <td></td>
              <td><input class="btn btn-primary btn-sm" type="submit" value="Submit" /></td>
              </tr>
              </table>
              </div>
              </form:form>
              </div>
              </section>
              </body>
              </html>