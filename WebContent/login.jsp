<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style/style.css">
<title>Login</title>
</head>
<body>
	<ul>
       	<li>Para entrar como ADMIN: usarname: admin,  pass: admin</li>
       	<li>Para entrar como INVITADO: usarname: Ola,  pass: ola</li>
       	<li>Para entrar como MODERADOR: usarname: Molina,  pass: molina</li>
       	<li>Para entrar como ESTUDIANTE: usarname: Pipo,  pass: pipo</li>
   	</ul>
	<div class="center">
		<h1>Login</h1>
	    <s:fielderror />
	    <s:form namespace="/" action="login">
	        <s:textfield label="Nombre de Usuario" name="username" />
	        <s:password label="Contraseña" name="pass" />
	        <s:submit />
	    </s:form>
    </div>
</body>
</html>