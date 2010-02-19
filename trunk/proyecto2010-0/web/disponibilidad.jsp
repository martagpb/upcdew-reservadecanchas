<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : bienvenida
    Created on : 12/02/2010, 07:38:13 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disponibilidad</title>
    </head>
    <link href="default.css" rel="stylesheet" type="text/css" />
    <body>
        <h1>Bienvenido ${usuario.nombreCompleto}</h1>
        <%-- <h2>${usuario.nombreCompleto} </h2> --%>

        <%--
        <table border="1">

            <c:forEach var="rol" items="${roles}">
                <tr>
                    <td><input type="radio" value="${rol.idRol}" name="rolSeleccionado"> </td>
                    <td> ${rol.idRol}</td>
                    <td>
                        <c:if test="${rol.nombre=='Admin'}">
                            <font color="red"><b> ${rol.nombre} </b></font>
                        </c:if>
                        <c:if test="${rol.nombre=='Usuario'}">
                            ${rol.nombre}
                        </c:if>

                    </td>

                </tr>
            </c:forEach>



        </table>
        --%>

    </body>
</html>
