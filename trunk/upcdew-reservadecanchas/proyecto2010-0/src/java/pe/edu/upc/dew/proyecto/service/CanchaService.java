/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.service;

import java.util.List;
import pe.edu.upc.dew.proyecto.dao.CanchaDao;

import pe.edu.upc.dew.proyecto.model.Cancha;


/**
 *
 * @author usuario
 */
public class CanchaService {

    private CanchaDao canchaDao;

    public CanchaService(){
        this.canchaDao= new CanchaDao();
    }
    
    public List<Cancha> obtenerCanchas(){
        return canchaDao.obtenerCanchas();
    }

}
