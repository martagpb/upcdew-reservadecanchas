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
        <title>Reporte</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="<%=request.getContextPath()%>/default.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tables.css" type="text/css"/>
        <SCRIPT LANGUAGE=javascript src="script/CalendarPopup.js"></SCRIPT>

        <script LANGUAGE="JavaScript" ID="js2">
            var cal2 = new CalendarPopup();
            cal2.showYearNavigation();

        </script>
        <script LANGUAGE="JavaScript" >

            function prueba (cadena, fecha){

                //document.frmConsulta.action ="CalendarioController?codcancha="+cadena
                document.frmConsulta.action ="calendario.htm?cancha="+cadena+"&fecha="+fecha;
                document.frmConsulta.method="post";
                document.frmConsulta.submit();
            }
        </script>
        <% String fechaI = (String) request.getAttribute("fechaI");

            if (fechaI == null) {
                fechaI = "10/04/2010";
            }
            String fechaF = (String) request.getAttribute("fechaF");

            if (fechaF == null) {
                fechaF = "10/04/2010";
            }
        %>

        <c:set var="color" value="odd"/>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <!-- end #menu -->
        <div id="header">
            <h1>Reserva de canchas </h1>
            <h2>Ranking de canchas más reservadas</h2>
        </div>
        <!-- end #header -->
        <div id="wrapper">
            <div id="content">

                <form action="reporte.htm" method="post"  name="frmConsulta">
                    <table border="1">
                        <tr>
                            <td colspan="5">Ingrese rango de fechas </td>
                        </tr>
                        <tr>
                            <td>Desde: </td>

                            <td><input id="txtFechaI" name="txtFechaI" type="text" class="Texto1"  value="<%=fechaI%>" size="11" maxlength="10" onKeyPress="javascript:onKeyPressFecha(this);" readonly /><A HREF="#" onClick="cal2.select(document.frmConsulta.txtFechaI,'anchor3','dd/MM/yyyy'); return false;" TITLE="cal2.select(document.frmConsulta.txtFechaI,'anchor3','dd/MM/yyyy'); return false;" NAME="anchor3" ID="anchor3">
                                    <img align="middle" src="<%=request.getContextPath()%>/images/calendar.gif" border="0"/></A>
                            </td>
                            <td>Hasta: </td>

                            <td><input id="txtFechaF" name="txtFechaF" type="text" class="Texto1"  value="<%=fechaF%>" size="11" maxlength="10" onKeyPress="javascript:onKeyPressFecha(this);" readonly /><A HREF="#" onClick="cal2.select(document.frmConsulta.txtFechaF,'anchor3','dd/MM/yyyy'); return false;" TITLE="cal2.select(document.frmConsulta.txtFechaF,'anchor3','dd/MM/yyyy'); return false;" NAME="anchor3" ID="anchor3">
                                    <img align="middle" src="<%=request.getContextPath()%>/images/calendar.gif" border="0"/></A>
                            </td>

                            <td> <input  type="submit"  name="btnConsultar" value="Consultar" /></td>
                        </tr>
                    </table>
                    </br>
                    <h2>Ranking</h2>
                    <div id="itsthetable">
                        <table>

                            <thead>
                                <tr>
                                    <th width="100"> Total de reservas</th>
                                    <th width="100"> Descripción </th>
                                    <th width="100"> Tipo cesped </th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="cancha" items="${canchasTop}" >
                                    <c:choose>
                                        <c:when test="${color == 'row1'}">
                                            <tr class="odd"><c:set var="color" value="row2"/></c:when>
                                            <c:otherwise>

                                                <c:set var="color" value="row1"/>
                                            </c:otherwise>
                                        </c:choose>


                                        <th scope="row" id="r100" > ${cancha.nroReservas}</th>
                                        <td> ${cancha.descripcion}</td>
                                        <td> ${cancha.tipoCesped}</td>
                                    </tr>
                                </c:forEach>

                            </tbody>

                        </table>
                    </div>

                </form>




                <div style="clear: both;"></div>
                <h1>&nbsp;</h1>
            </div>
        </div>
        <!-- end #content -->
        <%@ include file="footer.jsp" %>
        <!-- end #footer -->
    </body>
</html>
