<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License
-->
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
    

        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>Canchas</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="<%=request.getContextPath()%>/default.css" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tables.css" type="text/css"/>

        <script LANGUAGE="JavaScript" >

            function modificar (codigo){

                //document.frmConsulta.action ="CalendarioController?codcancha="+cadena
                document.frmConsulta.action ="cancha.htm?opcion=llenarCancha&codigo="+codigo;
                document.frmConsulta.method="post";
                document.frmConsulta.submit();
            }

            function eliminar (codigo){

                //document.frmConsulta.action ="CalendarioController?codcancha="+cadena
                document.frmConsulta.action ="cancha.htm?opcion=eliminarCancha&codigo="+codigo;
                document.frmConsulta.method="post";
                document.frmConsulta.submit();
            }

        </script>
    </head>
    <body>

        <%@ include file="header.jsp" %>
        <div id="header">
            <h1>Reserva de canchas </h1>
            <h2>Mantenimiento de canchas</h2>
        </div>
        <!-- end #header -->



        <div id="wrapper">
            <div id="content">

                <form action="cancha.htm" method="post"  name="frmConsulta">
                    <h2>Listado de canchas</h2>
                    <div id="itsthetable">
                        <table>

                            <thead>
                                <tr>

                                    <th width="100"> Descripción </th>
                                    <th width="100"> Tipo césped </th>
                                    <th width="100"> Tamaño</th>
                                    <th width="200"> Costo por hora </th>
                                    <th width="100"> Acciones </th>

                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="cancha" items="${canchas}">

                                    <c:choose>
                                        <c:when test="${color == 'row1'}">
                                            <tr class="odd"><c:set var="color" value="row2"/></c:when>
                                            <c:otherwise>

                                                <c:set var="color" value="row1"/>
                                            </c:otherwise>
                                        </c:choose>


                                        <th scope="row" id="r100" > ${cancha.descripcion}</th>
                                        <td> ${cancha.tipoCesped}</td>
                                        <td> ${cancha.tamano}</td>
                                        <td align="right"> ${cancha.costoHora}</td>
                                        <td> <a  href="JavaScript:modificar('${cancha.codCancha}')"> Modificar </a> <a  href="JavaScript:eliminar('${cancha.codCancha}')"> Eliminar </a></td>
                                    </tr>

                                </c:forEach>



                            </tbody>

                        </table>

                        <table border="1">
                            <tr>   <td> <a  href="edicionCancha.jsp"> Nueva cancha </a></td> </tr>
                        </table>
                    </div>

                </form>
            </div>
        </div>
        <!-- end #content -->
        <%@ include file="footer.jsp" %>
        <!-- end #footer -->
    </body>
</html>
