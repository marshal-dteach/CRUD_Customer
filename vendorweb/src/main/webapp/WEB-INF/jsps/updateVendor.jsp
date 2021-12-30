<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Location</title>
</head>
<body>

<form action="updateLoc" method="post">
<pre>
	Id: <input type="text" name="id" value="${vendor.id}" readonly/>
	Code: <input type="text" name="code" value="${vendor.code}"/>
	Name: <input type="text" name="name" value="${vendor.name}"/>
	Type: <select name="type">
			<option ${vendor.type == 'Regular' ? 'selected' : '' }>Regular</option>
			<option ${vendor.type == 'Contractor' ? 'selected' : '' }>Contractor</option>
		 </select>
	Email: <input type="text" name="email" value="${vendor.code}"/>
 	Phone: <input type="text" name="phone" value="${vendor.code}"/>
 	Address: <textarea rows="4" cols="50" name="address">${vendor.address}</textarea>
	
	<input type="submit" value="save"/>
</pre>
</form>




</body>
</html>