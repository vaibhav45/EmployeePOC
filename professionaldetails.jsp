<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
   <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/navigation.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
#edu1{
height:auto;
background-color: dimgray;
color: white;
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
	<%-- <input type="text" name="emp_ID" id="emp_ID" disabled="disabled">
	<%
  String value=request.getParameter("emp_ID");;
  int v=Integer.parseInt(value);
  Class.forName("com.mysql.jdbc.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeephaseone","root", "root");
  Statement st=conn.createStatement();
  ResultSet rs = st.executeQuery("select * from employee-edu_details where Emp_Id='"+v+"'");
  if(rs.next()){
      %>
  <td>Name: </td><td><input type="text" value="<%=rs.getString("SSC_SchoolName")%>"/> </td></tr>
        <%
  }
  %> --%>
    <div  id="main">
                <h2> THE ONE </h2>
                <p>where your first step starts</p>
                           

                        <ul>
                            <li><a href="home">Home</a></li>
                            <li><a href="/employeeduplicate/home#About">About</a></li>
                            <li class="active"><a href="profile">Profile</a></li>
                            <li><a href="/employeeduplicate/home#contact">Contact</a></li>
                            <%--  <li><a href="#id" id="EmpID">Emploee_ID ${empi.empl_ID} </a></li> --%>
                            
                            <li style="float:right"><a class="active" href="/employeeduplicate/"> LOGOUT</a></li>
                          </ul>
                          </div> 
  <div id="edu1">
<h1>professional Details List</h1>  
<table border="1" width="70%" cellpadding="4">  
<tr>

<th>Emp_Id</th>
<th>Previous_Company</th>
<th>Salary</th>
<th>Role</th>
<th>YearOfExp</th>
<th></th>
</tr>  
   <c:forEach var="prof" items="${empi}">   
   <tr>  
   <td>${prof.empl_ID}</td>  
   <td>${prof.previous_Company}</td>  
   <td>${prof.salary}</td>
   <td>${prof.role}</td>
   <td>${prof.yearsOfExp}</td>
   <td><a href="viewprofessional/${prof.empl_ID}">Edit</a></td>  
   <%-- <td><a href="deleteemp/${Emp_ID}">Delete</a></td>   --%>
   </tr>  
   </c:forEach>  
   </table>  
   </div>
</body>
</html>