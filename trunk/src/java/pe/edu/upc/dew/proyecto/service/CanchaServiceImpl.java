/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.service;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.dew.proyecto.dao.CanchaDao;

import pe.edu.upc.dew.proyecto.model.Cancha;

/**
 *
 * @author usuario
 */
public class CanchaServiceImpl implements CanchaService {

    private Logger logger = Logger.getLogger(CanchaServiceImpl.class);
    @Autowired
    private CanchaDao canchaDao;

 
    public List<Cancha> obtenerCanchasDisponibles(String fecha) {
        System.out.println("Entro a CanchaServiceImpl");
        return canchaDao.obtenerCanchasDisponibles(fecha);
    }

    public void setCanchaDao(CanchaDao canchaDao) {
        this.canchaDao = canchaDao;
    }

    public Cancha obtenerCancha(int codigo) {
        return canchaDao.obtenerCancha(codigo);
    }
}
