/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.service;

import pe.edu.upc.dew.proyecto.dao.UsuarioDao;
import pe.edu.upc.dew.proyecto.model.Usuario;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
public class UsuarioServiceImpl implements UsuarioService {

    private Logger logger = Logger.getLogger(UsuarioServiceImpl.class);
    @Autowired
    private UsuarioDao usuarioDao;

    public Usuario getUsuarioPorUsername(String username) {
        System.out.println("Entra a userservice");
        logger.debug("Inicio");
        return usuarioDao.getUsuarioPorUsername(username);
    }

    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
}


