/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Dia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import pe.edu.upc.dew.proyecto.model.Hora;

/**
 *
 * @author usuario
 */
public class CanchaDaoImpl implements CanchaDao {

    private Logger logger = Logger.getLogger(CanchaDaoImpl.class);

    public Cancha obtenerCancha(int codigo) {
        logger.debug("Inicio ObtenerCanchas");
        Cancha cancha = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("select * from tb_cancha where CODCANCHA='" + codigo + "'");
            if (rs.next()) {
                cancha = new Cancha();
                cancha.setCodCancha(rs.getInt("CODCANCHA"));
                cancha.setDescripcion(rs.getString("DESCRIPCION"));
                cancha.setTipoCesped(rs.getString("TIPOCESPED"));
                cancha.setCostoHora(rs.getDouble("COSTOHORA"));
                cancha.setTamano(rs.getString("TAMANO"));
                cancha.setListHoras(obtenerHoras());
                cancha.setEstado(1);
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

    public List<Cancha> obtenerCanchasDisponibles(String fecha) {

        logger.debug("Inicio ObtenerCanchasDisponibles");
        Cancha cancha;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        List<Cancha> canchasDisponibles = new ArrayList<Cancha>();
        try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();

            rs = st.executeQuery("select distinct(can.descripcion) as DESCRIPCION," +
                    "                cal.codcancha as CODCANCHA," +
                    "                can.tipocesped as TIPOCESPED," +
                    "                can.tamano as TAMANO," +
                    "                can.estado as ESTADO," +
                    "                can.costohora as COSTOHORA" +
                    " from tb_calendario cal inner join " +
                    "tb_cancha can " +
                    "on cal.codcancha=can.codcancha " +
                    "where cal.estado='Disponible'" +
                    " and trunc(cal.fecha)='" + fecha + "'" +
                    " order by 1");

            while (rs.next()) {

                cancha = new Cancha();
                cancha.setCodCancha(rs.getInt("CODCANCHA"));
                cancha.setDescripcion(rs.getString("DESCRIPCION"));
                cancha.setTipoCesped(rs.getString("TIPOCESPED"));
                cancha.setCostoHora(rs.getDouble("COSTOHORA"));
                cancha.setTamano(rs.getString("TAMANO"));
                cancha.setEstado(rs.getInt("ESTADO"));
                canchasDisponibles.add(cancha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
        return canchasDisponibles;
    }

    public List<Calendario> obtenerCalendario(int codcancha, String fecha) {
        logger.debug("Inicio ObtenerCalendario");

        Calendario calendario = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        List<Calendario> calendarios = new ArrayList<Calendario>();
        try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery(" select * from tb_calendario " +
                    "  where codcancha='" + codcancha + "'" +
                    " and trunc(fecha)>='" + fecha + "'" +
                    " and rownum  < 106 " +
                    " order by fecha, hora");

            while (rs.next()) {
                calendario = new Calendario();
                calendario.setEstado(rs.getString("estado"));
                calendario.setFecha(rs.getString("fecha"));
                calendario.setHora(rs.getInt("hora"));
                calendarios.add(calendario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
        return calendarios;
    }

    public List<Hora> obtenerHoras() {
        logger.debug("Inicio ObtenerHoras");

        Hora hora = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        List<Hora> horas = new ArrayList<Hora>();
        try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery(" select * from tb_hora ");

            while (rs.next()) {
                hora = new Hora();
                hora.setHora(rs.getInt("hora"));
                horas.add(hora);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
        return horas;
    }

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
            rs = st.executeQuery(" select fecha, " +
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
}
