/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.service;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.dew.proyecto.dao.CalendarioDao;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Dia;
import pe.edu.upc.dew.proyecto.model.Hora;
import java.util.ArrayList;

/**
 *
 * @author luigi
 */
public class CalendarioServiceImpl implements CalendarioService {

    private Logger logger = Logger.getLogger(CalendarioServiceImpl.class);
    @Autowired
    private CalendarioDao calendarioDao;

    public void setCalendarioDao(CalendarioDao calendarioDao) {
        this.calendarioDao = calendarioDao;
    }

    public List <Calendario> obtenerCalendario(int codCancha, String fecha) {

        return calendarioDao.obtenerCalendario(codCancha, fecha);
    } 

     public List<Dia> obtenerDias(String fecha){
         return calendarioDao.obtenerDias(fecha);
     }
} 