<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
   <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/employeeduplicate/CSS/navigation.css">
</head>
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
       
        
    }
    body{
    height:auto;
background-color: dimgray;
    }
</style>
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
                                                       
                            <li style="float:right"><a class="active" href="/employeeduplicate/"> LOGOUT</a></li>
                          </ul>
                          </div> 
                          <div id="edu1">
<h1>Education Details List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr>

<th>Emp_Id</th>
<th>Emp_Edu_Id</th>
<th>SSC School</th>
<th>grade</th>
<th>year</th>
<th>Inter College</th>
<th>grade</th>
<th>year</th>

<th>UGCollege</th>
<th>grade</th>
<th>year</th>

<th>PG College</th>
<th>grade</th>
<th>year</th>


</tr>  
   <c:forEach var="edu" items="${empi}">   
   <tr>  
   <td>${edu.emp_ID}</td>  
   <td>${edu.emp_Edu_ID}</td>
   <td>${edu.ssc_SchoolName}</td>  
   <td>${edu.ssc_grade}</td>  
   <td>${edu.ssc_YearOfPass}</td>  
   
   <td>${edu.inter_CollegeName}</td>  
   <td>${edu.inter_grade}</td>  
   <td>${edu.inter_YearOfPass}</td>
   
   <td>${edu.ug_CollegeName}</td>  
   <td>${edu.ug_grade}</td>  
   <td>${edu.ug_YearOfPass}</td>
   
   <td>${edu.pg_CollegeName}</td>  
   <td>${edu.pg_grade}</td>  
   <td>${edu.pg_YearOfPass}</td>
   
   <td><a href="vieweducation/${edu.emp_ID}">Edit</a></td>  
   <%-- <td><a href="deleteemp/${Emp_ID}">Delete</a></td>   --%>
   </tr>  
   </c:forEach>  
   </table>  
   </div>
</body>
</html>