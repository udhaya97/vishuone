<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="../addBenificiary" modelAttribute="benificiary">
	Account Number:<input type="text" name="accNo" /><br/><br/>
	Re-enter Account Number:<form:input path="accNumber" />
		<br/>
		<br/>
	Account type:<form:input path="accType" />
		<br/>
		<br/>
	Name:<form:input path="accHolderName" />
		<br /><br/>
	email:<form:input path="email" />
		<br /><br/>
		<c:if test="${pageNo==2}">
	IFSC:<form:input path="ifsc" />
			<br /><br/>
		</c:if>
		<input type="submit" value="Add Benificiary" />
</form:form>
</body>
</html>