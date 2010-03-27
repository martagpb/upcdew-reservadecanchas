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
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/mintgreen.css" type="text/css"/>
        <script src="script/js/scriptaculous.js" type="text/javascript"></script>
        <script src="script/js/effects.js" type="text/javascript"></script>
        <SCRIPT LANGUAGE=javascript src="script/CalendarPopup.js"></SCRIPT>
        <script LANGUAGE="JavaScript" >

            function oculta(variable){

                new Effect.Fold(document.getElementById(variable));
            }
            function mostrar(variable){
                new Effect.Grow(document.getElementById(variable));
            }
        </script>
    </script>


    <%
            pe.edu.upc.dew.proyecto.model.Cancha cancha = (pe.edu.upc.dew.proyecto.model.Cancha) request.getAttribute("cancha");

    %>

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

            <form action="calendario.htm" method="post"  name="frmConsulta">
                <h2>Disponibilidad en la semana de ${cancha.descripcion} </h2>
                <div id="itsthetable">

                    <table>

                        <thead>
                            <tr>

                                <th width="70">&nbsp;</th>
                                <c:forEach var="dias" items="${cancha.listDias}" >
                                    <th >${dias.dia}</th>
                                </c:forEach>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (int i = 8; i < 24; i++) {%>
                            <tr>
                                <td ><%=i%>:00</td>
                                <td  <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>><%= cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i)%></td>
                                <td  <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>><%= cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(1)).getFecha(), i)%></td>
                                <td  <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>><%= cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(2)).getFecha(), i)%></td>
                                <td  <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>><%= cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(3)).getFecha(), i)%></td>
                                <td  <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>><%= cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(4)).getFecha(), i)%></td>
                                <td  <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>><%= cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(5)).getFecha(), i)%></td>
                                <td  <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>><%= cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(6)).getFecha(), i)%></td>
                            </tr>
                            <%}%>
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
