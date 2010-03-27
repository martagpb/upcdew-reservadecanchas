/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.dao;

import pe.edu.upc.dew.proyecto.model.Usuario;
import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author usuario
 */
public class UsuarioDaoImpl implements UsuarioDao {

    private Logger logger = Logger.getLogger(UsuarioDaoImpl.class);

    public Usuario getUsuarioPorUsername(String username) {
        logger.debug("Inicio getUsuario");
        System.out.println("Entra a dao Usuario");
        Usuario usuario = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = ConnectionUtils.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("select * from tb_usuario where username='" + username + "'");
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("USERID"));
                usuario.setUsername(rs.getString("USERNAME"));
                usuario.setPassword(rs.getString("PASSWORD"));
                usuario.setNombre(rs.getString("NOMBRE"));
                usuario.setApellidoPaterno(rs.getString("APELLIDOPATERNO"));
                usuario.setApellidoMaterno(rs.getString("APELLIDOMATERNO"));
               // usuario.set(rs.getInt("IDROL"));


            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtils.closeResultSet(rs);
            ConnectionUtils.closeStatement(st);
            ConnectionUtils.closeConnection(connection);
        }
        return usuario;
    }
}
