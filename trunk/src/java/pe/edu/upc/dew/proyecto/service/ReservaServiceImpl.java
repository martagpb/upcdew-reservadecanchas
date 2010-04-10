/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.service;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.dew.proyecto.dao.CanchaDao;

import pe.edu.upc.dew.proyecto.dao.ReservaDao;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Reserva;

/**
 *
 * @author usuario
 */
public class ReservaServiceImpl implements ReservaService {

    private Logger logger = Logger.getLogger(ReservaServiceImpl.class);
    @Autowired
    private ReservaDao reservaDao;


    public List<Reserva> obtenerReservas() {
        return reservaDao.obtenerReservas();
    }

    public void setReservaDao(ReservaDao reservaDao) {
        this.reservaDao = reservaDao;
    }
}
