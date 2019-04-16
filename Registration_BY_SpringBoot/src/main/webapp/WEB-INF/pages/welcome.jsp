<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
                href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet"
     href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> 


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<script>
	$(function() {

		$("#datepicker").datepicker({
			dateFormat : "dd-mm-yy"
		});
	});
</script>


</head>
<body>
<div class ="container-fluid">
<div class="row">
<div class = "col-sm-2"></div>
<div class = "col-sm-2">
<form:form action="create" modelAttribute="registration">
<table align="center" cellspacing="15">
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>DOB</td>
			</tr>
			<tr>
				<td><form:input path="firstName" /></td>
				<td><form:input path="lastName" /></td>
				<td><form:input path="dob" id="datepicker" /></td>
			</tr>
			<tr>
				<td>Address Line1</td>
				<td>Address Line2</td>
				<td>City</td>
			</tr>
			<tr>
				<td><form:input path="addressLine1" /></td>
				<td><form:input path="addressLine2" /></td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td>Pincode</td>
				<td>Mobile Number</td>
			</tr>
			<tr>
				<td><form:input path="state" /></td>
				<td><form:input path="pincode" /></td>
				<td><form:input path="mobileNumber" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td>Aadhar</td>
				<td>PAN</td>
			</tr>
			<tr>
				<td><form:input path="email" /></td>
				<td><form:input path="aadhar" /></td>
				<td><form:input path="pan" /></td>
			</tr>
			<tr>
				<td>Username</td>
				<td>Password</td>
				<td>Confirm Password</td>
			</tr>
			<tr>
				<td><form:input path="name" /></td>
				<td><form:input path="password" /></td>
				<td><input type="text" name="confirm"><br></td>
			</tr>
			<tr>
				<td>Date Of Birth Proof</td>
				<td><form:input type="file" path="dobProof" size="6" /></td>
				<td>EX: Passport, Birth Certificate Upload</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td>only PDF,JPG,JPEG Documents</td>
			</tr>
			<tr>
				<td>Address Proof</td>
				<td><form:input type="file" path="addressProof" size="6" /></td>
				<td>EX: License, Voter ID Upload</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td>only PDF,JPG,JPEG Documents</td>
			</tr>
			<tr>
				<td>Aadhar</td>
				<td><form:input type="file" path="aadharProof" size="6" /></td>
				<td>Upload only PDF,JPG,JPEG Documents</td>
			</tr>
			<tr>
				<td>PAN</td>
				<td><form:input type="file" path="panProof" size="6" /></td>
				<td>Upload only PDF,JPG,JPEG Documents</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
</form:form>
</div>
<div class = "col-sm-2"></div>

</div>
</div>
	<%-- <form:form action="create" modelAttribute="registration">
		<table align="center" cellspacing="15">
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>DOB</td>
			</tr>
			<tr>
				<td><form:input path="firstName" /></td>
				<td><form:input path="lastName" /></td>
				<td><form:input path="dob" id="datepicker" /></td>
			</tr>
			<tr>
				<td>Address Line1</td>
				<td>Address Line2</td>
				<td>City</td>
			</tr>
			<tr>
				<td><form:input path="addressLine1" /></td>
				<td><form:input path="addressLine2" /></td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td>Pincode</td>
				<td>Mobile Number</td>
			</tr>
			<tr>
				<td><form:input path="state" /></td>
				<td><form:input path="pincode" /></td>
				<td><form:input path="mobileNumber" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td>Aadhar</td>
				<td>PAN</td>
			</tr>
			<tr>
				<td><form:input path="email" /></td>
				<td><form:input path="aadhar" /></td>
				<td><form:input path="pan" /></td>
			</tr>
			<tr>
				<td>Username</td>
				<td>Password</td>
				<td>Confirm Password</td>
			</tr>
			<tr>
				<td><form:input path="userName" /></td>
				<td><form:input path="psssword" /></td>
				<td><input type="text" name="confirm"><br></td>
			</tr>
			<tr>
				<td>Date Of Birth Proof</td>
				<td><form:input type="file" path="dobProof" size="6" /></td>
				<td>EX: Passport, Birth Certificate Upload</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td>only PDF,JPG,JPEG Documents</td>
			</tr>
			<tr>
				<td>Address Proof</td>
				<td><form:input type="file" path="addressProof" size="6" /></td>
				<td>EX: License, Voter ID Upload</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td>only PDF,JPG,JPEG Documents</td>
			</tr>
			<tr>
				<td>Aadhar</td>
				<td><form:input type="file" path="aadharProof" size="6" /></td>
				<td>Upload only PDF,JPG,JPEG Documents</td>
			</tr>
			<tr>
				<td>PAN</td>
				<td><form:input type="file" path="panProof" size="6" /></td>
				<td>Upload only PDF,JPG,JPEG Documents</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table> --%>
		<!-- <table align="center" cellspacing="15">
			<tr>
			
				<td><input type="submit" value="Reset"></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table> -->
	<%-- </form:form> --%>
</body>
</html>
