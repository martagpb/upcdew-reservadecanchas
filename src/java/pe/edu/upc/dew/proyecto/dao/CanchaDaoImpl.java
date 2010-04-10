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
import java.sql.CallableStatement;
import java.sql.Types;

/**
 *
 * @author usuario
 */
public class CanchaDaoImpl implements CanchaDao {

    private Logger logger = Logger.getLogger(CanchaDaoImpl.class);

    public Cancha obtenerCancha(int codigo) {
        logger.debug("Inicio ObtenerCancha");
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

    public List<Cancha> obtenerCanchas() {

        logger.debug("Inicio ObtenerCanchas");
        Cancha cancha = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        List<Cancha> canchas = new ArrayList<Cancha>();
        try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();

            rs = st.executeQuery("select CODCANCHA as CODCANCHA, " +
                    "       DESCRIPCION as DESCRIPCION, " +
                    "       TIPOCESPED as TIPOCESPED, " +
                    "       COSTOHORA as COSTOHORA, " +
                    "       TAMANO as TAMANO, " +
                    "       ESTADO as ESTADO " +
                    " from tb_cancha " +
                    " where estado=1" +
                    " order by 1");

            while (rs.next()) {

                cancha = new Cancha();
                cancha.setCodCancha(rs.getInt("CODCANCHA"));
                cancha.setDescripcion(rs.getString("DESCRIPCION"));
                cancha.setTipoCesped(rs.getString("TIPOCESPED"));
                cancha.setCostoHora(rs.getDouble("COSTOHORA"));
                cancha.setTamano(rs.getString("TAMANO"));
                cancha.setEstado(rs.getInt("ESTADO"));
                canchas.add(cancha);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
        return canchas;
    }



    public int registrarCancha(Cancha cancha) {
        logger.debug("Inicio RegistrarCancha");
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        CallableStatement cas = null;
        try {
            connection = ConnectionUtils.getConnection();
            cas = connection.prepareCall("{CALL PKG_RES_CANCHA.SP_REGISTRA_CANCHA(?,?,?,?,?,?)}");
            cas.setString(1, cancha.getDescripcion());
            cas.setString(2, cancha.getTipoCesped());
            cas.setString(3, cancha.getTamano());
            cas.setDouble(4, cancha.getCostoHora());
            cas.setString(5, cancha.getDireccion());
            cas.registerOutParameter(6, Types.INTEGER);
            cas.execute();
            return cas.getInt(6);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {

            ConnectionUtils.closeConnection(connection);
            ConnectionUtils.closeCallableStatement(cas);
        }
    }

    public int modificarCancha(Cancha cancha) {
        logger.debug("Inicio RegistrarCancha");

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {

            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();

            return st.executeUpdate("update tb_cancha set descripcion='" + cancha.getDescripcion() + "'," +
                    "                     tipocesped='" + cancha.getTipoCesped() + "'," +
                    "                     tamano='" + cancha.getTamano() + "'," +
                    "                     costohora=" + cancha.getCostoHora() + "" +
                    " where codcancha='" + cancha.getCodCancha() + "'");

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
    }

    public int eliminarCancha(Cancha cancha) {
        logger.debug("Inicio EliminarCancha");
        Connection connection = null;
        CallableStatement cas = null;

        try {
            connection = ConnectionUtils.getConnection();
            cas = connection.prepareCall("{CALL PKG_RES_CANCHA.SP_ELIMINA_CANCHA(?,?)}");
            cas.setInt(1, cancha.getCodCancha());
            cas.registerOutParameter(2, Types.INTEGER);
            cas.execute();
            return cas.getInt(2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            ConnectionUtils.closeConnection(connection);
            ConnectionUtils.closeCallableStatement(cas);
        }

    }
}
