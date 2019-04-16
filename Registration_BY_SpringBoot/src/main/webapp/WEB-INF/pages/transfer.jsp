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
	<form:form action="../transferAmount" modelAttribute="transfer">
	
	Your Account Number:<form:input path="fromAccount" />
		<br />
		<br />
	Beneficiary Account Number:
		
		<form:select path="benificiaryName" id="selectedValue">
				<c:forEach var="beni" items="${benificiary}">
					 <c:if test="${beni.register.id==reg.id }"> 
						<c:if test="${beni.ifsc!= NULL}">
							<form:option value="${beni.accHolderName }" label="${beni.accHolderName }"></form:option>
						</c:if>
				 </c:if> 
				</c:forEach>
			</form:select>

	<br />
		<br />
	Transfer description:<form:input path="description" />
		<br />
		<br />
	Amount:<form:input path="amount" />
		<br />
		<br />
		<%-- <c:if test="${pageNo==2}"> --%>
	IFSC:<form:input path="ifsc" />
			<br />
			<br />
		<%-- </c:if> --%>
		<input type="submit" value="Transfer" />
	</form:form>
</body>
</html>