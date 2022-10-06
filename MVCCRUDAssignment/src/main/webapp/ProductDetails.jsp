<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ECommerce Application</title>
</head>
<style>
h1{text-align: center;}
form{
border:2px solid #000;
}
div.width1{
margin: 0 auto;
width: 400px;}

div.center{text-align: center;}
body{align: center;}
</style>
<body>
<h1>Product Management System</h1><br><br>

<div class="width1">
<form action="ProductController" method="post"> 
<div class="center">
<h4>Insert Product</h4> 
Product ID: <input type="text" name="prdID"/><br>
Product Name:<input type="text" name="prdName"/><br/>  
Product Price:<input type="text" name="prdPrice"/><br/>  <br>
<div class ="center"><input type="submit" value="Insert"/> </div> 
</div>
</form> 
</div>
<br>
<div class="width1">
<form action="ProductController" method="post"> 
<div class ="center">
<h4>Update Product</h4> 
Product ID: <input type="text" name="UprdID"/><br>
Product Name:<input type="text" name="UprdName"/><br/>  
Product Price:<input type="text" name="UprdPrice"/><br/>  <br>
<div class ="center"><input type="submit" value="Update"/> </div>
</div>
</form> 
</div>

<br>
<div class="width1">
<form action="ProductController" method="post"> 
<div class="center">
<h4>Delete Product</h4> 
Product ID: <input type="text" name="DprdID"/><br>  <br>
<div class ="center"><input type="submit" value="Delete"/> </div> 
</div>
</form> 
</div>
<br>
<div class="width1">
<form action="ProductController" method="post"> 
<div class="center">
<h4>Search for Product</h4> 
Product ID: <input type="text" name="SprdID"/><br>  <br>
<div class ="center"><input type="submit" value="Search"/> </div> 
</div>
</form> 
</div>
</body>
</html>