<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
      pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container-fluid">
<div class= "row">
<div class = "col-sm-2"></div>
<div class = "col-sm-8">
<h3>List of Users</h3>
 <table class="table table-striped">
 <thead color = "blue">
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>firstName</th>
         <th>lastName</th>
         <th>DOB</th>
         <th>address</th>
         <th>address</th>
        <th>City</th>
         <th>state</th>
         <th>Pincode</th>
         <th>mobileNumber</th>
		<th>email</th>
         <th>aadhar</th>
         <th>pan</th>
		
      </tr>
    </thead>
      <tbody>
       <c:forEach var="lis" items="${list }">
                  <tr>
                        <td>${lis.id }</td>
                        <td>${lis.name }</td> 
                        <td>${lis.firstName }</td>
                        <td>${lis.lastName }</td>
                         <td>${lis.dob }</td>
                        <td>${lis.addressLine1 }</td>
                         <td>${lis.addressLine2 }</td>
                        <td>${lis.city }</td>
                         <td>${lis.state }</td>
                        <td>${lis.pincode }</td>
                        <td>${lis.mobileNumber }</td>
                         <td>${lis.email }</td>
                        <td>${lis.aadhar }</td>
                        <td>${lis.pan }</td>
                        
                       
                  </tr>
            </c:forEach>
      </tbody>
 </table>
</div>
<div class = "col-sm-2"></div>

</div>
</div>
   
</body>
</html>
