<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style/style.css">
<title>BackEnd Student</title>
</head>
<body>
	<a href="logout">Cerrar sesi&oacute;n</a>
	<div class="center">
		<h1>Bienvenido <s:property value="#session.username"/></h1>
	</div>
</body>
</html>