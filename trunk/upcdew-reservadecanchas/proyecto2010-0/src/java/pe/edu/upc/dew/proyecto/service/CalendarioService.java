/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.service;

import pe.edu.upc.dew.proyecto.dao.CalendarioDao;
import pe.edu.upc.dew.proyecto.model.Cancha;

/**
 *
 * @author luigi
 */
public class CalendarioService {
 private CalendarioDao calendarioDao;

    public Cancha obtenerCalendario(String nomCancha, String fecha) {
        
         return calendarioDao.obtenerCalendario(nomCancha,fecha);
    }

    public CalendarioService(){
        this.calendarioDao= new CalendarioDao();
    }





}
