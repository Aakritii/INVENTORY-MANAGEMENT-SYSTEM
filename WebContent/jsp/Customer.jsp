<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>
</head>
<body>
<form action="RegActCustomer.htm" method='post'>
<table>
<tr>
<td><label>CUSTOMER ID : </label></td>
<td> <input type="text" name="cid"></td>
</tr>
<tr>
<td><label>SHOWROOM ID : </label></td>
<td> <input type="text" name="c_sid"></td>
</tr>
<tr>
<td><label>CUSTOMER NAME : </label></td>
<td> <input type="text" name="cname"></td>
</tr>
<tr>
<td><label>PLOT NO. : </label></td>
<td> <input type="text" name="plotno"></td>
</tr>
<tr>
<td><label>STREET NAME : </label></td>
<td> <input type="text" name="street_name"></td>
</tr>
<tr>
<td><label>PINCODE : </label></td>
<td> <input type="text" name="pincode"></td>
</tr>
<tr>
<td><label>COUNTRY : </label></td>
<td> <input type="text" name="country"></td>
</tr>
<tr>
<td><label>CUSTOMER PHNO : </label></td>
<td> <input type="text" name="cphn"></td>
</tr>
<tr>
<td><label>PRODUCT ID : </label></td>
<td> <input type="text" name="c_pid"></td>
</tr>
<tr>
<td><label>PQTY : </label></td>
<td> <input type="text" name="c_pqty"></td>
</tr>
<!-- <tr> -->
<!-- <td><label>PURCHASE DATE : </label></td> -->
<!-- <td> <input type="text" name="c_pdate"></td> -->
<!-- </tr> -->
<tr>
<td> <input type="submit" name="REGISTER" value="CUSTOMER REGISTERATION"></td>
</tr>
</table>
</form>
</body>
</html>