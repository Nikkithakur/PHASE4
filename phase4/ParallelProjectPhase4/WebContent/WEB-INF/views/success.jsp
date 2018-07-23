<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h2>Account created Successfully</h2>
<pre>
<h3>MobileNumber:</h3>${customer.mobileNo} 
<h3>Name:</h3>${customer.name}
<h3>Balance:</h3>${customer.wallet.balance}
</pre>
</body>
</html>