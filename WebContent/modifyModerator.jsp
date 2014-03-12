<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style/style.css">
<title>Modificar Moderador</title>
</head>
<body>
	<a href="logout">Cerrar sesi&oacute;n</a>
	<div class="center">
		<h1>Modificar Moderador <s:property value="username" /> </h1>
	</div>
    <s:fielderror />
    <i>Deje el campo de contraseña en blanco si no desea cambiarla.</i>
    <s:form namespace="/" action="abmmoderatorModify?mod=%{model.id}">
        <s:hidden name="id" value="%{model.id}"/>
        <s:textfield label="Nombre" name="name" value="%{model.name}" />
        <s:textfield label="Apellido" name="surname" value="%{model.surname}" />

        <s:textfield label="Nombre de Usuario" name="username" value="%{model.username}"  />
        <s:password label="Contraseña" name="pass" value="%{model.pass}" />
        <s:submit />
    </s:form>
</body>
</html>