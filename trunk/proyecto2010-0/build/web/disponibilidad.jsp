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
        <link href="default.css" rel="stylesheet" type="text/css" />
    <SCRIPT LANGUAGE=javascript src="script/CalendarPopup.js"></SCRIPT>
<script LANGUAGE="JavaScript" ID="js2">
		var cal2 = new CalendarPopup();
		cal2.showYearNavigation();

</script>

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
                           
                            <td><input name="txtFecha" type="text" class="Texto1"  value="" size="11" maxlength="10" onKeyPress="javascript:onKeyPressFecha(this);" readonly ><A HREF="#" onClick="cal2.select(document.frmConsulta.txtFecha,'anchor3','dd/MM/yyyy'); return false;" TITLE="cal2.select(document.frmConsulta.txtFecha,'anchor3','dd/MM/yyyy'); return false;" NAME="anchor3" ID="anchor3">
                   <img align="middle" src="<%=request.getContextPath()%>/images/calendar.gif" border="0"></A>
					</td>

                            <td> <input  type="submit"  name="btnConsultar" value="Consultar" /></td>
                        </tr>
                    </table>
                    </br>


                    <h2>Canchas disponibles</h2>

                    <table width="100%" border="1" bordercolordark="#FFFFFF" bordercolorlight="#FFFFFF">

                        <tr align="center" bordercolor="#669966">
                            <td> <b>Reserva</b> </td>
                            <td> <b>Descripci&oacute;n</b> </td>
                            <td> <b>Fecha </b> </td>
                            <td> <b>Hora Inicio</b></td>
                            <td> <b>Hora fin </b></td>
                                            
                        </tr>

    

                        <c:forEach var="canchaDisponible" items="${canchasDisponibles}" >
                            <tr align="center" bordercolor="#CDEA99">
                                <td> <input type="submit" value="Reservar" name="btnReservar"/></td>
                                <td> ${canchaDisponible.cancha.descripcion}</td>
                                <td> ${canchaDisponible.fechaDisponible} </td>
                                <td> ${canchaDisponible.horaInicio}:00</td>
                                <td> ${canchaDisponible.horaFin}:00</td>
                                



                            </tr>
                        </c:forEach>



                    </table>
                </form>
                <!--

                                <table border="1" width="100%">
                                    <thead>
                                        <tr>
                                            <th>Lunes</th>
                                            <th>Martes</th>
                                            <th>Miércoles</th>
                                            <th>Jueves</th>
                                            <th>Viernes</th>
                                            <th>Sábado</th>
                                            <th>Domingo</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>08:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>09:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>10:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>11:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>12:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>13:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>14:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>15:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>16:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>17:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>18:00</td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                    </tbody>

                </table>
                -->





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
