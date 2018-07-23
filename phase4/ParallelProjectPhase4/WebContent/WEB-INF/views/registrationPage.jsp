<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>RegistrationPage</title>
</head>
<body>

<div align="center">
<h2><u>Enter UserDetails</u></h2>
		<table>
		
			<form:form action="createaccount" method="post"  modelAttribute="customer">
			
				<tr>
					<td>MobileNo:</td>
					<td><form:input path="mobileNo" size="10" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" size="30" /></td>
				</tr>
				<tr>
					<td>InitialDeposit:</td>
					<td><form:input path="wallet.balance" size="30" /></td>
				</tr>
				
					<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</form:form>
		</table>
	</div>


</body>
</html>