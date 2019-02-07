
 
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Emp_Id</th><th>FirstName</th><th>LastNamey</th><th>DateOfBirth</th>
<th>Contact</th><th>Email</th><th>Address</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${employee}" varStatus="status">   
   <tr>  
   <td>${emp.emp_ID}</td>  
   <td>${emp.firstName}</td>
   <td>${emp.lastName}</td>
   <td>${emp.dateOfBirth}</td>
   <td>${emp.contact}</td>  
   <td>${emp.email}</td>  
   <td>${emp.address}</td>  
   <td><a href="edit/${emp.emp_ID}">Edit</a></td>  
   <td><a href="delete/${emp.emp_ID}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="/poc3/">Add New Employee</a> 
</body>
</html>