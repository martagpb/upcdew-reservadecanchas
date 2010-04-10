/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dwr.dao;

import java.sql.CallableStatement;
import pe.edu.upc.dew.proyecto.dao.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Reserva;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import pe.edu.upc.dew.proyecto.model.Usuario;

/**
 *
 * @author usuario
 */
public class ReservaDaoImpl {

    private CanchaDao canchaDao;

    public void registrarReserva(String fecha, String horaIni, String horaFin,
            String codCancha, double montoPagar, int nroPersonas,
            HttpServletRequest request) {

        Cancha cancha = new Cancha();
        CallableStatement cas = null;
        Connection connection = null;


        HttpSession session = request.getSession();
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        try {
            connection = ConnectionUtils.getConnection();

            cas = connection.prepareCall("{CALL PKG_RES_RESERVA.SP_REGISTRA_RESERVA(?,?,?,?,?,?,?)}");
            cas.setString(1, fecha);
            cas.setString(2, horaIni);
            cas.setString(3, horaFin);
            cas.setString(4, "" + usuario.getIdUsuario());
            cas.setString(5, codCancha);
            cas.setDouble(6, montoPagar);
            cas.setInt(7, nroPersonas);
            cas.execute();

            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            ConnectionUtils.closeConnection(connection);
            ConnectionUtils.closeCallableStatement(cas);
        }
    }
}
