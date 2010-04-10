/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.model.Cancha;
import org.apache.log4j.Logger;
import pe.edu.upc.dew.proyecto.model.Dia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import pe.edu.upc.dew.proyecto.model.Hora;

/**
 *
 * @author luigi
 */
public class CalendarioDaoImpl implements CalendarioDao {

    private Logger logger = Logger.getLogger(CalendarioDaoImpl.class);
  

    public List<Dia> obtenerDias(String fecha) {
        logger.debug("Inicio ObtenerDias");
        Dia dia = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        List<Dia> dias = new ArrayList<Dia>();
        try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();
            System.out.println(" select to_char(fecha,'DD/MM/YYYY') as fecha, " +
                    "        fec_dia_semana " +
                    " from tb_fecha" +
                    " where trunc(fecha)>='" + fecha + "'" +
                    " and rownum  < 8 order by fecha");
            rs = st.executeQuery(" select to_char(fecha,'DD/MM/YYYY') as fecha, " +
                    "        fec_dia_semana " +
                    " from tb_fecha" +
                    " where trunc(fecha)>='" + fecha + "'" +
                    " and rownum  < 8 order by fecha");

            while (rs.next()) {
                dia = new Dia();
                dia.setDia(rs.getString("fec_dia_semana"));
                dia.setFecha(rs.getString("fecha"));
                dias.add(dia);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
        return dias;
    }

 
    public ArrayList<Calendario> obtenerCalendario(int codCancha, String fecha) {
             logger.debug("Inicio obtenerCalendario");

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Calendario> lista = new ArrayList();
        try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();
               rs = st.executeQuery("select   to_char(FECHA,'DD/MM/YYYY') FECHA ,  HORA, ESTADO " +
                    " FROM tb_calendario where CODCANCHA='" + codCancha + "' AND  FECHA between to_date('" + fecha + "','DD/MM/YYYY') and (to_date('" + fecha + "','DD/MM/YYYY')+7) AND ESTADO<>'Disponible' ");
            while (rs.next()) {
                Calendario cal = new Calendario();
                cal.setFecha(rs.getString("FECHA"));
                cal.setHora(rs.getInt("HORA"));
                cal.setEstado(rs.getString("ESTADO"));
                lista.add(cal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
        return lista;
    }



}
