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
        <title>Calendario por cancha</title>
        <link href="<%=request.getContextPath()%>/default.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/mintgreen.css" type="text/css"/>
        <script type="text/javascript" src="script/js/prototype.js"> </script>
        <script src="script/js/scriptaculous.js" type="text/javascript"> </script>
        <script src="script/js/effects.js" type="text/javascript"> </script>
        <script type='text/javascript' src='../dwr/engine.js'> </script>
        <script type='text/javascript' src='../dwr/util.js'> </script>
        <script type='text/javascript' src='../dwr/interface/ReservaDaoImpl.js'> </script>
        <script src="calendario.js" type="text/javascript"></script>
        <SCRIPT LANGUAGE=javascript src="script/CalendarPopup.js"></SCRIPT>

        <script LANGUAGE="JavaScript">
            flag=1
            codigoIni="";
            codigoFin="";
            costoXhora="${cancha.costoHora}";
            codCancha="${cancha.codCancha}";
            horaFin=0;
            horaIni=0;
            function reservar(){
             
                ReservaDaoImpl.registrarReserva(codigoIni.substring(0,10), document.getElementById("txtHoraIni").value, document.getElementById("txtHoraFin").value,  codCancha, document.getElementById("txtTotal").value,  1);
                horaIni=document.getElementById("txtHoraIni").value;
                horaFin=document.getElementById("txtHoraFin").value;
                alert("Se registro reserva")
                for(i=eval(horaIni);i<=eval(horaFin);i++){
                    document.getElementById(codigoIni.substring(0,10)+i).bgColor="#993300";
                }
   
    
                document.getElementById("transparencia").style.display="none";

            }

            function omO(e){   // on mouse over
                if(!e.target)                        // asi para IE
                    celd=event.srcElement;           //paso evento para quitarme el problema del Navegador,
                else
                    celd=e.target;

                //    &&
                if(flag==0  ){
                    if(celd.bgColor=='#FFFFFF' )   {             // asi para FF Mozilla
                        //esto lo que hace es decirte que celda disparo el evento y guarda su id en el indice que es tambien igual al incide de los arreglos
                        celd.bgColor='#3333FF';}

                };
            }

            function omOt(e){
                //  on mouse out funciona igual que el otro pero le devuelve los colores viejos al salir de la celda
                if (flag==0){

                    flag=1;


                    if(!e.target)
                        celd=event.srcElement;
                    else
                        celd=e.target;
       
                    document.getElementById("transparencia").style.display="block";

                    codigoFin=celd.id;
                    horaIni=codigoIni.substring(10,12);
                    horaFin=codigoFin.substring(10,12);
                    document.getElementById("TxtFecha").value=codigoIni.substring(0,10);
                    if(eval(horaFin)>eval(horaIni)){

                        document.getElementById("txtHoraIni").value=codigoIni.substring(10,12);
                        document.getElementById("txtHoraFin").value=codigoFin.substring(10,12);
                        document.getElementById("txtCostoXhora").value=costoXhora;
                        document.getElementById("txtTotal").value=costoXhora*(codigoFin.substring(10,12)-codigoIni.substring(10,12));
                    }else{
                        document.getElementById("txtHoraIni").value=codigoFin.substring(10,12);
                        document.getElementById("txtHoraFin").value=codigoIni.substring(10,12);
                        document.getElementById("txtCostoXhora").value=costoXhora;
                        document.getElementById("txtTotal").value=costoXhora*(eval(codigoIni.substring(10,12))-eval(codigoFin.substring(10,12)));
                    }
                    Effect.SlideDown('transparenciaMensaje1');
                };

            }

            function closeDashboard(){
                flag=1;
                document.getElementById("transparencia").style.display="none";
                horaIni=document.getElementById("txtHoraIni").value;
                horaFin=document.getElementById("txtHoraFin").value;

                for(i=eval(horaIni);i<=eval(horaFin);i++){
                    document.getElementById(codigoIni.substring(0,10)+i).bgColor="#FFFFFF";
                };
   
            }

            function omD(e){

                if(!e.target)
                    celd=event.srcElement;
                else
                    celd=e.target;
              
                    
                if(celd.bgColor=='#FFFFFF' )   {
                    flag=0;
                    codigoIni=celd.id;
                    //arr_de_flags[indice]=! arr_de_flags[indice];            // si tenia un false, ahora tiene un true, si tenia un true ahora tiene un false, de todos modos solo tenes esos 2 estados
                    celd.bgColor='#3333FF';                     // le devuelvo los colores nuevos. Que son los que tenia cuando entraste, o sea, el del On mouse over

                };


            }
        </script>


        <style type="text/css">
            <!--
            #Layer1 {
                position:absolute;
                left:179px;
                top:155px;
                width:789px;
                height:346px;
                z-index:1;
                background-color: #FFFFFF;
            }
            -->
        </style>
    </head>

    <%
            pe.edu.upc.dew.proyecto.model.Cancha cancha = (pe.edu.upc.dew.proyecto.model.Cancha) request.getAttribute("cancha");

    %>

</head>
<body>

    <div id="transparencia" style="background:#000;top:0;left:0;height:850px;position:absolute;display:none;z-index:1000;width:100%;	opacity:0.7;" >
        <img  src="images/close_button.png" width="59" height="19" title="Cerrar Dashboard" id="close_button1" onclick="closeDashboard();" />ZDFSADASDASDASD
        <div id="Layer1">
            <div id="transparenciaMensaje1" style="display:none; width:472px; height:280px; background:#ccc; text-align:center;" >
                <form id="form1" name="form1" method="post" action="">
                    <table width="472" height="280" border="1">
                        <tr>
                            <td colspan="3">Reserva</td>
                        </tr>
                        <tr>
                            <td width="79" height="43">Fecha</td>
                            <td width="168">
                                <label>
                                    <input name="TxtFecha" type="text" id="TxtFecha" disabled="disabled" />
                                </label>    </td>
                            <td width="143" rowspan="5"><label>
                                    <input name="imageField" type="image" src="<%=request.getContextPath()%>/images/Maracana13.jpg" align="top" />
                                </label></td>
                        </tr>
                        <tr>
                            <td height="42">Hora Incio </td>
                            <td><label>
                                    <input name="txtHoraIni" type="text" id="txtHoraIni" disabled="disabled"/>
                                </label></td>
                        </tr>
                        <tr>
                            <td height="42">Hora de Fin </td>
                            <td><input name="txtHoraFin" type="text" id="txtHoraFin" disabled="disabled" /></td>
                        </tr>
                        <tr>
                            <td height="42">Costo X Hora  </td>
                            <td><input name="txtCostoXhora" type="text" id="txtCostoXhora" disabled="disabled" /></td>
                        </tr>
                        <tr>
                            <td height="42">Total  </td>
                            <td><input name="txtTotal" type="text" id="txtTotal" disabled="disabled" /></td>
                        </tr>
                        <tr>
                            <td><label>
                                    <input name="btnGrabar" type="button" id="btnGrabar" value="Grabar" onclick="JavaScript:reservar()" />

                                </label>
                            </td>
                            <td><label>
                                    <input name="btnCancelar" type="button" id="btnCancelar" value="Cancelar" onclick="closeDashboard();"  />
                                </label></td>
                            <td>&nbsp;</td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>

    <%@ include file="header.jsp" %>
    <!-- end #menu -->
    <div id="header">
        <h1>Reserva de canchas </h1>
        <h2>Calendario de disponibilidad</h2>
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
                                    <th >${dias.dia} <br>  ${dias.fecha} </th>

                                </c:forEach>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (int i = 8; i < 9; i++) {%>
                            <tr>

                                <td rowspan="16">
                                    <table>
                                        <% for (int j = 8; j < 24; j++) {%>

                                        <tr>
                                            <td height="19"> <%=j%>:00</td>
                                        </tr>

                                        <%}%>
                                    </table>
                                </td>


                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(1)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(1)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(2)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(2)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(3)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(3)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(4)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(4)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(5)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(5)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(6)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(6)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                            </tr>
                            <%}%>

                            <% for (int i = 9; i < 24; i++) {%>
                            <tr>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(0)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(1)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(1)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(2)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(2)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(3)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(3)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(4)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(4)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(5)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(5)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                                <td height="19" id="<%=((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(6)).getFecha() + "" + i%>" onMouseDown="omD(event,this)" onMouseOver="omO(event,this)" onmouseup="omOt(event,this)" <% if (cancha.obtenerDisponibilidad(((pe.edu.upc.dew.proyecto.model.Dia) cancha.getListDias().get(6)).getFecha(), i).equals("Reservado")) {%>  bordercolor="#ECE9D8"  bgcolor="#993300"<%} else {%>  bgcolor="#FFFFFF"   <%}%>></td>
                            </tr>
                            <%}%>


                        </tbody>
                    </table>
                </div>

            </form>
            <table>
                <br>
                <table>
                    <tr>
                        <td bordercolor="#ECE9D8"  bgcolor="#993300">
                            &ensp;
                        </td>
                        <td>
                            Reservado
                        </td>
                    </tr>
                    <tr>
                        <td>
                            &ensp;
                        </td>
                        <td>
                            Disponible
                        </td>
                    </tr>

                </table>
                <thead>
                    <tr>
                        <td> <a  href="disponibilidad.htm"> Regresar </a></td>

                    </tr>
                </thead>
            </table>


            <div style="clear: both;"></div>
            <h1>&nbsp;</h1>
        </div>
    </div>
    <!-- end #content -->
    <%@ include file="footer.jsp" %>
    <!-- end #footer -->
</body>
</html>
