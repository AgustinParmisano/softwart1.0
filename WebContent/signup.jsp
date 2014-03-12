<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="style/style.css">
	<title>Sign up</title>
</head>
<body>
    <h1>Sign up</h1>
    <s:fielderror />
    <s:form namespace="/" action="signup">
        <s:textfield label="Nombre" name="name" />
        <s:textfield label="Apellido" name="surname" />

        <s:textfield label="Nombre de Usuario" name="username" />
        <s:password label="Contraseña" name="pass" />
        
        <s:textfield label="Email" name="email" />
        <s:textfield name="birth" label="Fecha de cumpleaños (dd/MM/yyyy)" />
        <s:radio label="Genero" name="gender" list="#{'1':'Hombre','2':'Mujer','3':'Sin especificar'}" />
        
        <s:textfield label="Nacionalidad" name="nationality" />
        <s:textfield label="Trabajo" name="job" />
        
        <s:submit />
    </s:form>
</body>
</html>