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
        <title>Disponibilidad</title>
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

            function prueba (cadena){
                
                document.frmConsulta.action ="CalendarioServlet?cancha="+cadena
                document.frmConsulta.method="post";
                document.frmConsulta.submit();

            }
        </script>
        <% String fecha =(String) request.getAttribute("fecha");
        if (fecha == null)
            fecha="18/02/2010";

%>
<c:set var="color" value="odd"/>
    </head>
    <body>
        <div id="menu">
            <ul>
                <li><a href="bienvenida.jsp" accesskey="1" title="">Inicio</a></li>
                <li><a href="disponibilidad.jsp" accesskey="2" title="">Disponibilidad</a></li>
                <li><a href="index.jsp" accesskey="5" title="">Salir</a></li>
            </ul>
        </div>
        <!-- end #menu -->
        <div id="header">
            <h1>Reserva de canchas </h1>
            <h2>Disponibilidad</h2>
        </div>
        <!-- end #header -->
        <div id="wrapper">
            <div id="content">

                <form action="DisponibilidadServlet" method="post"  name="frmConsulta">
                    <table border="1">
                        <tr>
                            <td>Ingrese la fecha </td>

                            <td><input name="txtFecha" type="text" class="Texto1"  value="<%=fecha%>" size="11" maxlength="10" onKeyPress="javascript:onKeyPressFecha(this);" readonly /><A HREF="#" onClick="cal2.select(document.frmConsulta.txtFecha,'anchor3','dd/MM/yyyy'); return false;" TITLE="cal2.select(document.frmConsulta.txtFecha,'anchor3','dd/MM/yyyy'); return false;" NAME="anchor3" ID="anchor3">
                                    <img align="middle" src="<%=request.getContextPath()%>/images/calendar.gif" border="0"/></A>
                            </td>

                            <td> <input  type="submit"  name="btnConsultar" value="Consultar" /></td>
                        </tr>
                    </table>
                    </br>


                    <h2>Canchas disponibles</h2>
<div id="itsthetable">
                    <table>

                           <thead>
				<tr>

                                    <th width="100"> Descripción </th>
                            <th width="100"> Tipo césped </th>
                            <th width="100"> Tamaño</th>
                            <th width="200"> Costo por hora </th>
                            <th width="100"> Calendario </th>

                        	</tr>
			</thead>
<tbody>
                        <c:forEach var="canchaDisponible" items="${canchasDisponibles}" >
                            <c:choose>
                           <c:when test="${color == 'row1'}"><tr class="odd"><c:set var="color" value="row2"/></c:when>
                               <c:otherwise>
                                <tr>
                               <c:set var="color" value="row1"/>
                             </c:otherwise>
                           </c:choose>


                                <th scope="row" id="r100"> ${canchaDisponible.cancha.descripcion}</th>
                                <td> ${canchaDisponible.cancha.tipoCesped}</td>
                                <td> ${canchaDisponible.cancha.tamano}</td>
                                <td align="right"> ${canchaDisponible.cancha.costoHora}</td>
                                <td> <a  href="JavaScript:prueba('${canchaDisponible.cancha.descripcion}')"> Ver calendario </a></td>


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
        <div id="footer">
            <p id="legal">Copyright &copy; 2010 . Desarrollado por <a href="http://www.freecsstemplates.org/">Nosotros</a></p>
            <p id="brand">Servicio On-Line </p>
        </div>
        <!-- end #footer -->
    </body>
</html>
