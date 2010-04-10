<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License
-->
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>Canchas registro y modificación</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="<%=request.getContextPath()%>/default.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tables.css" type="text/css"/>
    </head>
    <body>

        <%@ include file="header.jsp" %>
        <div id="header">
            <h1>Reserva de canchas </h1>
            <h2>Registro de cancha</h2>
        </div>
        <!-- end #header -->



        <div id="wrapper">
            <div id="content">


                <form action="cancha.htm?opcion=registrarCancha" method="post"  name="frmRegistrarCancha">
                    <h2>Nueva cancha</h2>
                    <div id="itsthetable">
                        <table border="0">
                            <tr style="display:none">
                                <td></td>
                                <td><input id="txtCodigo" name="txtCodigo" type="text" class="Texto1"  size="11" maxlength="20" value="${cancha.codCancha}" /></td>
                            </tr>
                            <tr>
                                <td>Descripción </td>
                                <td><input id="txtDescripcion" name="txtDescripcion" type="text" class="Texto1"  size="11" maxlength="20" value="${cancha.descripcion}" /></td>
                            </tr>
                            <tr>
                                <td>Tipo cesped </td>
                                <td><select id="cboTipoCesped"  name="cboTipoCesped">


                                        <c:if test="${cancha.tipoCesped == null}">
                                            <option selected value="Natural"> Natural </option>
                                            <option  value="Artificial"> Artificial </option>
                                        </c:if>


                                        <c:if test="${cancha.tipoCesped == 'Artificial'}">
                                            <option value="Natural"> Natural </option>
                                            <option  selected value="Artificial"> Artificial </option>
                                        </c:if>

                                        <c:if test="${cancha.tipoCesped == 'Natural'}">
                                            <option selected value="Natural"> Natural </option>
                                            <option  value="Artificial"> Artificial </option>
                                        </c:if>



                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>Tamaño </td>
                                <td><select id="cboTamano" name="cboTamano">

                                        <c:if test="${cancha.tamano == null}">
                                            <option selected value="Grande"> Grande </option>
                                            <option  value="Mediana"> Mediana </option>
                                        </c:if>


                                        <c:if test="${cancha.tamano == 'Mediana'}">
                                            <option value="Grande"> Grande </option>
                                            <option  selected value="Mediana"> Mediana </option>
                                        </c:if>

                                        <c:if test="${cancha.tamano == 'Grande'}">
                                            <option selected value="Grande"> Grande </option>
                                            <option  value="Mediana"> Mediana </option>
                                        </c:if> 
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>Costo por hora  </td>
                                <td><input id="txtCosto" name="txtCosto" type="text" class="Texto1"  size="10" maxlength="10" value="${cancha.costoHora}"/></td>
                            </tr>
                            <tr>
                                <td> <input value="Grabar" type="submit" name="btnGrabar"/> </td>

                            </tr>

                        </table>
                    </div>
                </form>
                <br />




                <table border="1">
                    <tr>   <td> <a  href="cancha.htm?opcion=listarCancha"> Regresar </a></td> </tr>
                </table>
            </div>
        </div>
        <!-- end #content -->
        <%@ include file="footer.jsp" %>
        <!-- end #footer -->
    </body>
</html>
