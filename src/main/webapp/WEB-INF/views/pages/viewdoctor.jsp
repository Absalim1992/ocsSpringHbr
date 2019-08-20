<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 
<title>View, Edit, Delete Doctor </title>
</head>
<body>
	
	<form:form>
  	<div align="center">
  	<h3>Doctor Details</h3><hr/>
  	<table>
		<thead>
			<tr>
				<td>Doctor ID</td>
				<td>Doctor Name</td>
				<td>DateOfBirth</td>
				<td>DateOfJoining</td>
				<td>Gender</td>
				<td>Qualification</td>
				<td>Specialization</td>
				<td>yearsOfExperience</td>
				<td>Street</td>
				<td>Location</td>
				<td>City</td>
				<td>State</td>
				<td>Pincode</td>
				<td>MobileNo</td>
				<td>EmailID</td>
			</tr>
		</thead>
		
		<c:forEach items="${doctor}" var="d">
			<tr>
				<td><c:out value="${d.doctorID}"/></td>
				<td><c:out value="${d.doctorName}"/></td>
				<td><c:out value="${d.dateOfBirth}"/></td>
				<td><c:out value="${d.dateOfJoining}"/></td>
				<td><c:out value="${d.gender}"/></td>
				<td><c:out value="${d.qualification}"/></td>
				<td><c:out value="${d.specialization}"/></td>
				<td><c:out value="${d.yearsOfExperience}"/></td>
				<td><c:out value="${d.street}"/></td>
				<td><c:out value="${d.location}"/></td>
				<td><c:out value="${d.city}"/></td>
				<td><c:out value="${d.state}"/></td>
				<td><c:out value="${d.pincode}"/></td>
				<td><c:out value="${d.mobileNo}"/></td>
				<td><c:out value="${d.emailID}"/></td>
				
				<td><a href="<c:url value='/edit-${d.doctorID}-doctor' />">${d.doctorID}</a></td>
			<td><a href="<c:url value='/delete-${d.doctorID}-doctor' />">delete</a></td>
				
			</tr>
		</c:forEach>
	</table>
 	</div>
	
	</form:form>
</body>
</html>