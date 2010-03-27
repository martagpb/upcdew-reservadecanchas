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
    private CanchaDao canchaDao;

    public void setCanchaDao(CanchaDao canchaDao) {
        this.canchaDao = canchaDao;
    }
    public Cancha obtenerCalendario(String nomCancha, String fecha) {
        logger.debug("Inicio obtenerCalendario");




        Cancha cancha = obtenerCancha(nomCancha);
        cancha.setListDias(obtenerListaDias( fecha));

        return cancha;
    }


     private Cancha obtenerCancha(String codCancha) {
        logger.debug("Inicio obtenerCancha");
       Cancha cancha = new Cancha();
       Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

           try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("select * from TB_CANCHA where CODCANCHA='" + codCancha + "'");
            if (rs.next()) {
                cancha = new Cancha();
                cancha.setCodCancha(rs.getInt("CODCANCHA"));
                cancha.setDescripcion(rs.getString("DESCRIPCION"));
                }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
          return cancha;
       }

     private ArrayList<Dia> obtenerListaDias(String fecha) {
        logger.debug("Inicio obtenerCancha");

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Dia> lista = new ArrayList();
           try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();
            System.out.println("select  to_char(FECHA,'DD/MM/YYYY') FECHA ,FEC_DIA_SEMANA from tb_fecha where FECHA between to_date('" + fecha + "','DD/MM/YYYY') and (to_date('"+ fecha +"','DD/MM/YYYY')+7) ");
            rs = st.executeQuery("select  to_char(FECHA,'DD/MM/YYYY') FECHA ,FEC_DIA_SEMANA from tb_fecha where FECHA between to_date('" + fecha + "','DD/MM/YYYY') and (to_date('"+ fecha +"','DD/MM/YYYY')+7) ");
           
            while (rs.next()) {
                Dia dia = new Dia();
                dia.setDia(rs.getString("FEC_DIA_SEMANA"));
                dia.setFecha(rs.getString("FECHA"));
                lista.add(dia);
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
     private ArrayList<Calendario> obtenerListaCalendario(String codCancha,String fecha) {
        logger.debug("Inicio obtenerCancha");

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Calendario> lista = new ArrayList();
           try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("select   to_char(FECHA,'DD/MM/YYYY') FECHA ,  HORA " +
                    " FROM tb_calendario where CANCHA='"+codCancha+"' AND  FECHA between to_date('" + fecha + "','DD/MM/YYYY') and (to_date('"+ fecha +"','DD/MM/YYYY')+7)' " +
                    " AND ESTADO<>'Disponible'");
            while (rs.next()) {
                Calendario cal = new Calendario();
                cal.setFecha(rs.getString("FECHA"));
                cal.setHora(rs.getInt("HORA"));
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
