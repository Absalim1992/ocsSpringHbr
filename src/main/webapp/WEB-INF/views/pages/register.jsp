<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h2>Registration Form</h2>
	<div align="center">
	<form:form modelAttribute="register" method="POST" >
		<label>UserID</label>
		<form:input path="userID"/><br/>
		<label>First name</label>
	    <form:input path="firstName"/><br/>
		<label>Last name</label>
		<form:input path="lastName"/><br/>
		<label>User Type</label>
		    <form:radiobutton path="userType" value="A"/>Admin
			<form:radiobutton path="userType" value="R"/>Reporter 
			<form:radiobutton path="userType" value="P"/>Patient <br/>	
		<label>DOB</label>
		<form:input type="date" path="dateOfBirth" id="myDate" value="2019-07-16"/><br/>
		<label>Gender</label>
		<form:input path="gender"/><br/>
		<label>Street</label>
		<form:input path="street"/><br/>
		<label>Location</label>
		<form:input path="location"/><br/>
		<label>City</label>
		<form:input path="city"/><br/>
		<label>State</label>
		<form:input path="state"/><br/>
		<label>Pincode</label>
		<form:input path="pincode"/><br/>
		<label>Mobile Number</label>
		<form:input path="mobileNo"/><br/>
		<label>Email Address</label>
		<form:input path="emailID"/><br/>
		<label>Password</label>
		<form:password path="password"/><br/>
		<input type="submit" value="Create"/><br/>
		Already have an account? <a href="login.html">Login</a>
	</form:form>
	</div>
</body>
</html>