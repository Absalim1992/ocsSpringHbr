<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Doctor</title>

</head>
<body>

<body>
	
	<h2>Doctor Register Form</h2>
	
	<div align="center">
	<form:form modelAttribute="doctor" method="POST" >
		<label>Doctor ID</label>
		<form:input path="doctorID"/><br/>
		<label>Doctor name</label>
	    <form:input path="doctorName"/><br/>
		<label>Date Of Birth</label>
		<form:input type="text" path="dateOfBirth" id="myDate" /><br/>
		<label>Date Of Joininig</label>
		<form:input type="text" path="dateOfJoining" id="myDate" /><br/>
		<label>Gender</label>
		<form:input path="gender"/><br/>
		<label>Qualification</label>
		<form:input path="qualification"/><br/>
		<label>Specialization</label>
		<form:input path="specialization"/><br/>
		<label>yearsOfExperience</label>
		<form:input path="yearsOfExperience"/><br/> 
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
		<input type="submit" value="Add Doctor"/><br/>
		</form:form>
	</div>
</body>
</html>