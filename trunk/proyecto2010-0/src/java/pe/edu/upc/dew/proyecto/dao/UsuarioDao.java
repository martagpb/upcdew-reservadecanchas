/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.dao;

import pe.edu.upc.dew.proyecto.model.Usuario;

/**
 *
 * @author usuario
 */
public class UsuarioDao {

    public Usuario getUsuarioPorUsername (String username){
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setUsername("mchuquillanqui");
        usuario.setPassword("123456");
        usuario.setNombre("Marco Antonio");
        usuario.setApellidoPaterno("Chuquillanqui");
        usuario.setApellidoMaterno("Meza");
        return usuario;
    }

}
