/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.service;

import java.util.List;
import pe.edu.upc.dew.proyecto.dao.CanchaDao;

import pe.edu.upc.dew.proyecto.dao.ReservaDao;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Reserva;


/**
 *
 * @author usuario
 */
public class ReservaService {

    private ReservaDao reservaDao;

    public ReservaService(){
        this.reservaDao= new ReservaDao();
    }
    
    public List<Reserva> obtenerCanchas(){
        return reservaDao.obtenerReservas();
    }

}
