<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style = "background-color: BLUE"><font color = "WHITE" size = "35" >Book Store</font></h1>

<center>

<form action="RegisterUser" method="post">
<fieldset>
<legend align = "center"><font color ="RED" face ="PhyllisD" size = "20"><u>Sign Up for Book Store</u></font></legend><br><br>

<table>
<!-- <tr>
<td>ID  :<br><br></td><td><input type = "number" name = "id" required ><br><br></td>
</tr>
 -->

<tr>
<td>Full Name :<br><br></td><td><input type = "text" name = "name" required><br><br></td>
</tr>

<tr>
<td>Phone Number  :<br><br></td><td><input type = "number" name = "number" required ><br><br></td>
</tr>

<tr>
<td>Gender  :<br><br></td><td>Male<input type = "radio" value = "male" name = "gender" required> Female<input type = "radio" value = "female" name = "gender" ><br><br></td>
</tr>

<tr>
<td>Birthday :<br><br></td><td><input type = "date" name = "dob" required><br><br></td>
</tr>

<tr>
<td>New Password :<br><br></td><td><input type = "password" name = "pass" required><br><br></td>
</tr>
</table>

<input type = "submit" value = "Create"><input type = "reset"><br>
<a href = login.jsp>Sign in?</a><br><br><br><br><br><br><br><br>
</fieldset>
</form>

</center>
</body>
</html>