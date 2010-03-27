/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.proyecto.service;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.dew.proyecto.dao.CanchaDao;

import pe.edu.upc.dew.proyecto.dao.DisponibilidadDao;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Disponibilidad;

/**
 *
 * @author usuario
 */
public class DisponibilidadServiceImpl implements DisponibilidadService{

    private Logger logger = Logger.getLogger(DisponibilidadServiceImpl.class);
    @Autowired

    private DisponibilidadDao disponibilidadDao;




    public void setDisponibilidadDao(DisponibilidadDao disponibilidadDao) {
        this.disponibilidadDao = disponibilidadDao;
    }
}
