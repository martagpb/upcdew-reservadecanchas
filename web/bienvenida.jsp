<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License
-->
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>Página principal</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="default.css" rel="stylesheet" type="text/css" />
    </head>
    <body>

        <%@ include file="header.jsp" %>
        <div id="header">
            <h1>Reserva de canchas </h1>
            <h2>Bienvenido ${usuario.nombre}</h2>
        </div>
        <!-- end #header -->
        <div id="wrapper">
            <div id="content">
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
                <div style="clear: both;"></div>
                <h1>&nbsp;</h1>
            </div>
        </div>
        <!-- end #content -->
        <%@ include file="footer.jsp" %>
        <!-- end #footer -->
    </body>
</html>
