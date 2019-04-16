<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <link href="/success.css" rel="stylesheet" type="text/css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Welcome...${customer.name}</h4><br/>
	
	<nav class="navbar navbar-expand-sm bg-info navbar-light">
  <ul class="navbar-nav mr-auto">
    <li class="nav-item active  dropdown">
     <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Account</a>
     <c:if test = ${list==null }>
       <div class="dropdown-menu">
        <a class="dropdown-item" href="account">Create saving Account</a>
        </div>
        </c:if>
        <c:if test = ${list.null }>
        <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Create term account</a>
       </div>
      </c:if>
    </li>
    <li class="nav-item active dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Fund Transfer</a>
       <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Add benificiary</a>
        <a class="dropdown-item" href="#">funds</a>
        
      </div>
    </li>
 
    <li class="nav-item active dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">Others</a>
       <div class="dropdown-menu">
        <a class="dropdown-item" href="#">check book</a>
        
      </div>
    </li>
   
  </ul>
   <div class="navbar-nav">
      <a class="nav-item active nav-link" href="login"> <span class="glyphicon glyphicon-log-out"></span>Logout</a>
    </div>
</nav>
</body>
</html>