<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
</head>
<body>
<form action="RegActProduct.htm" method='post'>
<table>
<tr>
<td><label>PRODUCT ID : </label></td>
<td> <input type="text" name="pid"></td>
</tr>
<tr>
<td><label>PRODUCT NAME : </label></td>
<td> <input type="text" name="pname"></td>
</tr>
<tr>
<td><label>PRODUCT COLOR : </label></td>
<td> <input type="text" name="pcolor"></td>
</tr>
<tr>
<td><label>PRODUCT MANUF : </label></td>
<td> <input type="text" name="pmanuf"></td>
</tr>
<tr>
<td><label>PRODUCT PRICE : </label></td>
<td> <input type="text" name="pprice"></td>
</tr>
<tr>
<td> <input type="submit" name="REGISTER" value="PRODUCT REGISTERATION"></td>
</tr>
</table>
</form>
</body>
</html>