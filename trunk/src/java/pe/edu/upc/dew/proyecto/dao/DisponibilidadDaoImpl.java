/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Disponibilidad;
import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Marco Antonio
 */
public class DisponibilidadDaoImpl implements DisponibilidadDao {

    private Logger logger = Logger.getLogger(DisponibilidadDaoImpl.class);

    public List<Cancha> obtenerCanchasDisponibles(String fecha) {

        logger.debug("Inicio ObtenerCanchasDisponibles");
        System.out.println("Inicio ObtenerCanchasDisponibles");
        Cancha cancha = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
         List<Cancha> canchasDisponibles = null;
        try {
            canchasDisponibles = new ArrayList<Cancha>();
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();

            rs = st.executeQuery("select distinct(can.descripcion) as DESCRIPCION," +
                    "                cal.codcancha as CODCANCHA," +
                    "                can.tipocesped as TIPOCESPED," +
                    "                can.tamano as TAMANO," +
                    "                can.estado as ESTADO," +
                    "                can.costohora as COSTOHORA, " +
                    "                to_char(cal.fecha,'DD/MM/YYYY') as FECHA" +
                    " from tb_calendario cal inner join " +
                    "tb_cancha can " +
                    "on cal.codcancha=can.codcancha " +
                    "where cal.estado='Disponible'" +
                    " and to_char(cal.fecha,'DD/MM/YYYY')='" + fecha + "'" +
                    " order by 1");

            System.out.println("select distinct(can.descripcion) as DESCRIPCION," +
                    "                cal.codcancha as CODCANCHA," +
                    "                can.tipocesped as TIPOCESPED," +
                    "                can.tamano as TAMANO," +
                    "                can.estado as ESTADO," +
                    "                can.costohora as COSTOHORA, " +
                    "                cal.fecha as FECHA" +
                    " from tb_calendario cal inner join " +
                    "tb_cancha can " +
                    "on cal.codcancha=can.codcancha " +
                    "where cal.estado='Disponible'" +
                    " and to_char(cal.fecha,'DD/MM/YYYY')='" + fecha + "'" +
                    " order by 1");

            while (rs.next()) {

                cancha = new Cancha();
                cancha.setCodCancha(rs.getInt("CODCANCHA"));
                cancha.setDescripcion(rs.getString("DESCRIPCION"));
                cancha.setTipoCesped(rs.getString("TIPOCESPED"));
                cancha.setCostoHora(rs.getDouble("COSTOHORA"));
                cancha.setTamano(rs.getString("TAMANO"));
                cancha.setEstado(rs.getInt("ESTADO"));
                cancha.setFechaDisponible(rs.getString("FECHA"));


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
}
