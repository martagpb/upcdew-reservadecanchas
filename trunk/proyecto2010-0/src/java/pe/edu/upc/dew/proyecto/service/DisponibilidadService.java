/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.service;

import java.util.List;
import pe.edu.upc.dew.proyecto.dao.CanchaDao;

import pe.edu.upc.dew.proyecto.dao.DisponibilidadDao;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Disponibilidad;


/**
 *
 * @author usuario
 */
public class DisponibilidadService {

    private DisponibilidadDao disponibilidadDao;

    public DisponibilidadService(){
        this.disponibilidadDao= new DisponibilidadDao();
    }


    public List<Disponibilidad> obtenerCanchasDisponibles(String fecha){
        System.out.println("Entro a Disponibilidadservice");
        return disponibilidadDao.obtenerCanchasDisponibles(fecha);
    }

}
