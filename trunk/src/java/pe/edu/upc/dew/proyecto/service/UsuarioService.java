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
public interface UsuarioService {

    public Usuario getUsuarioPorUsername(String username);

}
