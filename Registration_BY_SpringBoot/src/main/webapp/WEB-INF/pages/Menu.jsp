<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<title>Welcome</title>
</head>



<body>
	<h4>Welcome...${customer.name}</h4>

	<nav class="navbar navbar-expand-sm bg-info navbar-light">
	<ul class="navbar-nav mr-auto">
		<li class="nav-item active  dropdown"><a
			class="nav-link dropdown-toggle" href="#" id="navbardrop"
			data-toggle="dropdown">Account</a> <c:if test="${list.size()==0}">
				<div class="dropdown-menu">
					<a class="dropdown-item" href="account">Create saving Account</a>
				</div>
			</c:if> <c:if test="${list.size()!=0}">
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">Create term account</a>

				</div>
			</c:if></li>
		<li class="nav-item active dropdown"><a
			class="nav-link dropdown-toggle" href="#" data-toggle="dropdown">Add
				Beneficiary</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="benificiaryPage/1">with in a Bank</a>
				<a class="dropdown-item" href="benificiaryPage/2">Another Bank</a>


			</div></li>
		<li class="nav-item active dropdown"><a
			class="nav-link dropdown-toggle" href="#" data-toggle="dropdown">Fund
				Transfer</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="fundTransferPage/1">with in a
					Bank</a> <a class="dropdown-item" href="fundTransferPage/2">Another
					Bank</a>
				</div></li>

		<li class="nav-item active dropdown"><a
			class="nav-link dropdown-toggle" href="#" id="navbardrop"
			data-toggle="dropdown">Others</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="#">check book</a>

			</div></li>

	</ul>
	<div class="navbar-nav">
		<a class="nav-item active nav-link" href="login"> <span
			class="glyphicon glyphicon-log-out"></span>Logout
		</a>
	</div>
	</nav>


	<c:if test="${list!=null}">
		<h1>My Savings Account</h1>
		<div align="center" class="table-responsive">
			<form:form modelAttribute="account">
				<table class="table table-bordered table-sm"
					style="width: 50%; margin-left: 200px;">
					<tr>
						<th>Id</th>
						<th>Type</th>
						<th>Balance</th>
						<th>Created date</th>

					</tr>
					<c:forEach var="account" items="${list}">

						<tr>
							<td>${account.accId}</td>
							<td>${account.accType}</td>
							<td>${account.accBalance}</td>
							<td>${account.createdDate}</td>

						</tr>
					</c:forEach>
				</table>
			</form:form>
		</div>
	</c:if>
</body>
</html>
