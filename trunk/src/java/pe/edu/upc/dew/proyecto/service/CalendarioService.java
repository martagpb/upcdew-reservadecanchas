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
public interface CalendarioService {

    public Cancha obtenerCalendario(String nomCancha, String fecha);
}
