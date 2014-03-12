<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style/style.css">
<title>Moderadores</title>
</head>
<body>
	<a href="logout">Cerrar sesi&oacute;n</a>
	<div class="center">
		<h1>Bienvenido <s:property value="#session.username"/></h1>
	</div>
		<h2>Listado de Moderadores</h2>
	<a href="abmmoderatorNew">Registrar un nuevo moderador</a>
	<table>
	   <thead>
	       <tr>
		       <th>Nombre</th>
		       <th>Apellido</th>
               <th>Accion</th>
	       </tr>
	   </thead>
	   <tbody>
		<s:iterator value="list" status="status">
		    <tr>
	           <td><a href="abmmoderatorModify?mod=<s:property value="id" />"><s:property value="name" /></a></td>
	           <td><s:property value="surname" /></td>
               <td><a href="abmmoderatorDelete?mod=<s:property value="id" />" onclick="return confirm('¿Esta seguro?');">Eliminar</a></td>
		    </tr>
		</s:iterator>
	   </tbody>
	</table>
</body>
</html>