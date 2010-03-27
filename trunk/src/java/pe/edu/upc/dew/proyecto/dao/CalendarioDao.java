/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.proyecto.dao;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.proyecto.model.Calendario;
import pe.edu.upc.dew.proyecto.model.Cancha;
import pe.edu.upc.dew.proyecto.model.Dia;
import pe.edu.upc.dew.proyecto.model.Hora;

/**
 *
 * @author luigi
 */
public interface CalendarioDao {


   public Cancha obtenerCalendario(String nomCancha, String fecha);

 
}
