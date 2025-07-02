<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
</head>
<body>
	<jsp:useBean id="product" class="com.opeyemi.jsp.bean.Product"></jsp:useBean>
	<jsp:setProperty name="product" property="*"></jsp:setProperty>
	<h1>Product Details</h1>
	<br>
	<strong>Id: </strong><jsp:getProperty property="id" name="product" />
	<br>
	<strong>Name: </strong>
	<jsp:getProperty property="name" name="product" />
	<br>
	<strong>Description: </strong>
	<jsp:getProperty property="description" name="product" />
	<br>
	<strong>Price: </strong>
	<jsp:getProperty property="price" name="product" />
	<br>
</body>
</html>