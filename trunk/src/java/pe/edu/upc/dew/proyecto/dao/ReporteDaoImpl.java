/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import java.util.List;
import java.util.ArrayList;
import pe.edu.upc.dew.proyecto.model.Cancha;
import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import pe.edu.upc.dew.proyecto.model.Reporte;

/**
 *
 * @author T13087
 */
public class ReporteDaoImpl implements ReporteDao {

    public List<Reporte> obtenerCanchasTop(String fechaI, String fechaF) {
        Reporte reporte = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        List<Reporte> canchasTop = null;
        try {
            canchasTop = new ArrayList<Reporte>();
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();

                    System.out.println(" select count(res.codCancha) as TOTAL, " +
                    "           can.codcancha as CODCANCHA, " +
                    "           can.descripcion as DESCRIPCION, " +
                    "            can.tipocesped as TIPOCESPED, " +
                    "            can.costohora as COSTOHORA " +
                    "       from tb_cancha can inner join  tb_reserva res on can.codCancha = res.codCancha " +
                    "   where trunc(res.fechaReserva)>='" + fechaI + "' and " +
                    "       trunc(res.fechaReserva)<='" + fechaF + "'  " +
                    "       group by can.codcancha, can.descripcion, can.tipoCesped, can.costoHora order by 1 desc ");

            rs = st.executeQuery(" select count(res.codCancha) as TOTAL, " +
                    "           can.codcancha as CODCANCHA, " +
                    "           can.descripcion as DESCRIPCION, " +
                    "            can.tipocesped as TIPOCESPED, " +
                    "            can.costohora as COSTOHORA " +
                    "       from tb_cancha can inner join  tb_reserva res on can.codCancha = res.codCancha " +
                    "   where trunc(res.fechaReserva)>='" + fechaI + "' and " +
                    "       trunc(res.fechaReserva)<='" + fechaF + "'  " +
                    "       group by can.codcancha, can.descripcion, can.tipoCesped, can.costoHora order by 1 desc ");

            while (rs.next()) {

                reporte = new Reporte();
                reporte.setCodCancha(rs.getInt("CODCANCHA"));
                reporte.setDescripcion(rs.getString("DESCRIPCION"));
                reporte.setTipoCesped(rs.getString("TIPOCESPED"));
                reporte.setNroReservas(rs.getInt("TOTAL"));
                reporte.setCostoHora(rs.getDouble("COSTOHORA"));


                canchasTop.add(reporte);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
        return canchasTop;
    }
}
