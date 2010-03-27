/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.service;

import pe.edu.upc.dew.proyecto.dao.UsuarioDao;
import pe.edu.upc.dew.proyecto.model.Usuario;

/**
 *
 * @author usuario
 */
public class UsuarioService {

    private UsuarioDao usuarioDao;

    public UsuarioService(){
        this.usuarioDao= new UsuarioDao();
    }
    
    public Usuario login(Usuario usuario){
        Usuario usuarioBD = usuarioDao.getUsuarioPorUsername(usuario.getUsername());
        if (usuario.getPassword().equals(usuarioBD.getPassword())){
            return usuario;
        }else{
            return null;
        }
    }

}
