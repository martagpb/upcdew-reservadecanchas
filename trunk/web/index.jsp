<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License
-->
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>Reserva Login</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="default.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div id="menu">
            <ul>
            </ul>
        </div>
        <!-- end #menu -->
        <div id="header">
            <h1>Reserva de canchas </h1>
            <h2> </h2>
        </div>
        <!-- end #header -->
        <div id="wrapper">
            <div id="content">
                <!-- end #posts -->
                <!-- end #links -->
                <div style="clear: both;">&nbsp;</div>
                <h1>Login</h1>

                <form action="bienvenida.htm" method="post">

                    <p>&nbsp;</p>
                    <table width="50%" border="0">
                        <tr>
                            <td>Usuario</td>
                            <td><input type="text" name="usuario" /></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="password" /></td>
                        </tr>
                        <tr>
                            <td colspan="2"><div align="center">
                                    <input name="submit" type="submit" value="Ingresar"/>
                                </div></td>
                        </tr>
                    </table>
                    <p>&nbsp;    </p>
                </form>
            </div>
        </div>
        <!-- end #content -->
        <%@ include file="footer.jsp" %>
        <!-- end #footer -->
    </body>
</html>
